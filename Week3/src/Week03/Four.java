package Week03;

import java.io.*;
import java.util.*;

public class Four {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/Users/yangsieun/Downloads/output2.txt");
			BufferedReader br = new BufferedReader(fr);
			String num,number;
			double dn;
			double[] list = new double[100];
			int count=0;
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				StringTokenizer st = new StringTokenizer(line,":");
				while(st.hasMoreTokens()) {
				num = st.nextToken();
				number = st.nextToken();
				dn = Double.parseDouble(number);
				list[count++] = dn;
				}
			}
			fr.close();
			double[] list2 = new double[count];
			System.arraycopy(list, 0, list2, 0, count);
			Arrays.sort(list2);
			
			FileWriter fw = new FileWriter("/Users/yangsieun/Downloads/output3.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i =0;i<list2.length;i++) {
				String bb = Double.toString(list2[i]);
				bw.write((i+1)+ ":" + bb);
				bw.newLine();
				
				bw.flush();
				System.out.println("파일에 저장되었습니다 ");
			}
			bw.close();
		}catch(Exception e) {}

	}

}
