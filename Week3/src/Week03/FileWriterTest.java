package Week03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/yangsieun/Downloads/file");
		FileWriter fw = new FileWriter(file,true);
		fw.write("FileWriter는 한글로 된 "+"\r\n");
		fw.write("문자열을 바로 출력할 수 있다."+"\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다 ");
		}

}
