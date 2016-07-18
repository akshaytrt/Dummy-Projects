package com.sears.corps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDAOImpl daoImpl=(StudentDAOImpl) context.getBean("studentImpl");
        
        Scanner scanner=new Scanner(System.in);
        int ch=0;
        while(ch<=5){
        	System.out.println("1.Insert data");
            System.out.println("2.Get all the details");
            System.out.println("3.Get student data by id");
            System.out.println("4.Update student details");
            System.out.println("5.Delete student data");
            System.out.println("Enter your choice :");
            ch=Integer.parseInt(scanner.next());
        	switch(ch){
        	case 1:
        		Student student=new Student();
        		System.out.println("Enter id");
        		student.setId(Integer.parseInt(scanner.next()));
        		System.out.println("Enter name");
        		student.setName(scanner.next());
        		System.out.println("Enter age");
        		student.setAge(Integer.parseInt(scanner.next()));
        		daoImpl.insertDetails(student);
        		break;
        		
        	case 2:
        		List<Student> students=daoImpl.getDetails();
                for (Student student1 : students) {
        			System.out.println(student1.getId()+"\t"+student1.getName()+"\t"+student1.getAge());
        		}
                break;
              
        	case 3:
        		System.out.println("Enter the id of student :");
        		student=daoImpl.getStudent(Integer.parseInt(scanner.next()));
        		System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge());
        		break;
        		
        	case 4:
        		student=new Student();
        		System.out.println("Enter id");
        		student.setId(Integer.parseInt(scanner.next()));
        		System.out.println("Enter name");
        		student.setName(scanner.next());
        		System.out.println("Enter age");
        		student.setAge(Integer.parseInt(scanner.next()));
        		daoImpl.updateStudent(student);
        		break;
        		
        	case 5:
        		System.out.println("Enter id");
        		daoImpl.delete(Integer.parseInt(scanner.next()));
        		break;
        	}
        	
        }
       
        
    }
}
