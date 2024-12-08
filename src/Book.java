public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    //default constructor
    public Book() {
        this.title = title;
        this.author = "kjfdla";
        this.price = 0.0;
        this.publisher = "to Be confirmed";
        this.isbn = " ";
    }
    //constructor with title
    public Book(String title ){
        this.title = title;
        this.author = " not sure yet";
        this.price =0.0;
        this.publisher = " to be confirmed";
        this.isbn = " ";

    }
  ///constructor with all data members
    public Book(String title, String author, double price, String publisher, String isbn ){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }
      //copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.publisher = other.publisher;
        this.isbn = other.isbn;
        this.price = other.price;
    }
   //check the isbn
   public int checkIsbnStatus(){
        if (isbn.length()==17 ){
            return 1;
        }
        else if (isbn.length()==13){
            return 0;
        }
        return -1; //it means invalid ISBN
   }
    












}
