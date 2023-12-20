package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value(value = "${name}")
	private String name;
	

	@Value(value = "${city}")
	private String city;
	
	public void getStudentData()
	{
		System.out.println("--------------------------Student-----------------------------------");
		System.out.println("StudentName : "+name);
		System.out.println("Student City : "+city);
		
	}

}
