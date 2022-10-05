//Isaac Lee, Resuming the solution of the previous exercise, let’s suppose we want to make our bookstore sell also music albums. So, let’s create the Album class, bearing in mind that even for music albums there is an identification number called ISMN (although there are other ways to identify an album as using the European EAN standard), as well as for books there is the ISBN identification number. Then check if there is an inheritance relationship between the Book class and the Album class. If it exists, implement a solution.

public class Album extends Item { private String ismn;
  private String title;
  private String artist; 
  private String genre;
  private String price;
                                 
  public Album(String ismn, String title, String artist, String genre, String price) {
    setIsmn(ismn);
    setTitle(title); setArtist(artist); setGenre(genre); setPrice(price);
  }
                                 
  public String getIsmn() {
    return ismn; 
  }
  public void setIsmn(String ismn) {
    this.ismn = ismn; 
  }
  public String getTitle() {
    return title; 
  }
  public void setTitle(String title) {
    this.title = title; 
  }
  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist; 
  }                             
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre; 
  }
  public String getPrice() {
    return price; 
  }
  public void setPrice(String price) {
    this.price = price; 
  }
}
  
