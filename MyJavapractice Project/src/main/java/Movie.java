// Write a Movie class with:
//
//name (String)
//rating (double)
//Add a method displayMovie() to print movie details.
// Create multiple objects and display their details.

public class Movie {
    public String name;
    public double rating;

    public void displayMovie(){
        System.out.println("Movie : " + name);
        System.out.println("Rating:" + rating);
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();

        movie1.name = "Bollywood";
        movie1.rating = 4.2;

        movie2.name = "Hollywood";
        movie2.rating = 4.0;

        movie1.displayMovie();
        movie2.displayMovie();


    }
}
