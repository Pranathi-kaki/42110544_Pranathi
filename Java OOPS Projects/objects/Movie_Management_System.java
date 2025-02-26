package com.objects;

class Movie {
    String title;
    String director;
    String genre;
    double rating;

    public Movie(String title, String director, String genre, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }

    public void updateRating(double newRating) {
        this.rating = newRating;
        System.out.println("The rating has been updated to: " + rating);
    }
}

public class Movie_Management_System {

	public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan", "Sci-Fi", 8.8);
        System.out.println("Movie Details:");
        movie.displayDetails();
        movie.updateRating(9.0);
        System.out.println("\nUpdated Movie Details:");
        movie.displayDetails();
    }

}
