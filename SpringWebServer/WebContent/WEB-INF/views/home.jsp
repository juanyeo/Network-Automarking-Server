<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web Client Auto-marking</title>
</head>
<body>
	<h1>Web Client Auto-marking Program</h1>
	<hr/>
	<div>
		<form action="${pageContext.request.contextPath}/home/startTest" method="post"><br/>
			Student Name : <input type="text" name="student_name"/><br/><br/>
			Student Id : <input type="text" name="student_id"/><br/><br/>
			Web Client IP Address : <input type="text" name="client_ip_address"/><br/><br/>
			Web Client Port Number : <input type="text" name="client_port_number"/><br/><br/>
			<hr/>
			<button type="submit">Start Test</button>
		</form>
	</div>
</body>
</html>