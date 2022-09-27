public class LibraryHarrySolution {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Algorithms");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++");
        centralLibrary.returnBook("C++");
    }
}
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available Book are :");

        for(String x: this.books){
            if(x == null) {
                continue;
            }
            System.out.println("*" + x);
        }
    }
    void issueBook(String book){
        for(int i = 0; i<this.books.length;i++){
            String b = this.books[i];
            if(this.books[i] == book) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("this book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }

}
