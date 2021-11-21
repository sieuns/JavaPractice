import java.util.*;
public class One {

	public static void main(String[] args) {
		System.out.println("하나를 선택하시요 : 가위(0), 바위(1), 보(2) : ");
		Scanner scan = new Scanner(System.in);
		int player = scan.nextInt();
		

		Random r = new Random();
		int com = r.nextInt(3);
		//System.out.println(com);
		
		if(player==1 || player==2 || player==3) {
		if(com == 0) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		}else if(com == 1) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		}else if(com == 2) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		if((player==1&&com==3)||(player==2&&com==1) ||(player==3&&com==2)) {
			System.out.println("당신이 이겼습니다.");
		}else if((player==3&&com==1)||(player==1&&com==2) ||(player==2&&com==3)) {
			System.out.println("컴퓨터가 이겼습니다.");
		}else if(player==com){
			System.out.println("비겼습니다");
		}
	
	}

 }

}
