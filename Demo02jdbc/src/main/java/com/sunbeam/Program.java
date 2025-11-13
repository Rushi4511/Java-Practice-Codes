package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main1(String[] args) {
		try(StudentDaoImpl dao = new StudentDaoImpl()){
			Student s = dao.findByID(1); 
			System.out.println(s.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try(StudentDaoImpl dao = new StudentDaoImpl()){
			List<Student> list = dao.findAll(); 
			for(Student s : list) {
				System.out.println(s.toString());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try(StudentDaoImpl dao = new StudentDaoImpl()){
			Student s = new Student(5, "Nilesh", 92.22); 
			int cnt = dao.save(s); 
			System.out.println("Rows Affected : "+cnt);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
