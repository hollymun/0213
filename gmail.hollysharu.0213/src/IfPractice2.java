

public class IfPractice2 {

	public static void main(String[] args) {
		
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
	}
}
