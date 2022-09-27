public class Library01 {
    public static void main(String[] args) {
        LibraryClass01 centralLibrary = new LibraryClass01();
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("My New Life!");
        centralLibrary.addBook("Algorithms");

        centralLibrary.showAvailableBooks();
    }
}

class LibraryClass01{
    String [] books;
    int no_of_books;
    LibraryClass01(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(" "+ book + "  has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Avialble books are : ");
        for(String book:this.books){
            if(book == null){
                continue;
            }
            System.out.println("*"+book);
        }

    }
    void issueBook(String book){
        for ( int i =0; i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist!!");
    }
    void returnBook(String book){
        addBook((book));
    }

}