import java.util.Scanner;


class Book{

	String book_name;
	String book_author;
	int book_pages;

	public String getBookname(){
		return book_name;
	}

	public String getBookauthor(){
		return book_author;
	}

	public int getBookpages(){
		return book_pages;
	}


	public void setBook(String bname, String bauthor, int bpages){
		this.book_name = bname;
		this.book_author = bauthor;
		this.book_pages = bpages;
	}





}

class Textbook extends Book{

	int text_glevel;

	public int getglevel(){
		return text_glevel;
	}

	public void setglevel(int glevel){

		this.text_glevel = glevel;

	}
}


public class Demobook{
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

		Textbook txbk = new Textbook();
		Book myobj = new Book();

		txbk.setglevel(inputglevel);
		myobj.setBook(inputbook, inputauthor, inputpages);

		System.out.println("Book Title: "+ myobj.getBookname());
		System.out.println("Book Author: "+ myobj.getBookauthor());
		System.out.println("Book Pages: "+ myobj.getBookpages());
		System.out.println("Book Garde Level: "+ txbk.getglevel());
	}

}
