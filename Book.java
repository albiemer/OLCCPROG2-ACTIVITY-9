
import java.util.Scanner;


public class Book {

	String book_name;
	String book_author;
	int book_pages;
	int text_glevel;

	public String getBookname(){
		return book_name;
	}

	public String getBookauthor(){
		return book_author;
	}

	public int getBookpages(){
		return book_pages;
	}

	public int getglevel(){
		return text_glevel;
	}

	public void setBook(String bname, String bauthor, int bpages, int glevel){
		this.book_name = bname;
		this.book_author = bauthor;
		this.book_pages = bpages;
		this.text_glevel = glevel;
}


	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Book Name: ");
		String inputbook = input.next();

		System.out.println("Enter Book Author: ");
		String inputauthor = input.next();

		System.out.println("Enter Book Pages: ");
		int inputpages = input.nextInt();

		System.out.println("Enter Grade Level: ");
		int inputglevel = input.nextInt();

		Book myobj = new Book();

		myobj.setBook(inputbook, inputauthor, inputpages, inputglevel);

		System.out.println("Book Title: "+ myobj.getBookname());
		System.out.println("Book Author: "+ myobj.getBookauthor());
		System.out.println("Book Pages: "+ myobj.getBookpages());
		System.out.println("Book Garde Level: "+ myobj.getglevel());
	}


}
