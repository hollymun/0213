import java.util.Scanner;

public class Pos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	/*
	 * System.out.printf("거스름돈 입력:");
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
		System.out.println("만 원: "+man+"장 "+"오천 원: "+ochun+"장 "+"천 원: "+chun+"장");
		System.out.printf("==============================\n");
		System.out.printf("만 원: %d장\n", man);
		System.out.printf("오천 원: %d장\n", ochun);
		System.out.printf("천 원: %d장\n", chun);
		System.out.printf("==============================\n");	
	
	 */	
		
		System.out.printf("초 입력:");
		
		int time=sc.nextInt();
		int hour=time/3600;
		int min=(time%3600)/60;
		int second=time%60;
		
		System.out.println(hour+"시 "+min+"분 "+second+"초");
		
		sc.close();
	}
}
