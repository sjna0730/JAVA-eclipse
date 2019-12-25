package part2.ex1.�����Էºκг�����;

import java.util.Scanner;

public class StructuredProgram{
	
	static final int SIZE =3;
	
	public static void main(String[] args) {
				
		int[] korList = new int[SIZE]; 
		
		int menu; // 1:INPUT, 2:PRINT, 3:EXIT
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3; //����� ����(�������ʴ� ����)�� �빮�ڷ� �������༭ �����ϱ� ���ϰ� �����.
		for(int i=0; i<SIZE; i++)
			korList[i]=0;		
		����:
		while (true) {
			menu = �޴��Է�();
			
			switch(menu) {
			case MENU_INPUT:
				�����Է�(korList); //�����Է�() ��ȣ�ȿ� korList�� �־ �� ������ korList �迭�� �����Ҽ� �ְ� ����
				break;			
			
			case MENU_PRINT:
				�������(korList);
				break;
			
			case MENU_EXIT:
				break ����;
			default:
				System.out.println("1~3������ �Է��� �� �ֽ��ϴ�.");
			}
		}
		System.out.println("End program");
	}
	static int �޴��Է�() {
		Scanner scan = new Scanner(System.in);
		
		// ------------------�޴� ���� �κ�----------------------------------

					System.out.println("��������������������������������������������");
					System.out.println("��       ���θ޴�              ��");
					System.out.println("��������������������������������������������");
					System.out.println("\t1.�����Է�");
					System.out.println("\t2.�������");
					System.out.println("\t3.����");
					System.out.println("\t�޴��� ���ϼ���>");
					int menu = scan.nextInt();
					
					return menu;
	}
	
	static void �������(int[] kors) {
		int total=0;
		float avg;
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
	
	}
	
	static void �����Է�(int[] kors) { //�����Է�() ��ȣ�ȿ� int[] kors�� �־ ���ο��� ������ korList �迭�� ������
									//�̷ν� ���������� ����� �� ������ �ܺο��� ������ ���� ������

		Scanner scan = new Scanner(System.in);
		int kor;
		// ------------------���� �Է� �κ�----------------------------------

		System.out.println("��������������������������������������������");
		System.out.println("��       �����Է�              ��");
		System.out.println("��������������������������������������������");
		
		for(int i=0; i<SIZE; i++) {
			do {
				System.out.printf("����%d :", i+1);
				kor = scan.nextInt();
				if (kor < 0 || kor > 100)
					System.out.println("��������(0~100)�� ������ϴ�.");
				System.out.println(0 <= kor && kor <= 100 ? "��ȿ�մϴ�." : "�߸��Ȱ��Դϴ�.");
			} while (kor < 0 || kor > 100);
			kors[i] = kor;
		}
	}
}