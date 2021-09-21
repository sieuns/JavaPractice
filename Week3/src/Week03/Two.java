package Week03;

import java.io.*;
import java.util.*;

public class Two {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/Users/yangsieun/Downloads/input1.txt");
			BufferedReader br = new BufferedReader(fr);
			Double[] list = new Double[100];
			int cnt = 0;
			while(true) {
				String line = br.readLine();
				if (line == null)
					break;
				Double value = Double.parseDouble(line);
				list[cnt++] = value;
			}
			fr.close();
			
			Double[] list2 = new Double[cnt];
			System.arraycopy(list, 0, list2, 0, cnt);
			Arrays.sort(list2);
			
			
			FileWriter fr1 = new FileWriter("/Users/yangsieun/Downloads/output1.txt");
			BufferedWriter br1 = new BufferedWriter(fr1);
			for(int i =0;i<list2.length;i++) {
				String bb = Double.toString(list2[i]);
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
