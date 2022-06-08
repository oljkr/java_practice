package ch01;

class Note {	
	int price=3000;
}

	
public class VarEx04 {

	public static void main(String[] args) {
		Note note1 = new Note();
		Note note2 = new Note();
		Note note3 = new Note(); //heap 공간
		int age=25;//main stack 공간
		System.out.println(age);
		System.out.println(note1.price);
		System.out.println(note2.price);
		System.out.println(note3.price);
		note3.price=30000;
		System.out.println(note3.price);
		
	}

}
