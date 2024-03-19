import java.util.Scanner;
public class Ex403 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		
		Scanner z = new Scanner(System.in);
		int grade = z.nextInt();
		
		if (grade >= 90) {
			System.out.println("A!! 당신은 천재다!~~");
			
		}else if (grade >= 80) {
			System.out.println("B - 괜찮아 ~ 괜찮아~");
			
		}else if (grade >=70) {
			System.out.println("C -어짜피 졸업은 하겠네");
		
		}else if (grade >=60) {
			System.out.println("D - 게임 많이했네");
			
		}else {
			System.out.println ("F - OTL 우을증 걸리겠네");
		}
		

	}

}
