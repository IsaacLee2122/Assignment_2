//Isaac Lee,  Create a Book class, so that it encapsulates the concept of a book that can be sold in a bookstore. Among the fields defined by the Book class, there must be the genre field (understood as a literary genre). Let’s make it possible for a book to be associated with only a literary genre included between a set of predefined literary genres, for example the set consisting of the genres: software, novel, thriller, essay, manual. Create a class that tests that Book objects work correctly.//



public class Book {

String bookName;
int price;
String author;
String genre;


public Book() {
super();
}


public Book(String bookName, int price, String author, String genre) {
super();
this.bookName = bookName;
this.price = price;
this.author = author;
this.genre = genre;
}



public String getBookName() {
return bookName;
}


public void setBookName(String bookName) {
this.bookName = bookName;
}


public int getPrice() {
return price;
}


public void setPrice(int price) {
this.price = price;
}


public String getAuthor() {
return author;
}


public void setAuthor(String author) {
this.author = author;
}


public String getGenre() {
return genre;
}


public void setGenre(String genre) {
this.genre = genre;
}


@Override
public String toString() {
return "Book [bookName=" + bookName + ", price=" + price + ", author=" + author + ", genre=" + genre + "]";
}



}

Test.java

import java.util.ArrayList;
public class Test {

public static void main(String[] args) {
Book b1=new Book();


Book b2=new Book("When Breath Meets Air");
Book b3=new Book("Cracking The Coding Interview");
Book b4=new Book("Long Live The Pumpkin Queen");

ArrayList<Book> arrayList = new ArrayList<Book>(); 
arrayList.add(b2);
arrayList.add(b3);
arrayList.add(b4);
arrayList.add(b1);


for(Book book: arrayList) {
System.out.println(book); 
}



String genre=b3.getGenre();
System.out.println("the Genre for book 3 is"+genre);


}
