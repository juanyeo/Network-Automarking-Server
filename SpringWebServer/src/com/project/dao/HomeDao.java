package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.beans.StudentBean;
import com.project.database.MapperInterface;

@Repository
public class HomeDao {
	
	@Autowired
	private MapperInterface mapper;
	
	public List<String> selectStudentId(String student_id) {
		return mapper.selectStudentId(student_id);
	}
	
	public void insertStudentInfo(StudentBean studentBean) {
		mapper.insertStudentInfo(studentBean);
	}
	
	public void updateStudentInfo(StudentBean studentBean) {
		mapper.updateStudentInfo(studentBean);
	}
}
