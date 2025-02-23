//Write a Book class with the following fields:

//title (String)
//author (String)
//Add a method display() that prints the book details.
//In the main method,
// create two Book objects and call their display() methods.


public class Book {
    String title;
    String author;

    public void display(){
        System.out.println("Title: " + title );
        System.out.println("Author: " + author);
    }

    public static void main(String[] args){

        Book book1 = new Book();
        book1.title = "My First Book";
        book1.author = "Divya";

        Book book2 = new Book();
        book2.title = "Story Time";
        book2.author = "Sam";

        book1.display();
        book2.display();

    }






}
