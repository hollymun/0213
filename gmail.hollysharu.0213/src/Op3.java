
public class Op3 {

	public static void main(String[] args) {
		int n1=10;
		int n2=5;
		//n1�� n2 �� ū �� ã��
		int result=n1>n2?n1:n2; //n1�� n2���� ū��? ũ�ٸ� n1, �ƴ϶�� n2�� ��� 
		System.out.printf("result: %d\n", result);
		
		//������ F �Ǵ� M���� ���� 
		char gender='m';
		//gender�� M�̸� ���ڶ�� ���, F�� ���ڶ�� ��� 
		//���� �����ڸ� �̿��ؼ� �ذ� 
		String x=gender=='M' || gender=='m'? "����":"����";
		System.out.printf("����: %s\n", x);
		
		//���� ������ 0-100������ ���ڸ� �����ϰ� 
		//60�̻��̸� �հ� �׷��� ������ ���հ� 
		int score=80;
		String passOrNon=score>=60?"�հ�":"���հ�";
		System.out.printf("�հݿ���: %s\n", passOrNon);
		
		//score�� 80�̻��̸� ���, 60 �̻��̸� ����, �� ���ϴ� ������� ���
		int score2=-2;
		passOrNon=score2>100||score2<0?"0-100 ������ ���� �Է��ϼ���": score2>=80?"���": score2<60?"����":"����";
		System.out.printf("���: %s\n", passOrNon);

		System.out.printf("=======================\n");

		
		//2���� ������ ����� ���� ��ȯ�ϴ� swap �ڵ� 
		int coke=1000;
		int cider=800;
		System.out.println("���� �� �ݶ� ������ "+coke+"���̰�,"+" ���̴� ������"+cider+"��");

		int temp=coke;
		coke=cider;
		cider=temp;
		
		System.out.println("�ݶ� ������ "+coke+"���̰�,"+" ���̴� ������"+cider+"��");
		
		System.out.printf("=======================\n");
		
		
	}
}
