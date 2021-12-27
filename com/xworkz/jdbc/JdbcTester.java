package com.xworkz.jdbc;

public class JdbcTester {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("create jdbc");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


}
