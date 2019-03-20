
public class Op3 {

	public static void main(String[] args) {
		int n1=10;
		int n2=5;
		//n1과 n2 중 큰 수 찾기
		int result=n1>n2?n1:n2; //n1이 n2보다 큰지? 크다면 n1, 아니라면 n2로 출력 
		System.out.printf("result: %d\n", result);
		
		//성별은 F 또는 M으로 저장 
		char gender='m';
		//gender가 M이면 남자라고 출력, F면 여자라고 출력 
		//삼항 연산자를 이용해서 해결 
		String x=gender=='M' || gender=='m'? "남자":"여자";
		System.out.printf("성별: %s\n", x);
		
		//정수 변수에 0-100까지의 숫자를 저장하고 
		//60이상이면 합격 그렇지 않으면 불합격 
		int score=80;
		String passOrNon=score>=60?"합격":"불합격";
		System.out.printf("합격여부: %s\n", passOrNon);
		
		//score가 80이상이면 우수, 60 이상이면 보통, 그 이하는 저조라고 출력
		int score2=-2;
		passOrNon=score2>100||score2<0?"0-100 사이의 값을 입력하세요": score2>=80?"우수": score2<60?"저조":"보통";
		System.out.printf("등급: %s\n", passOrNon);

		System.out.printf("=======================\n");

		
		//2개의 변수에 저장된 값을 교환하는 swap 코드 
		int coke=1000;
		int cider=800;
		System.out.println("변경 전 콜라 가격은 "+coke+"원이고,"+" 사이다 가격은"+cider+"원");

		int temp=coke;
		coke=cider;
		cider=temp;
		
		System.out.println("콜라 가격은 "+coke+"원이고,"+" 사이다 가격은"+cider+"원");
		
		System.out.printf("=======================\n");
		
		
	}
}
