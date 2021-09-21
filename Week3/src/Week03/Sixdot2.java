package Week03;
import java.io.*;
public class Sixdot2 {

	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));
		Object obj = null;
		int count = 0;
		try {
			while((obj = ois.readObject())!= null) {
				Student stu = (Student)obj;
				if(stu.grade == 2) {
					System.out.println(stu.num+"\t" + stu.grade +"\t" + stu.name + "\t" + stu.tel_number);
					count++;
				}
			}
			ois.close();
		}catch(EOFException e) {
			System.out.println(" ");
			System.out.println("총 "+count+"명 ");
		}

	}

}
