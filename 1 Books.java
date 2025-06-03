class Books {

    static int  totalBooks;
    String title;
    String author;
    int isbn;
    boolean isBorrowed;

    static {
        totalBooks=0;
    }
    {
        totalBooks++;
    }
    Books( int isbn,String title, String author){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
    }
    Books(int isbn){
        this(isbn,"Unknown","Unknown");
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void BorrowBook(){
        if(isBorrowed) System.out.println("The book is Already Borrowed");
        else {
            this.isBorrowed=true;
            System.out.println("Enjoy Your Book");
        }

    }

    void returnBook(){
        if (isBorrowed) {
            this.isBorrowed=false;
            System.out.println("Hope You Enjoyed visit Again");
        }
        else System.out.println("This Is book is Already in Library");
    }
    public static void main(String[] args) {
        Books GodOfWar= new Books(100,"GodOfWar","Harsh");
        Books HouseOfDragon= new Books(100);

        System.out.println(getTotalBooks());
        GodOfWar.BorrowBook();
        HouseOfDragon.BorrowBook();
        GodOfWar.BorrowBook();
        GodOfWar.returnBook();
        HouseOfDragon.returnBook();

    }
}

