package day0323;

public class BookTest {

	public static void main(String[] args) {
		try {
			f3();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void f3() throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
	}

	private static void f2() throws CloneNotSupportedException {
		Author[] arr = new Author[3];
		arr[0] = new Author("신용권", 'M', "010-1234-5678");
		Book b1 = new Book("이것이자바다", 30000, arr);
		Book b4 = (Book)b1.clone();
		b1.title = "자바의 정석";
		b1.price = 40000;
		b1.author[0].name = "홍길동";
		b1.author[0].gender = '남';
		b1.author[0].phone = "1234-5678";
		System.out.println(b1);
		System.out.println(b4);
	}

	private static void f1() throws CloneNotSupportedException {
		Author[] arr = new Author[3];
		arr[0] = new Author("신용권", 'M', "010-1234-5678");
		Book b1 = new Book("이것이자바다", 30000, arr);
		Book b2 = new Book("이것이자바다", 30000, arr);
		Book b3 = b1; //주소복사 
		Book b4 = (Book)b1.clone(); //복제 
		b1.title = "자바의정석";
		b1.price = 50000;
		b1.author[0].name = "홍길동";
		b1.author[0].gender = '남';
		b1.author[0].phone = "12345678900";
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(b4.toString());
		
		System.out.println(b1 == b2);  //주소비교 false....System.identityHashCode()
		System.out.println(b1 == b3);  //주소비교 true
		System.out.println(b1.equals(b2)); //default는 주소비교 ...재정의가능..내용비교변경 
		System.out.println(b1.equals(b3));
		
		/*
		System.out.println(System.identityHashCode(b1));
		System.out.println(System.identityHashCode(b2));
		System.out.println(System.identityHashCode(b3));
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());*/
		
		
		
	}

}
