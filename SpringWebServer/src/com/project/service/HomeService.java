package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.project.beans.StudentBean;
import com.project.dao.HomeDao;

@Service
public class HomeService {
	
	@Autowired
	private HomeDao homeDao;

	public void submitStudentInfo(StudentBean studentBean) {
		List<String> duplicatedId = homeDao.selectStudentId(studentBean.getStudent_id());
		
		if(duplicatedId.isEmpty()) {
			homeDao.insertStudentInfo(studentBean);
		} else {
			homeDao.updateStudentInfo(studentBean);
		}
	}
}
