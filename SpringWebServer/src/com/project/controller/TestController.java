package com.project.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.beans.StudentBean;
import com.project.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;

	@GetMapping("/test/changeHeader")
	public void mission1(HttpServletRequest request) {
		String[] userAgent = request.getHeader("user-agent").split("/");
		
		testService.gradeMission1(userAgent);
	}
	
	@GetMapping("/test/getHandleTest")
	public String mission2() {
		return "test/mission2";
	}
	
	// REST - Return JSON Data
	@PostMapping("/test/postHandleTest")
	@ResponseBody
	public Map<Integer, Object> mission3() {
		Map<Integer, Object> priceTags = new HashMap<>();
		
		Map<String, Object> priceTag1 = new HashMap<>();
		priceTag1.put("name", "apple");
		priceTag1.put("price", 3500);
		priceTags.put(1, priceTag1);
		
		Map<String, Object> priceTag2 = new HashMap<>();
		priceTag2.put("name", "orange");
		priceTag2.put("price", 7400);
		priceTags.put(2, priceTag2);
		
		Map<String, Object> priceTag3 = new HashMap<>();
		priceTag3.put("name", "dragonfruit");
		priceTag3.put("price", 10240);
		priceTags.put(3, priceTag3);
		
		return priceTags;
	}
	
	@GetMapping(value = "/test/getImageTest", produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] mission4() throws IOException {
		InputStream is = getClass().getResourceAsStream("image2.png");
		return IOUtils.toByteArray(is);
	}
	
	@PostMapping("/test/submit_result")
	public String submitResult(HttpServletRequest request, Model model) {
		testService.gradeMissions(request.getParameter("pic_count"), request.getParameter("mission3"), 
				request.getParameter("mission4"), request.getParameter("student_id"));
		
		StudentBean bean = testService.selectStudentInfo(request.getParameter("student_id"));
		
		model.addAttribute("student_name", bean.getStudent_name());
		model.addAttribute("student_id", bean.getStudent_id());
		model.addAttribute("client_ip_address", bean.getClient_ip_address());
		model.addAttribute("client_port_number", bean.getClient_port_number());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		model.addAttribute("access_time", dateFormat.format(bean.getAccess_time()));
		
		int score = 0;
		
		if(bean.isMission_1_result()) {
			model.addAttribute("mission1", "PASS");
			score += 25;
		} else {
			model.addAttribute("mission1", "FAIL");
		}
		
		if(bean.isMission_2_result()) {
			model.addAttribute("mission2", "PASS");
			score += 25;
		} else {
			model.addAttribute("mission2", "FAIL");
		}
		
		if(bean.isMission_3_result()) {
			model.addAttribute("mission3", "PASS");
			score += 25;
		} else {
			model.addAttribute("mission3", "FAIL");
		}
		
		if(bean.isMission_4_result()) {
			model.addAttribute("mission4", "PASS");
			score += 25;
		} else {
			model.addAttribute("mission4", "FAIL");
		}
		
		model.addAttribute("score", score);
		
		return "test/result";
	}
}
