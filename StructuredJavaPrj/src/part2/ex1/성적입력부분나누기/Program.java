package part2.ex1.�����Էºκг�����;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		
		final int SIZE =3;
		int[] kors = new int[SIZE]; //size�� ũ�� �� �迭�� ũ�⸸ŭ �ݺ��Ǵ� ���� ���� �ִ°� �ƴ϶� ������ �������ִ°� ����.
		int total=0;
		float avg;
		int menu; // 1:INPUT, 2:PRINT, 3:EXIT
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3; //����� ����(�������ʴ� ����)�� �빮�ڷ� �������༭ �����ϱ� ���ϰ� �����.
		for(int i=0; i<SIZE; i++)
			kors[i]=0;
		
		Scanner scan = new Scanner(System.in);
		
		����:
		while (true) {
			// ------------------�޴� ���� �κ�----------------------------------

			System.out.println("��������������������������������������������");
			System.out.println("��       ���θ޴�              ��");
			System.out.println("��������������������������������������������");
			System.out.println("\t1.�����Է�");
			System.out.println("\t2.�������");
			System.out.println("\t3.����");
			System.out.println("\t�޴��� ���ϼ���>");
			menu = scan.nextInt();
			
			switch(menu) {
			case MENU_INPUT:
			
				
				// ------------------���� �Է� �κ�----------------------------------
	
				System.out.println("��������������������������������������������");
				System.out.println("��       �����Է�              ��");
				System.out.println("��������������������������������������������");
				
				for(int i=0; i<SIZE; i++)
					do {
						System.out.printf("����%d :", i+1);
						kors[i] = scan.nextInt();
						if (kors[i] < 0 || kors[i] > 100)
							System.out.println("��������(0~100)�� ������ϴ�.");
						System.out.println(0 <= kors[i] && kors[i] <= 100 ? "��ȿ�մϴ�." : "�߸��Ȱ��Դϴ�.");
					} while (kors[i] < 0 || kors[i] > 100);
				break;
			
			
			case MENU_PRINT:
				// ------------------���� ��� �κ�----------------------------------
				for(int i=0; i<SIZE; i++)
				total += kors[i];
				avg = total / 3.0f;
	
				System.out.println("��������������������������������������������");
				System.out.println("��       �������              ��");
				System.out.println("��������������������������������������������");
	
				for(int i=0; i<SIZE; i++)
					System.out.printf("\t����%d : %3d\n", i+1, kors[i]);
				System.out.printf("\t���� : %3d\n", total);
				System.out.printf("\t��� : %6.2f\n", avg);
				System.out.println("��������������������������������������������");
			
				break;
			
			case MENU_EXIT:
				break ����;
			default:
				System.out.println("1~3������ �Է��� �� �ֽ��ϴ�.");
			}
		}
		System.out.println("End program");
	}
}