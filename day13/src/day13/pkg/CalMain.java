package day13.pkg;

import java.util.Scanner;

public class CalMain {

public static void main(String[] args) {

		Cal c1 = new Cal();
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int select = 0;
		int number = 0;
		int number2 = 0;

		
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println(" 1. 덧셈   ㅣ  2.뺄셈   ㅣ  3. 곱셈   ㅣ  4.나눗셈");
			System.out.println("---------------------------------------------");
			System.out.print("선택 > ");
			select = scan.nextInt();
			if (select == 1) {
				System.out.print("첫번째 숫자를 입력하세요 > ");
				number = scan.nextInt();
				System.out.print("두번째 숫자를 입력하세요 > ");
				number2 = scan.nextInt();
				c1.addition(number ,number2 );

			} else if (select == 2) {
				System.out.print("첫번째 숫자를 입력하세요 > ");
				number = scan.nextInt();
				System.out.print("두번째 숫자를 입력하세요 > ");
				number2 = scan.nextInt();
				c1.subtraction(number, number2);

			} else if (select == 3) {
				System.out.print("첫번째 숫자를 입력하세요 > ");
				number = scan.nextInt();
				System.out.print("두번째 숫자를 입력하세요 > ");
				number2 = scan.nextInt();
				int mul = c1.multiplication(number, number2);
				System.out.println("결과입니다 : "+ (mul));

			} else if (select == 4) {
				System.out.print("첫번쨰 숫자를 입력하세요 > ");
				number = scan.nextInt();
				System.out.print("두번째 숫자를 입력하세요 > ");
				number2 = scan.nextInt();
				System.out.println("결과입니다 : "+ c1.division(number, number2));

			} else {
				run = false;
				System.out.println("종료합니다.");
			}
		}

	}

}
