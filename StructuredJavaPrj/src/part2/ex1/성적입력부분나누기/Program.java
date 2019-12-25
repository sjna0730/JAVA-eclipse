package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		
		final int SIZE =3;
		int[] kors = new int[SIZE]; //size의 크기 즉 배열의 크기만큼 반복되는 것은 수를 넣는게 아니라 변수로 선언해주는게 좋다.
		int total=0;
		float avg;
		int menu; // 1:INPUT, 2:PRINT, 3:EXIT
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3; //상수형 변수(변하지않는 변수)는 대문자로 선언해줘서 구분하기 편하게 만든다.
		for(int i=0; i<SIZE; i++)
			kors[i]=0;
		
		Scanner scan = new Scanner(System.in);
		
		종료:
		while (true) {
			// ------------------메뉴 선택 부분----------------------------------

			System.out.println("┌────────────────────┐");
			System.out.println("│       메인메뉴              │");
			System.out.println("└────────────────────┘");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.println("\t메뉴를 정하세요>");
			menu = scan.nextInt();
			
			switch(menu) {
			case MENU_INPUT:
			
				
				// ------------------성적 입력 부분----------------------------------
	
				System.out.println("┌────────────────────┐");
				System.out.println("│       성적입력              │");
				System.out.println("└────────────────────┘");
				
				for(int i=0; i<SIZE; i++)
					do {
						System.out.printf("국어%d :", i+1);
						kors[i] = scan.nextInt();
						if (kors[i] < 0 || kors[i] > 100)
							System.out.println("성적범위(0~100)를 벗어났습니다.");
						System.out.println(0 <= kors[i] && kors[i] <= 100 ? "유효합니다." : "잘못된값입니다.");
					} while (kors[i] < 0 || kors[i] > 100);
				break;
			
			
			case MENU_PRINT:
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
			
				break;
			
			case MENU_EXIT:
				break 종료;
			default:
				System.out.println("1~3까지만 입력할 수 있습니다.");
			}
		}
		System.out.println("End program");
	}
}