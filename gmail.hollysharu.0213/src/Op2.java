
public class Op2 {

	public static void main(String[] args) {
		System.out.printf("%b\n",true&&false);
		//System.out.printf("%b\n",true||false); //dead code ���� : ||�� ���� true�̸� ���ʱ��� ���� ���� 

		int x=10;
		//&&�� ���� ������ ����� false�� ���� ������ ���� ���� 
		boolean result=x>5 && ++x>5;
		System.out.printf("x:%d\n",x); // 11
		result=x>20 && ++x>5;
		System.out.printf("x:%d\n",x); // 11 : &&�� ++���� ���� �ʰ� �״�� ���

		
		int year=2019;
		//year�� 2000 �̻����� Ȯ���ϴ� �ڵ� 
		result=year>=2000;
		System.out.printf("result1: %b\n", result);
		//year�� 4�� ������� Ȯ��
		result=year%4==0;
		System.out.printf("result2: %b\n", result);
		//year�� 4�� ����̰� 100�� ����� �ƴ� ��츦 Ȯ��
		result=year%4==0 &&  year%100!=0;
		System.out.printf("result3: %b\n", result);
		//year�� (4�� ����̰� 100�� ����� �ƴ� ���) �Ǵ� 400�� ����� ��� Ȯ��
		result=year%4==0 && year%100!=0 || year%400==0;
		System.out.printf("���� ����: %b\n", result);
		
		//1-100������ �����Ͱ� �ֽ��ϴ� 
		//3�� ����̰� 4�� ������� Ȯ��
		//3�� ����� Ȯ���ϰ� 4�� ����� Ȯ���ϴ� ���� ������
		//�ƴϸ� 4�� ����� Ȯ���ϰ� 3�� ����� Ȯ���ϴ� ���� ������ Ȯ��
		
		for(int i=1; i<100; i=i+1) {
			if(i%4==0 && i%3==0) {
				System.out.printf("i: %d\n", i);
			}
		}



		
	}
}
