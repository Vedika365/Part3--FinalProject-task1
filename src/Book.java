
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

   //convert Case methods to convert title and author to title case
    public void toTitleCase( ) {
        this.title = toTitleCase(this.title);
        this.author = toTitleCase(this.author);

    }
    //TOString method
    public Stirng toString() {
        return "Title :" + title + "\n" +
                "Author:" + author + "\n" +
                "Price :" + String.format( % .2f,price)+"\n" +
                "Publisher :" + publisher + " \n" +
                "ISBN :" + isbn;
    }
    //equals method
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Book other = (Book) obj;
        return Double.equals(other.price, price) == 0 &&
                title.equals(other.title) &&
                author.equals(other.author) &&
                publisher.equals(other.publisher) &&
                isbn.equals(other.isbn);
    }

    //clone method
    public Book clone() {
        return new Book(this);
    }
     //Getter and setters
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = toTitleCase(title);
    }
    public String getAuthor(String author) {
        this.author = author;
    }

    public double getPrice(){
        return price;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setIsbn (String isbn){
        this.isbn = isbn;
    }













}
