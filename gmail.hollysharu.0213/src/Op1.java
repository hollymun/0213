
public class Op1 {

	public static void main(String[] args) {
		// shift는 int형 데이터를 비트 단위로 미는 연산자
		// 첫 번째 비트는 제외하고 밀어냄
		// 32번 이상은 하지 않고 32이상일 때는 %32한 만큼 밀어냄
		System.out.printf("8<<2: %d\n",8<<2);	
		System.out.printf("8<<34: %d\n",8<<34);	//<<2한 값과 같은 값 출력
		System.out.printf("8>>2: %d\n",8>>2);

		//비트 논리 연산: &, |, ^
		//int형 데이터를 가지고 bit 단위로 연산해서 결과를 정수로 돌려주는 연산자
		//&(and): 둘 다 1일 때만 1, 이외 0 - 0과 &하면 0, 삭제에 이용 
		// |(or): 둘 다 0일 때만 0, 이외 1 - 0과 or하면 원본, 복사에 이용, 색상 더하기 
		// ^(x or - Exclusive Or): 같으면 0 다르면 1 - 비교에 이용 
		System.out.printf("10&6: %d\n",10&6);//2
		System.out.printf("10|6: %d\n",10|6);	//14
		System.out.printf("10^6: %d\n",10^6);//12
		
		System.out.printf("10<<2: %d\n",10<<2);
		System.out.printf("10>>2: %d\n",10>>2);

		
	}
}
