import java.util.Scanner;

public class IfPractice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
/*			
  		int a=10;
		//a가 3보다 크면 크다라고 출력
		//3보다 작을 때는 아무 일도 하지 않음
	
  		if(a>3) {
			System.out.printf("크다\n");
		}

		//a가 10보다 크다면 크다라고 출력, 작으면 작다라고 출력
		
		if(a<3) {
			System.out.printf("작다\n");
		}else{
			System.out.printf("크다\n");
		}

		
		//0-3까지이면 작은 수, 4-6까지이면 보통수, 그외는 큰 수라고 출력
	
		System.out.printf("수를 입력하세요: ");
		int su=sc.nextInt();
		if(su<0||su>10) {
			System.out.printf("0-10 사이의 수를 입력하세요");
		}else if(su>=0&&su<=3) {
			System.out.printf("작은 수\n");
		}else if(su>=4&&su<=6) {
			System.out.printf("보통 수\n");
		}else {
			System.out.printf("큰 수\n");
		}
*/
		
		System.out.printf("점수를 입력하세요: ");
		int su=sc.nextInt();

		
		if(su<0||su>100) {
			System.out.printf("0-100 사이의 점수를 입력하세요");
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
			System.out.printf("0-100 사이의 점수를 입력하세요");
		}
*/
		System.out.printf("%f\n", 2.0-1.8);
		//double d=2.0-1.8;			//실수 연산은 데이터 손실에 유의해야 함 	ex)99.99999986...이면 100이 안 됨 
		double d=(20-18)/10.0;
		System.out.printf("%f\n",d);
		if(d==0.2) {
			System.out.printf("동일");
		}else {
			System.out.printf("다름");
		}
		
		//실수를 저장할 때는 곱한 값을 저장, 출력할 때는 나눈 값을 출력하는 습관이 좋음  
		sc.close();
	}
}
