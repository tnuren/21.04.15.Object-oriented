package day13.pkg;

import java.util.*;

public class Day13_02_ArrayList_Test01 {

	public static void main(String[] args) {
		/*
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력받고 입력받은 단어를 모두 출력하고 마지막에는 가장 긴 단어를 출력하세요.
		 *  str var1 = water; sysout (var1.length()); 
		 * 사용 가능 단어 입력용 for문 출력용 for문 긴단어 찾기용 for문
		 */

		List<String> list = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		String word = "";
		int num = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("단어를 입력하세요 : ");
			word = scan.next();
			list.add(word);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > list.get(num).length()) {
				num = i;
			}
		}
		System.out.println("가장 긴 단어 : " + list.get(num));
		
	}
}
