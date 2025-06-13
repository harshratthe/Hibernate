package Service;

import java.util.Scanner;

import Dao.StudentDaoImpl;
import Model.Student;

public class StudentService {

	StudentDaoImpl dao = new StudentDaoImpl();
    Scanner sc = new Scanner(System.in);

    public void addStudentFromUser() {
        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(rollno, name, marks);
        dao.saveData(s);
        System.out.println("Student saved successfully!");
    }
    
    public void removeData()
    {
    	int rno;
    	System.out.println("Enter the RollNo");
    	rno=sc.nextInt();
    	dao.removeByRoll(rno);
    }

    public void updateStudentByRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No to update: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new marks: ");
        double marks = sc.nextDouble();

        dao.updateStudentByRollNo(roll, name, marks);
    }
    
    public void searchByRoll() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();
        dao.searchByRoll(roll);
    }
    
    
    public void showAll() {
    	dao.ShowData();
    }
	
	public void searchByname() {
		System.out.println("Enter Search Name : ");
		String snm=sc.nextLine();
		dao.searchHQLName(snm);
		
	}
	
	public void searchByNameMarks() {
		System.out.println("Enter Search NAme :");
		String snm=sc.nextLine();
		System.out.println("Enter Marks: ");
		double score=sc.nextDouble();
		dao.searchHQLNameMarks(snm,score);
	}
	
	public void MarksGreaterthan() {
		System.out.println("Enter Marks : ");
		double score=sc.nextDouble();
		dao.HQLMarksGreaterThan(score);
}
	
	public void DeleteByRollNo() {
		System.out.println("Enter RollNo : ");
		int roll=sc.nextInt();
		dao.HQLDeleteByRoll(roll);
	}
	
	public void UpdateNameByRollNo() {
		System.out.println("Enter RollNo: ");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name to be updated : ");
		String snm=sc.nextLine();
		dao.HQLUpdateNameByRollNo(roll,snm);
	}
	
	
	
}


