package com.photon.std;

import java.sql.*;


public class Info {
	
private String name;
private int age;
private String city;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public void retrieveList()
{
	try {
		//Class.forName("oracle.jdbc.OracleDriver");
		/*Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@172.16.17.59:1521:ORCLSTG", "scott",
				"tiger");*/
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "system",
				"system");
		System.out.println("Connection has been established");
		PreparedStatement pst = con
				.prepareStatement("select * from emp where name=?");
		
		pst.setString(1, this.name);
		System.out.println("this.name = "+this.name);
		
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
		this.name=rs.getString(1);
		this.city=rs.getString(2);
		this.age=rs.getInt(3);
		
		}

	} catch (Exception exe) {
		exe.printStackTrace();
	}

}

	

}
