package day13.pkg;

public class Cal {
	
	void addition(int num1 , int num2) {
		System.out.println("결과입니다 : "+ (num1+num2));
	}
	void subtraction(int num1 , int num2) {		
		System.out.println("결과입니다 : "+(num1-num2));
	}
	int multiplication(int num1, int num2) {
		return num1*num2;
	}
	int division(int num1 , int num2) {
		return num1/num2;
	}
	/*
	 * int div(){ 이렇게도 씀
	 * 			Scanner scan = new Scanner(sysin);
	 * 			sysout("숫자1:")
	 * 			int num1 = scan.nextInt();
	 * 			sysout("숫자2:")
	 * 			int num2 = scan.nextInt();
	 * 			int div = num1/num2;
	 * 			return div;
	 * }
	 */
	
	
}
