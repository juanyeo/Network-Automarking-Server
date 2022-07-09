package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.beans.StudentBean;
import com.project.database.MapperInterface;

@Repository
public class TestDao {
	
	@Autowired
	private MapperInterface mapper;

	public void updateMission1Score(String id) {
		mapper.updateMission1Score(id);
	}
	
	public void updateMissionScore(int m2, int m3, int m4, String id) {
		mapper.updateMissionScore(m2, m3, m4, id);
	}
	
	public StudentBean selectStudentInfo(String id) {
		List<StudentBean> students = mapper.selectStudentInfo(id);
		
		if(students.isEmpty()) {
			return null;
		} else {
			return students.get(0);
		}
	}
}
