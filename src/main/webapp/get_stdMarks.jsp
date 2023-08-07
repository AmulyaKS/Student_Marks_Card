<%@page import="dto.StudentDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin-right: 400px; margin-left: 200px;">
<% StudentDto s=(StudentDto) request.getAttribute("marks_card"); %>
<form style="width: 900px; padding: 10px; border: 4px solid black; background-color: pink;">
<h1 align="center" style="word-spacing: 5px">Karnataka Secondary Education Examination Board</h1>
<h2 align="center" style="word-spacing: 5px">Bangalore, Karnataka</h2>
<b><h2 align="center" style="color: purple;">Secondary School Certificate</h2></b>
<hr style="height: 5px; color: green;">
<h3><span style="color: purpule;">University Seat Number:</span><%=s.getUniversity_seat_number() %></h3>
<h3><span style="color: purpule;">Name: </span><%=s.getStudent_name() %></h3>
<h3><span style="color: purpule;">Date Of Birth:</span><%=s.getDate_of_birth() %></h3>
<h3><span style="color: purpule;">Father Name:</span><%=s.getFather_name() %></h3><br><br>
<h3><span style="color: purpule;">The candidate secured the following marks in curricular examination:</span></h3>

<table border="3px" style="width: 850px; height: 300px;">

<tr align="center" style="">
<th>Subject Name</th>
<th>Marks Scored</th>
</tr>
<tr align="center" style="">
<th>Kannada Marks</th>
<td><%=s.getKannada_marks() %></td>
</tr>

<tr align="center">
<th>English Marks</th>
<td><%=s.getEnglish_marks() %></td>
</tr>

<tr align="center">
<th>Hindi Marks</th>
<td><%=s.getHindi_marks() %></td>
</tr>

<tr align="center">
<th>Mathematics Marks</th>
<td><%=s.getMathematics_marks() %></td>
</tr>

<tr align="center">
<th>Science Marks</th>
<td><%=s.getScience_marks() %></td>
</tr>

<tr align="center">
<th>Social Science Marks</th>
<td><%=s.getSocialscience_marks() %></td>
</tr>

<tr align="center">
<th>Total Marks</th>
<td><%=s.getTotal_marks() %></td>
</tr>

<tr align="center">
<th>Percentage</th>
<td><%=s.getPercentage() %></td>
</tr>

</table>
<br><br><br>
<h5> <span style="color:black; align-self: right: ;">Secretary</span> </h5>
<h5> <span style="color:black; ;">Karnataka Secondary Education Examination Board</span> </h5>
<h5> <span style="color:black; ;">Bengaluru</span> </h5>


</form>
</body>
</html>