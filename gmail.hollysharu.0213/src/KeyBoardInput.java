import java.util.Scanner;

public class KeyBoardInput {

	public static void main(String[] args) {
		
		//���� �� ���� �Է� �޾Ƽ� ���
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("��������� �Է��ϼ���\n");
		int score=sc.nextInt();
		System.out.printf("�������:%d\n",score);
		
		System.out.printf("���������� �Է��ϼ���\n");
		int score2=sc.nextInt();
		System.out.printf("��������:%d\n",score2);

		//�ٸ� �Է��� �ް� ���ڿ��� �Է¹��� ���� nextLine�� �� �� �� �ҷ���� ��
		//������ �Է��ϰ� ENTER�� �Ѿ���� ������ ��� ���� int�� ENTER �� �������� �������� �Ѿ 
		
		//int���� enter�� �� ��ܼ� �������� �Ѿ���� String���� enter�� ���� ������ ����� �� �Ǵ� �ǰ�? O

		System.out.printf("�̸��� �Է��ϼ���\n");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.printf("�̸�:%s\n",name);

		sc.close();
	}
}