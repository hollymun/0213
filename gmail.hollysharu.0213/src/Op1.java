
public class Op1 {

	public static void main(String[] args) {
		// shift�� int�� �����͸� ��Ʈ ������ �̴� ������
		// ù ��° ��Ʈ�� �����ϰ� �о
		// 32�� �̻��� ���� �ʰ� 32�̻��� ���� %32�� ��ŭ �о
		System.out.printf("8<<2: %d\n",8<<2);	
		System.out.printf("8<<34: %d\n",8<<34);	//<<2�� ���� ���� �� ���
		System.out.printf("8>>2: %d\n",8>>2);

		//��Ʈ �� ����: &, |, ^
		//int�� �����͸� ������ bit ������ �����ؼ� ����� ������ �����ִ� ������
		//&(and): �� �� 1�� ���� 1, �̿� 0 - 0�� &�ϸ� 0, ������ �̿� 
		// |(or): �� �� 0�� ���� 0, �̿� 1 - 0�� or�ϸ� ����, ���翡 �̿�, ���� ���ϱ� 
		// ^(x or - Exclusive Or): ������ 0 �ٸ��� 1 - �񱳿� �̿� 
		System.out.printf("10&6: %d\n",10&6);//2
		System.out.printf("10|6: %d\n",10|6);	//14
		System.out.printf("10^6: %d\n",10^6);//12
		
		System.out.printf("10<<2: %d\n",10<<2);
		System.out.printf("10>>2: %d\n",10>>2);

		
	}
}
