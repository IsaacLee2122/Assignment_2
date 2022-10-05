//Isaac Lee,  Taking into account the previous exercise, create also the Bookcase class (understood as a bookcase inside a bookstore). Each bookcase must be dedicated to a certain literary genre included in the list of genres chosen in the previous exercise, and therefore must contain only books of the same genre. In the Bookcase class there must be a method called addBook(Book book), which allows you to add a book with the correct genre to the bookcase. Also create the Bookstore class. A bookstore must contain only one bookcase for each genre, and therefore it is necessary to prevent that two bookcases with the same genre can be added. Finally create a BookstoreTest class, which creates an object of type Bookstore adding to it objects of type Bookcase to which have been added objects of type Book. Verify that two bookcases with the same genre cannot be added to the bookstore.





import java.util.*;


class Book{
    String name;
    String genre;



    Book(String name,String genre){
        this.name = name;
        this.genre = genre;
    }

  
    public void setName(String name) {
        this.name = name;
    }

   
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

  
    public String getName() {
        return name;
    }

 
    public String toString(){
        return name;
    }
}



class Bookcase{
    ArrayList<Book> bookcase = new ArrayList<>();;
    String genre;

    Bookcase(String genre){
        this.genre = genre;
    }

   
    void addBook(Book book){
        if(book.getGenre().compareTo(genre)==0){
            bookcase.add(book);
        }else{
            System.out.println("Book belong to different genre");
        }
    }


   
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
   
    public String getGenre() {
        return genre;
    }

   
    public void setBookcase(ArrayList<Book> bookcase) {
        this.bookcase = bookcase;
    }


 
    public ArrayList<Book> getBookcase() {
        return bookcase;
    }

  
    public String toString(){
        String output="";

        output +=genre+ " : \n";
        for(Book book:bookcase){
            output += "\t"+book.toString()+"\n";
        }
        output +="\n";
        return output;
    }
}


class Bookstore{
    private static Bookstore instance = null;
    ArrayList<Bookcase> bookstore = new ArrayList<>();

    private Bookstore(){

    }

   
    public static Bookstore getInsatance(){
        if(instance ==null){
            instance = new Bookstore();
        }
        return instance;
    }

    
    void addBookCase(Bookcase bc){
        boolean flag = false;
        for(Bookcase bookcase : bookstore){

          
            if(bookcase.getGenre().compareTo(bc.getGenre())==0){

                System.out.println("This genre bookcase already present...");
                System.out.println("Merging book case");
                flag = true;
                bookcase.bookcase.addAll(bc.bookcase);
                System.out.println("done...");
            }   
        }

        
        if(flag==false){
            bookstore.add(bc);
        }
    }

  
    public String toString(){
        String output ="";
        for(Bookcase bc:bookstore){
            output += bc.toString();
        }

        return output;
    }
}

public class BookstoreTest{
    public static void main(String[] args) {

       
        Bookstore bookStore = Bookstore.getInsatance();

        
        Bookcase bc_novel1 = new Bookcase("novel");
        Bookcase bc_novel2 = new Bookcase("novel");
        Bookcase bc_thriller = new Bookcase("thriller");
        Bookcase bc_essay = new Bookcase("essay");
        Bookcase bc_manual = new Bookcase("manual");
       

    
        Book b1 = new Book("The Great Gatsby", "novel");
        Book b2 = new Book("To Kill a Mockingbird", "novel");
        bc_novel1.addBook(b1);
        bc_novel1.addBook(b2);

        Book b3 = new Book("The Catcher in the Rye", "novel");
        Book b4 = new Book("East of Eden", "novel");
        bc_novel2.addBook(b3);
        bc_novel2.addBook(b4);


        Book b5 = new Book("The Girl With The Dragon Tattoo", "thriller");
        Book b6 = new Book("Gone Girl", "thriller");
        bc_thriller.addBook(b5);
        bc_thriller.addBook(b6);


        Book b7 = new Book("Aleksandar Hemon","essay");
        Book b8 = new Book("Robin Wall Kimmerer","essay");
        bc_essay.addBook(b7);
        bc_essay.addBook(b8);

        Book b9 = new Book("IPhone: The Missing Manual","manual");
        Book b10 = new Book("The Manual: A Philosopher's Guide to Life","manual");
        bc_manual.addBook(b9);
        bc_manual.addBook(b10);

        bookStore.addBookCase(bc_novel1);
        bookStore.addBookCase(bc_novel2);
        bookStore.addBookCase(bc_thriller);
        bookStore.addBookCase(bc_essay);
        bookStore.addBookCase(bc_manual);

        System.out.println(bookStore);
        
        bc_manual.addBook(b7);


    }
}
