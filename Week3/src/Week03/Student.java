package Week03;
import java.io.*;
public class Student implements Serializable{
	String num;
	int grade;
	String name;
	String tel_number;

	public Student(String num,int grade, String name, String tel_number) {
		super();
		this.num = num;
		this.grade = grade;
		this.name = name;
		this.tel_number = tel_number;
	}

}
