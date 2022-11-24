package com.Student;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StudentMain {

	public static void main(String[] args) {
	StudentLogic s4=new StudentLogic();
	JFrame jp=new JFrame();

	String name4=JOptionPane.showInputDialog(jp, "Enter your Student name");
	String Quli=JOptionPane.showInputDialog(jp, "Enter your Student Qualification");
	if(s4.AddData(name4, Quli))
	{
		System.out.println("Insertion Done");
	}
	if(s4.ViewData() !=null)
	{
		System.out.println("Student Details"+s4.ViewData());
	}
	if(s4.DeleteData())
	{
		System.out.println("Deletion Done");
	}
	}
}