
public class ObjectDecler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book();
		book1.name = "Java Programming";
		book1.price = 600.0;
		book1.author = "test";
		book1.show();
		
		
		
	}

}
class Book{

	String name;
	double price;
	String author;
	
	void show(){
		System.out.println("書名: " + name);
		System.out.println("定價: " + price);
		System.out.println("作者: " + author);
	}
	
}
