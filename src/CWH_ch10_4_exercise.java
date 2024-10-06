  //--------------Online Library_____Management---
class Library{
    String[] books;
    int no_of_books;
     Library(){
         this.books=new String[100];
         this.no_of_books=0;
     }
     void addBooks(String book){
         this.books[no_of_books]=book;
         no_of_books++;
         System.out.println("Book is added " +book);
     }
     void showAvailableBook(){
         System.out.println("Available Books are: ");
         for (String book:this.books){
             if (book==null){
                 continue;
             }
             System.out.println("* " +book);

         }

     }
      void issueBook(String book){
          for (int i=0;i<this.books.length;i++){
              if (this.books[i].equals(book)){
                  System.out.println("The book has been issued!");
                  this.books[i] = null;
                  return;
              }
          }
          System.out.println("This book does not exist");
      }
      void returnBook(String book){
          addBooks(book);
      }

  }


public class CWH_ch10_4_exercise {
    public static void main(String[] args) {
        //You have  to Implement a Library using Java Class Library
        //Method : addBooks, IssueBook , ReturnBook,Show available Book
        //Property: Array to Store the available books ,
        // array to store Issued Books
        Library CentralLibrary = new Library();
        CentralLibrary.addBooks("Wings of Fly");
        CentralLibrary.addBooks("Trigonometry");

        CentralLibrary.addBooks("Algorithm");
        CentralLibrary.addBooks("Think and Grow");
        CentralLibrary.showAvailableBook();

        CentralLibrary.issueBook("Algorithm");
//        CentralLibrary.issueBook("Maths Foundation");
        CentralLibrary.showAvailableBook();

        CentralLibrary.returnBook("Algorithm");
        CentralLibrary.showAvailableBook();

    }
}
