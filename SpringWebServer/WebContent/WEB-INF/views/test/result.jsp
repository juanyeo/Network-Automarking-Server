<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Auto-marking Result</title>
<style>
	th {
	   background-color: #bbdefb;
	}
	td {
	   background-color: #e3f2fd;
	}
</style>
</head>
<body>
	<h1>Web Client Auto-marking Program</h1>
	<hr/>
	<table border='1' width='800' height='100'>
		<tr align="center">
			<th>Student Name</th>
			<th>Student Id</th>
			<th>Web Client IP</th>
			<th>Web Client Port</th>
			<th>Access Time</th>
		</tr>
		<tr align="center">
			<td>${student_name}</td>
			<td>${student_id}</td>
			<td>${client_ip_address}</td>
			<td>${client_port_number}</td>
			<td>${access_time}</td>
		</tr>
	</table><br/><br/>
	<h1>Your Results</h1><br/>
	<table border='1' width='800' height='300'>
		<tr align="center">
			<td width='45%'>Mission 1: Set HTTP request Header</td>
			<td width='15%'>${mission1}</td>
			<td width='40%'>USER-AGENT</td>
		</tr>
		<tr align="center">
			<td width='45%'>Mission 2: Answer Number of Pictures (GET)</td>
			<td width='15%'>${mission2}</td>
			<td width='40%'>7 pictures</td>
		</tr>
		<tr align="center">
			<td width='45%'>Mission 3: Select Correct Number (POST)</td>
			<td width='15%'>${mission3}</td>
			<td width='40%'>10240</td>
		</tr>
		<tr align="center">
			<td width='45%'>Mission 4: Select Correct Picture (GET, GUI)</td>
			<td width='15%'>${mission4}</td>
			<td width='40%'>NAT</td>
		</tr>
		<tr align="center">
			<td width='45%'>Your Score</td>
			<td colspan='2'>${score} / 100</td>
		</tr>
	</table>
</body>
</html>