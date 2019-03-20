import java.util.Scanner;

public class KeyBoardInput {

	public static void main(String[] args) {
		
		//정수 한 개를 입력 받아서 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("언어점수를 입력하세요\n");
		int score=sc.nextInt();
		System.out.printf("언어점수:%d\n",score);
		
		System.out.printf("수학점수를 입력하세요\n");
		int score2=sc.nextInt();
		System.out.printf("수학점수:%d\n",score2);

		//다른 입력을 받고 문자열을 입력받을 때는 nextLine을 한 번 더 불러줘야 함
		//점수를 입력하고 ENTER로 넘어가지만 점수가 담긴 변수 int는 ENTER 못 가져가고 다음으로 넘어감 
		
		//int에는 enter가 안 담겨서 다음으로 넘어가지만 String에는 enter가 담기기 때문에 출력이 또 되는 건가? O

		System.out.printf("이름을 입력하세요\n");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.printf("이름:%s\n",name);

		sc.close();
	}
}