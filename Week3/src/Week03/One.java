package Week03;
import java.io.*;
import java.util.*;

public class One {
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/Users/yangsieun/Downloads/input.txt");
			BufferedReader br = new BufferedReader(fr);
			int[] list = new int[100];
			int cnt = 0;
			while(true) {
				String line = br.readLine();
				if (line == null)
					break;
				int value = Integer.parseInt(line);
				list[cnt++] = value;
			}
			fr.close();
			
			int[] list2 = new int[cnt];
			System.arraycopy(list, 0, list2, 0, cnt);
			Arrays.sort(list2);
			
			
			FileWriter fr1 = new FileWriter("/Users/yangsieun/Downloads/output.txt");
			BufferedWriter br1 = new BufferedWriter(fr1);
			for(int i =0;i<list2.length;i++) {
				String bb = Integer.toString(list2[i]);
				br1.write((i+1)+ ":" + bb);
				br1.newLine();
				
				br1.flush();
				System.out.println("파일에 저장되었습니다 ");
			}
			br1.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
			
	

		

