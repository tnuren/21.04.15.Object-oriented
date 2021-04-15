package day13.pkg;

import java.util.*;


public class Day13_01_ArrayList_Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList
		/*
		 * Collection Framework : List(★) , Set , Map
		 */		
		// ArrayList 선언 (저장 데이터 타입 : String)
		List<String> list = new ArrayList<String>();
		
		// list 에 데이터 저장 : add 메소드 호출
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add(1, "네번째"); // 밀어내기 가능
		list.add(1, "다섯번째");
		// list에 담긴 데이터 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// list 크기 확인
		System.out.println(list.size());
		
		// list 데이터 삭제 (index 값을 준다 , 지우면 땡겨진다 )
		list.remove(1);
		System.out.println(list.get(1));
		
		// for문을 이용하여 list에 담긴 모든 데이터 출력
		
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
		
		// list에 정수를 저장할 때
		// <> 제네릭 Genenic?	
		// <> 안에 클래스이름이 들어올수있다
		List<Integer> list1 = new ArrayList<Integer>(); // Integer ==> Wrapper Class(Int 를 감싸는 클래스) 
		
		String var = "값";
		
		
		
		
	}

}
