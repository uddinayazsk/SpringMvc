package com.photon.std;

import java.sql.*;

public class User {

	private String name;

	private int age;

	private String city;

	public void setAge(int age) {
		this.age = age;
	}
	public void setCity(String city) {
		this.city = city;
	}
    public void setName(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public String getCity()
	{
		return city;
	}
	
	
	public void addDetails() {
		try {
			//Class.forName("oracle.jdbc.OracleDriver");
			/*Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@172.16.17.59:1521:ORCLSTG", "scott",
					"tiger");*/
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driveloaded");
			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system",
					"system");
			System.out.println("Connection established");
			PreparedStatement pst = con
					.prepareStatement("insert into emp values(?,?,?)");
			System.out.println("Values are "+this.name+" "+ this.city+" "+this.age);
			pst.setString(1, this.name);
			pst.setString(2, this.city);
			pst.setInt(3, this.age);
			pst.executeUpdate();
			con.commit();
		 

		} catch (Exception exe) {
			exe.printStackTrace();
		}

	}
	

}
