import java.util.Scanner;

public class IfPractice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
/*			
  		int a=10;
		//a�� 3���� ũ�� ũ�ٶ�� ���
		//3���� ���� ���� �ƹ� �ϵ� ���� ����
	
  		if(a>3) {
			System.out.printf("ũ��\n");
		}

		//a�� 10���� ũ�ٸ� ũ�ٶ�� ���, ������ �۴ٶ�� ���
		
		if(a<3) {
			System.out.printf("�۴�\n");
		}else{
			System.out.printf("ũ��\n");
		}

		
		//0-3�����̸� ���� ��, 4-6�����̸� �����, �׿ܴ� ū ����� ���
	
		System.out.printf("���� �Է��ϼ���: ");
		int su=sc.nextInt();
		if(su<0||su>10) {
			System.out.printf("0-10 ������ ���� �Է��ϼ���");
		}else if(su>=0&&su<=3) {
			System.out.printf("���� ��\n");
		}else if(su>=4&&su<=6) {
			System.out.printf("���� ��\n");
		}else {
			System.out.printf("ū ��\n");
		}
*/
		
		System.out.printf("������ �Է��ϼ���: ");
		int su=sc.nextInt();

		
		if(su<0||su>100) {
			System.out.printf("0-100 ������ ������ �Է��ϼ���");
		}else if(su>=80) { 									//80~100 A
			System.out.printf("A\n");						
		}else if(su>=50) {									//50~79 B
			System.out.printf("B\n");
		}else if(su>=30){									//30~49 C
			System.out.printf("C\n");
		}else{													//0~29 F
			System.out.printf("F\n");
		}
			
		
/*	
		if(su>=80&&su<=100){			//80~100 A
			System.out.printf("A\n");	
		}else if(su>=50&&su<80) {		//50~79 B
				System.out.printf("B\n");					
		}else if(su>=30&&su<50) {		//30~49	C
			System.out.printf("C\n");					
		}else if(su>=0&&su<30) {			//0~29	F
			System.out.printf("F\n");						
		}else {
			System.out.printf("0-100 ������ ������ �Է��ϼ���");
		}
*/
		System.out.printf("%f\n", 2.0-1.8);
		//double d=2.0-1.8;			//�Ǽ� ������ ������ �սǿ� �����ؾ� �� 	ex)99.99999986...�̸� 100�� �� �� 
		double d=(20-18)/10.0;
		System.out.printf("%f\n",d);
		if(d==0.2) {
			System.out.printf("����");
		}else {
			System.out.printf("�ٸ�");
		}
		
		//�Ǽ��� ������ ���� ���� ���� ����, ����� ���� ���� ���� ����ϴ� ������ ����  
		sc.close();
	}
}
