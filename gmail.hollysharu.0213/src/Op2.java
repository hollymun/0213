
public class Op2 {

	public static void main(String[] args) {
		System.out.printf("%b\n",true&&false);
		//System.out.printf("%b\n",true||false); //dead code 에러 : ||는 앞이 true이면 뒤쪽까지 가지 않음 

		int x=10;
		//&&는 앞쪽 연산의 결과가 false면 뒤의 연산을 하지 않음 
		boolean result=x>5 && ++x>5;
		System.out.printf("x:%d\n",x); // 11
		result=x>20 && ++x>5;
		System.out.printf("x:%d\n",x); // 11 : &&뒤 ++증감 하지 않고 그대로 출력

		
		int year=2019;
		//year가 2000 이상인지 확인하는 코드 
		result=year>=2000;
		System.out.printf("result1: %b\n", result);
		//year가 4의 배수인지 확인
		result=year%4==0;
		System.out.printf("result2: %b\n", result);
		//year가 4의 배수이고 100의 배수가 아닌 경우를 확인
		result=year%4==0 &&  year%100!=0;
		System.out.printf("result3: %b\n", result);
		//year가 (4의 배수이고 100의 배수가 아닌 경우) 또는 400의 배수인 경우 확인
		result=year%4==0 && year%100!=0 || year%400==0;
		System.out.printf("윤년 여부: %b\n", result);
		
		//1-100까지의 데이터가 있습니다 
		//3의 배수이고 4의 배수인지 확인
		//3의 배수를 확인하고 4의 배수를 확인하는 것이 좋은지
		//아니면 4의 배수를 확인하고 3의 배수를 확인하는 것이 좋은지 확인
		
		for(int i=1; i<100; i=i+1) {
			if(i%4==0 && i%3==0) {
				System.out.printf("i: %d\n", i);
			}
		}



		
	}
}
