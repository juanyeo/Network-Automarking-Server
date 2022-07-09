package com.project.database;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.project.beans.StudentBean;

public interface MapperInterface {
	
	@Select("select student_id from student where student_id = #{id}")
	List<String> selectStudentId(String id);
	
	@Insert("insert into student (student_name, student_id, client_ip_address, client_port_number, access_time) "
			+ "values (#{student_name}, #{student_id}, #{client_ip_address}, #{client_port_number}, #{access_time})")
	void insertStudentInfo(StudentBean studentBean);
	
	@Update("update student set student_name = #{student_name}, client_ip_address = #{client_ip_address}, "
			+ "client_port_number = #{client_port_number}, access_time = #{access_time} "
			+ "where student_id = #{student_id}")
	void updateStudentInfo(StudentBean studentBean);
	
	@Update("update student set mission_1_result = 1 where student_id = #{id}")
	void updateMission1Score(String id);
	
	@Update("update student set mission_2_result = #{m2}, mission_3_result = #{m3}, mission_4_result = #{m4} "
			+ "where student_id = #{id}")
	void updateMissionScore(@Param("m2") int m2, @Param("m3") int m3, @Param("m4") int m4, @Param("id") String id);
	
	@Select("select * from student where student_id = #{id}")
	List<StudentBean> selectStudentInfo(String id);
}
