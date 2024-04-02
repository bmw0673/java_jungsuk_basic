import java.util.Scanner;

class Ex2_10 { 
	public static void main(String[] args) {
//		화면으로부터 입력받기 예제
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		System.out.println(num);
		
//		nextLine 행 단위로 입력받기
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
		
//		모든입출력은 열어주고나서 닫아주어여 함
		scanner.close();
	} 
}