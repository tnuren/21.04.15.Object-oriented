package day13.pkg;

public class Board {

	int bNumber;
	String bTitle;
	String bWriter;
	String bContents;
	// 기본생성자
	Board(){
		
	}
	// 매개변수 있는 생성자
	Board(int bNumber ,String bTitle ,
			String bWriter , String bContents ){
		
	}
	
	
	void boardWrite(int bNumber ,String bTitle ,
			String bWriter , String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
		}
	void boardView() {
		System.out.println(this.bNumber);
		System.out.println(this.bTitle);
		System.out.println(this.bWriter);
		System.out.println(this.bContents);
	}
	void boardUpdate(String bTitle , String bContents) {
		this.bTitle = bTitle;
		this.bContents = bContents;
		System.out.println(this.bTitle);
		System.out.println(this.bContents);
			
	}
	
	
	
}
