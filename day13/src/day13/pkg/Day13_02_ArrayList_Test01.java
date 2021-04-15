package day13.pkg;

import java.util.*;

public class Day13_02_ArrayList_Test01 {

	public static void main(String[] args) {
		/*
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력받고 입력받은 단어를 모두 출력하고 마지막에는 가장 긴 단어를 출력하세요. str
		 * var1 = water; sysout (var1.length()); 사용 가능
		 */

		String word = "";
		String word2 = "";
		String word3 = "";
		String word4 = "";
		String word5 = "";

		boolean run = true;

		List<String> list = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.print("단어를 입력하세요 : ");
			word = scan.next();
			list.add(word);
			System.out.print("단어를 입력하세요 : ");
			word2 = scan.next();
			list.add(word2);
			System.out.print("단어를 입력하세요 : ");
			word3 = scan.next();
			list.add(word3);
			System.out.print("단어를 입력하세요 : ");
			word4 = scan.next();
			list.add(word4);
			System.out.print("단어를 입력하세요 : ");
			word5 = scan.next();
			list.add(word5);
			for(int i=0 ; i<list.size(); i++) {
				System.out.println(list.get(i));				
				run = false;
				
				System.out.println("가장 긴 단어는 : "+list.size());
			}
			
			}
			
		}
	}


