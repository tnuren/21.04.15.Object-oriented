package day13.pkg;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board b = new Board();
		
		b.boardWrite(11111, "개미", "베르", "개미내용");
		b.boardView();
		b.boardUpdate("여왕개미", "여왕개미내용");
		
		Board b2 = new Board(22222 , "책1" , "작성자" , "내용");
		b2.boardWrite(22222, "책1", "작성자", "내용");
		b2.boardView();
		b2.boardUpdate("책2", "바뀐내용");
		
		
		
		
	}

}
