package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.StudentDto;


public class Dao 
{
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	public void insert(StudentDto d1) 
	{
		entityTransaction.begin();
		entityManager.persist(d1);
		entityTransaction.commit();
	}

	public StudentDto student_markscard(int c_university_seat_number) {
	
		StudentDto s1=entityManager.find(StudentDto.class, c_university_seat_number);
		return s1;
	}

	public List<StudentDto> fetchall() {
		Query q1=entityManager.createQuery("select data from StudentDto data");
		List<StudentDto> l1=q1.getResultList();
		return l1;
		
	}

	public void update(StudentDto d1) {
		entityTransaction.begin();
		entityManager.merge(d1);
		entityTransaction.commit();	
		
	}

	public String delete(int c_university_seat_number) {
		StudentDto s1=entityManager.find(StudentDto.class, c_university_seat_number);
		if (s1 != null) {
			entityTransaction.begin();
			entityManager.remove(s1);
			entityTransaction.commit();
			return "<h1>Data is deleted</h1>";
		} else
			return "No data found";
		
	}

}
