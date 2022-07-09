package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.StudentBean;
import com.project.dao.TestDao;

@Service
public class TestService {
	
	private String CORRECT_ANSWER_2 = "7";
	private String CORRECT_ANSWER_3 = "10240";
	private String CORRECT_ANSWER_4 = "NAT";
	
	@Autowired
	private TestDao testDao;

	public void gradeMission1(String[] userAgent) {
		if(userAgent.length == 4) {
			testDao.updateMission1Score(userAgent[0]);
		}
	}
	
	public void gradeMissions(String answer2, String answer3, String answer4, String id) {
		int m2 = (CORRECT_ANSWER_2.equals(answer2)) ? 1 : 0;
		int m3 = (CORRECT_ANSWER_3.equals(answer3)) ? 1 : 0;
		int m4 = (CORRECT_ANSWER_4.equals(answer4)) ? 1 : 0;
		
		testDao.updateMissionScore(m2, m3, m4, id);
	}
	
	public StudentBean selectStudentInfo(String id) {
		return testDao.selectStudentInfo(id);
	}
}
