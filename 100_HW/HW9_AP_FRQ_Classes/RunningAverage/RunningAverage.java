import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
        /* implementation not shown */
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        /* to be implemented in part (a) */
        average = ((this.average * this.count) + newVal) / (count+1);
        count++;
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        /* to be implemented in part (b) */
        realRatings = 0;
        fakeRatings = 0;
        
        for (int i = 0; i<num; i++) {
            
            int newRating = getNewRating();
            
            if (newRating >= 0) {
                updateAverage(newRating);
            }
            
        }
        
        //if all values fit, then it returns 0
        //if none of the values fit, it returns 1
        //if some of the values it, it returns 2
        if (fakeRatings == 0) {
            return 0;
        } else if (realRatings == 0) {
            return 1;
        } else {
            return 2;
        }
        
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        /* implementation not shown */
    }
}
