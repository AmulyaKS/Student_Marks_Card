package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.StudentDto;

@WebServlet("/insert")
public class Controller extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String university_seat_number=req.getParameter("university_seat_number");
		int cuniversity_seat_number=Integer.parseInt(university_seat_number);
		String student_name=req.getParameter("student_name");
		String date_of_birth=req.getParameter("date_of_birth");
		String father_name=req.getParameter("father_name");
		
		String kannada_marks=req.getParameter("kannada_marks");
		int c_kannada_marks=Integer.parseInt(kannada_marks);
		
		String english_marks=req.getParameter("english_marks");
		int c_english_marks=Integer.parseInt(english_marks);
		
		String hindi_marks=req.getParameter("hindi_marks");
		int c_hindi_marks=Integer.parseInt(hindi_marks);
		
		String mathematics_marks=req.getParameter("mathematics_marks");
		int c_mathematics_marks=Integer.parseInt(mathematics_marks);
		
		String science_marks=req.getParameter("science_marks");
		int c_science_marks=Integer.parseInt(science_marks);
		
		String socialscience_marks=req.getParameter("socialscience_marks");
		int c_socialscience_marks=Integer.parseInt(socialscience_marks);
		
		int total_marks=c_kannada_marks+c_english_marks+c_hindi_marks+c_mathematics_marks+c_science_marks+c_socialscience_marks;
		float percentage=(total_marks * 100) / 600;
		
		StudentDto d1=new StudentDto();
		d1.setUniversity_seat_number(cuniversity_seat_number);
		d1.setStudent_name(student_name);
		d1.setDate_of_birth(date_of_birth);
		d1.setFather_name(father_name);
		d1.setKannada_marks(c_kannada_marks);
		d1.setEnglish_marks(c_english_marks);
		d1.setHindi_marks(c_hindi_marks);
		d1.setMathematics_marks(c_mathematics_marks);
		d1.setScience_marks(c_science_marks);
		d1.setSocialscience_marks(c_socialscience_marks);
		d1.setTotal_marks(total_marks);
		d1.setPercentage(percentage);
		
		Dao dao=new Dao();
		dao.insert(d1);
		System.out.println("Data inserted");
		resp.getWriter().print("<h1>Data inserted</h1>");
		resp.getWriter().print("<h1>Total Marks:</h1>"+total_marks);
		resp.getWriter().print("<h1>Percentage:</h1>"+percentage);
	}
	
}
