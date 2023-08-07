<%@page import="dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<StudentDto> l1=(List<StudentDto>) request.getAttribute("std_lists"); %>
<table border=" ">
<tr>
<th>University Seat Number: </th>
<th>Name: </th>
<th>date_of_birth</th>
<th>father_name</th>
<th>kannada_marks</th>
<th>english_marks</th>
<th>hindi_marks</th>
<th>mathematics_marks</th>
<th>science_marks</th>
<th>socialscience_marks</th>
<th>Total Marks</th>
<th>Percentage</th>
</tr>
<% for(StudentDto a:l1) { %>
<tr>
<td><%=a.getUniversity_seat_number() %></td>
<td><%=a.getStudent_name() %></td>
<td><%=a.getDate_of_birth() %></td>
<td><%=a.getFather_name() %></td>
<td><%=a.getKannada_marks() %></td>
<td><%=a.getEnglish_marks() %></td>
<td><%=a.getHindi_marks() %></td>
<td><%=a.getMathematics_marks() %></td>
<td><%=a.getScience_marks() %></td>
<td><%=a.getSocialscience_marks() %></td>
<td><%=a.getTotal_marks() %></td>
<td><%=a.getPercentage() %></td>
</tr>
<%}%>
</table>
</body>
</html>