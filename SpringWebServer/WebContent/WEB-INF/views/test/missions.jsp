<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web Client Mission</title>
</head>
<body>
	<h1>Web Client Auto-marking Program</h1>
	<hr/>
	<form action="${pageContext.request.contextPath}/test/submit_result" method="post">
	<input type="hidden" name="student_id" value=${ student_id}>
	<h4>Mission 1 : Handle HTTP Request Header</h4>
	<p>Set the USER-AGENT field in HTTP request header as following format 
		(Format: Student_Id/Name/Program_Name/Subject) Send GET request to "(Auto-marking Server URL)/test/changeHeader"
	</p><hr/>
	
	<h4>Mission 2 : Answer Number of Pictures (GET)</h4>
	<p>Send GET request to "(Auto-marking Server URL)/test/getHandleTest". 
		How many pictures did you get?
	</p>
	Number of pictures : <input type="text" name="pic_count"/><br/><hr/>
	
	<h4>Mission 3 : Select Correct Number (POST)</h4>
	<p>Send POST request to "(Auto-marking Server URL)/test/postHandleTest".  
		You will receive JSON data. What is the price of dragonfruit?
	</p>
	<input type="radio" id="answer1" name="mission3" value="3500">
  	<label for="answer1">3500</label>
	<input type="radio" id="answer2" name="mission3" value="7400">
  	<label for="answer2">7400</label>
	<input type="radio" id="answer3" name="mission3" value="8900">
  	<label for="answer3">8900</label>
	<input type="radio" id="answer4" name="mission3" value="10240">
  	<label for="answer4">10240</label><hr/>

	<h4>Mission 4 : Select Correct Picture (GET, GUI)</h4>
	<p>Send GET request to "(Auto-marking Server URL)/test/getImageTest".  
		You will receive a picture. What is the picture about?
	</p>
	<input type="radio" id="answer5" name="mission4" value="SDN">
  	<label for="answer5">SDN</label>
	<input type="radio" id="answer6" name="mission4" value="NAT">
  	<label for="answer6">NAT</label>
	<input type="radio" id="answer7" name="mission4" value="DNS">
  	<label for="answer7">DNS</label>
	<input type="radio" id="answer8" name="mission4" value="TCP/UDP">
  	<label for="answer8">TCP/UDP</label><hr/>

	<button type="submit">Submit Answers</button>
	</form>
</body>
</html>