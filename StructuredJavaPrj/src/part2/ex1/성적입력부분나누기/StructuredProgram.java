package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class StructuredProgram{
	
	static final int SIZE =3;
	
	public static void main(String[] args) {
				
		int[] korList = new int[SIZE]; 
		
		int menu; // 1:INPUT, 2:PRINT, 3:EXIT
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3; //상수형 변수(변하지않는 변수)는 대문자로 선언해줘서 구분하기 편하게 만든다.
		for(int i=0; i<SIZE; i++)
			korList[i]=0;		
		종료:
		while (true) {
			menu = 메뉴입력();
			
			switch(menu) {
			case MENU_INPUT:
				성적입력(korList); //성적입력() 괄호안에 korList를 넣어서 그 지역에 korList 배열을 참조할수 있게 해줌
				break;			
			
			case MENU_PRINT:
				성적출력(korList);
				break;
			
			case MENU_EXIT:
				break 종료;
			default:
				System.out.println("1~3까지만 입력할 수 있습니다.");
			}
		}
		System.out.println("End program");
	}
	static int 메뉴입력() {
		Scanner scan = new Scanner(System.in);
		
		// ------------------메뉴 선택 부분----------------------------------

					System.out.println("┌────────────────────┐");
					System.out.println("│       메인메뉴              │");
					System.out.println("└────────────────────┘");
					System.out.println("\t1.성적입력");
					System.out.println("\t2.성적출력");
					System.out.println("\t3.종료");
					System.out.println("\t메뉴를 정하세요>");
					int menu = scan.nextInt();
					
					return menu;
	}
	
	static void 성적출력(int[] kors) {
		int total=0;
		float avg;
		// ------------------성적 출력 부분----------------------------------
		for(int i=0; i<SIZE; i++)
		total += kors[i];
		avg = total / 3.0f;

		System.out.println("┌────────────────────┐");
		System.out.println("│       성적출력              │");
		System.out.println("└────────────────────┘");

		for(int i=0; i<SIZE; i++)
			System.out.printf("\t국어%d : %3d\n", i+1, kors[i]);
		System.out.printf("\t총점 : %3d\n", total);
		System.out.printf("\t평균 : %6.2f\n", avg);
		System.out.println("──────────────────────");
	
	}
	
	static void 성적입력(int[] kors) { //성적입력() 괄호안에 int[] kors를 넣어서 메인에서 선언한 korList 배열을 참조함
									//이로써 지역적으로 선언된 이 구역이 외부에서 간섭될 일이 없어짐

		Scanner scan = new Scanner(System.in);
		int kor;
		// ------------------성적 입력 부분----------------------------------

		System.out.println("┌────────────────────┐");
		System.out.println("│       성적입력              │");
		System.out.println("└────────────────────┘");
		
		for(int i=0; i<SIZE; i++) {
			do {
				System.out.printf("국어%d :", i+1);
				kor = scan.nextInt();
				if (kor < 0 || kor > 100)
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				System.out.println(0 <= kor && kor <= 100 ? "유효합니다." : "잘못된값입니다.");
			} while (kor < 0 || kor > 100);
			kors[i] = kor;
		}
	}
}