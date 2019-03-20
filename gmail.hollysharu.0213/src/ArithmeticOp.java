
public class ArithmeticOp {

	public static void main(String[] args) {
		byte b1=10;
		byte b2=20;
		//사칙연산과 %연산을 수행할 때 최소 int 
		//byte끼리 연산이지만 실제 수행될 때는 int로 연산함
		//결과를 byte에 대입하고자 하면 강제 형 변환을 해야 함
		//표현 범위가 큰 데이터를 작은 범위의 데이터로 형 변환할 때는 
		//데이터 손실에 유의해야 함 
		byte b3=(byte)(b1+b2);
		System.out.printf("b3: %d\n",  b3);
		
		//나눗셈을 할 때 실수 결과를 얻으려면 실수 자료형으로 강제 형 변환을 해야 함 
		double d=(double)10/3;
		System.out.printf("d: %f\n", d);
		
		System.out.printf("======================\n");
	/*	
		// %로 반복하는 제어문 만들기  :요일 반복 
		for(int i=0; i<10;i=i+1) {
			try {
				Thread.sleep(1000); //1초 대기 
				int r=i%7;
				if(r==0) {
					System.out.printf("월\n");
				}
				if(r==1) {
					System.out.printf("화\n");
				}
				if(r==2) {
					System.out.printf("수\n");
				}
				if(r==3) {
					System.out.printf("목\n");
				}
				if(r==4) {
					System.out.printf("금\n");
				}
				if(r==5) {
					System.out.printf("토\n");
				}
				if(r==6) {
					System.out.printf("일\n");
				}
			}catch(Exception e) {}
		}
	*/	
		
		for(int i=0; i<10;i=i+1) {
			try {
				Thread.sleep(1000); //1초 대기 
				int r=i%6;
				if(r==0||r==2||r==4) {
					System.out.printf("흰\n");
				}
				if(r==1||r==3) {
					System.out.printf("파\n");
				}
				if(r==5) {
					System.out.printf("노랭\n");
				}

			}catch(Exception e) {}
		}
		
/*
		for(int i=0; i<10;i=i+1) {
			try {
				Thread.sleep(1000); //1초 대기
				Random ra=new Random();
				int r=ra.nextInt(6);
				if(r==0||r==2||r==4) {
					System.out.printf("흰\n");
				}
				if(r==1||r==3) {
					System.out.printf("파\n");
				}
				if(r==5) {
					System.out.printf("노랭\n");
				}

			}catch(Exception e) {}
		}
*/		

	}
}
