package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDto 
{
	@Id
	private int university_seat_number;
	private String student_name;
	private String date_of_birth;
	private String father_name;
	private int kannada_marks;
	private int english_marks;
	private int hindi_marks;
	private int mathematics_marks;
	private int science_marks;
	private int socialscience_marks;
	private int total_marks;
	private float percentage;
	
	public int getUniversity_seat_number() {
		return university_seat_number;
	}
	public void setUniversity_seat_number(int university_seat_number) {
		this.university_seat_number = university_seat_number;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public int getKannada_marks() {
		return kannada_marks;
	}
	public void setKannada_marks(int kannada_marks) {
		this.kannada_marks = kannada_marks;
	}
	public int getEnglish_marks() {
		return english_marks;
	}
	public void setEnglish_marks(int english_marks) {
		this.english_marks = english_marks;
	}
	public int getHindi_marks() {
		return hindi_marks;
	}
	public void setHindi_marks(int hindi_marks) {
		this.hindi_marks = hindi_marks;
	}
	public int getMathematics_marks() {
		return mathematics_marks;
	}
	public void setMathematics_marks(int mathematics_marks) {
		this.mathematics_marks = mathematics_marks;
	}
	public int getScience_marks() {
		return science_marks;
	}
	public void setScience_marks(int science_marks) {
		this.science_marks = science_marks;
	}
	public int getSocialscience_marks() {
		return socialscience_marks;
	}
	public void setSocialscience_marks(int socialscience_marks) {
		this.socialscience_marks = socialscience_marks;
	}
	public int getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
		
}
