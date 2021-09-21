package Week03;
import java.io.*;
import java.util.*;

public class Six {

	public static void main(String[] args) {
		int count=0;
		try {
			FileReader fr = new FileReader("/Users/yangsieun/Downloads/student0.txt");
			BufferedReader br = new BufferedReader(fr);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
			
			Student stu;
			String num;
			int grade;
			String name;
			String tel_number;
			
			
			
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				StringTokenizer st = new StringTokenizer(line);
				count++;
				while(st.hasMoreTokens()) {
					num = st.nextToken();
					grade = Integer.parseInt(st.nextToken());
					name = st.nextToken();
					tel_number = st.nextToken();
					stu = new Student(num, grade, name, tel_number);
					oos.writeObject(stu);
					}
			}
			
			fr.close();
			oos.close();
		}catch(IOException e) {
			
		}
		
		System.out.println("학생 객체는 총 "+count+"개 생성됨.");

	}

}
