import java.util.Scanner;

public class Pos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	/*
	 * System.out.printf("�Ž����� �Է�:");
	 * 
		int money=sc.nextInt();
		int man=money/10000;
		int ochun=(money-man*10000)/5000;
		int chun=((money-man*10000)-ochun*5000)/1000;
	
		int money=sc.nextInt();
		int man=money/10000;
		int ochun=(money%10000)/5000;
		int chun=(money%5000)/1000;
		
		System.out.printf("==============================\n");
		System.out.println("�� ��: "+man+"�� "+"��õ ��: "+ochun+"�� "+"õ ��: "+chun+"��");
		System.out.printf("==============================\n");
		System.out.printf("�� ��: %d��\n", man);
		System.out.printf("��õ ��: %d��\n", ochun);
		System.out.printf("õ ��: %d��\n", chun);
		System.out.printf("==============================\n");	
	
	 */	
		
		System.out.printf("�� �Է�:");
		
		int time=sc.nextInt();
		int hour=time/3600;
		int min=(time%3600)/60;
		int second=time%60;
		
		System.out.println(hour+"�� "+min+"�� "+second+"��");
		
		sc.close();
	}
}
