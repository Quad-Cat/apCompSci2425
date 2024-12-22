package pkg;

public class Movie{
    
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    
    public Movie() {
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue) {
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    
    //Methods
        //part 2
    public void movieToString() {
        System.out.println("\nMovie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
    }
    
        //part 3
    public String getMovieName() {
        return this.movieName;
    }
    
    public int getRevenue() {
       return this.revenue;
    }
    
         //part 4
    public void addRating(double newRating) {
        this.rating = ((this.rating * this.numRatings) + newRating) / (this.numRatings + 1);
        numRatings++;
    }
    
        //part 5
    public boolean compareRatings(Movie otherMovie) {
        if (this.rating > otherMovie.rating) {
            return true;
        } else {
            return false;
        }
        
    }
    
        //part 6
    public String revenueToString() {
        String rev = "" + this.revenue;
        int count = 1;
        
        // String a = "" + this.revenue % 1000;
        // String b = "" + this.revenue % 1000000;
        
        // return (a + b);
        
        while (count<3) {
            rev = rev + "," + (this.revenue % (count * 1000) );
            count++;
        } 
        
        return rev;
    }
        
        
        //part 7
    public Movie pirateMovie() {
        return new Movie(this.movieName, this.rating, this.numRatings, this.revenue);
    }
    
    
}
