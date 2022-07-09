package com.project.beans;

public class StudentBean {
	
	private String student_name;
	private String student_id;
	
	private String client_ip_address;
	private String client_port_number;
	
	private long access_time;
	
	private boolean mission_1_result;
	private boolean mission_2_result;
	private boolean mission_3_result;
	private boolean mission_4_result;
	
	private int score;

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getClient_ip_address() {
		return client_ip_address;
	}

	public void setClient_ip_address(String client_ip_address) {
		this.client_ip_address = client_ip_address;
	}

	public String getClient_port_number() {
		return client_port_number;
	}

	public void setClient_port_number(String client_port_number) {
		this.client_port_number = client_port_number;
	}

	public long getAccess_time() {
		return access_time;
	}

	public void setAccess_time(long access_time) {
		this.access_time = access_time;
	}

	public boolean isMission_1_result() {
		return mission_1_result;
	}

	public void setMission_1_result(boolean mission_1_result) {
		this.mission_1_result = mission_1_result;
	}

	public boolean isMission_2_result() {
		return mission_2_result;
	}

	public void setMission_2_result(boolean mission_2_result) {
		this.mission_2_result = mission_2_result;
	}

	public boolean isMission_3_result() {
		return mission_3_result;
	}

	public void setMission_3_result(boolean mission_3_result) {
		this.mission_3_result = mission_3_result;
	}

	public boolean isMission_4_result() {
		return mission_4_result;
	}

	public void setMission_4_result(boolean mission_4_result) {
		this.mission_4_result = mission_4_result;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
