package Dao;

import Model.Student;

public interface  StudentDaoI {

	void saveData(Student s);
	void removeByRoll(int rno);
	void updateStudentByRollNo(int rno,String name,double marks);
	void searchByRoll(int rno);
	void ShowData();
	void searchHQLName(String snm);
	void searchHQLNameMarks(String snm,double score);
	void HQLMarksGreaterThan(double score);
	void HQLDeleteByRoll(int roll);
	void HQLUpdateNameByRollNo(int roll,String snm);
}
