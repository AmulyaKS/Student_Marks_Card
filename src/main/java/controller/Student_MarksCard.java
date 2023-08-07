package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.StudentDto;

@WebServlet("/stu_login")
public class Student_MarksCard extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String university_seat_number=req.getParameter("university_seat_number");
		int c_university_seat_number=Integer.parseInt(university_seat_number);
		
		String date_of_birth=req.getParameter("date_of_birth");
		
		Dao dao=new Dao();
		StudentDto s1=dao.student_markscard(c_university_seat_number);
		
		if(s1!=null)
		{
			if(date_of_birth.equals(s1.getDate_of_birth()))
			{
				req.setAttribute("marks_card", s1);
				RequestDispatcher rd=req.getRequestDispatcher("get_stdMarks.jsp");
				rd.forward(req,resp);
			}
			else
			{
				resp.getWriter().print("<h1>Wrong Date of Birth and Try Again....!</h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("student_login.html");
				dispatcher.include(req, resp);
			}
		}
		else
		{
			resp.getWriter().print("<h1>Wrong University Seat Number and Try Again....!</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("student_login.html");
			dispatcher.include(req, resp);
		}
		
	}
	
}
