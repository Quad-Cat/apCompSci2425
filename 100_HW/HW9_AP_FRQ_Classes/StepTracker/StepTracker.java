

public class StepTracker {
    
    public StepTracker(minSteps) {
        int minActiveSteps = minSteps;
        int activeDays = 0;
        double averageSteps = 0;
        int totalSteps = 0;
        int totalDays = 0;
    }
    
    public void addDailySteps(steps) {
        totalSteps = totalSteps + steps;
        
        averageSteps = (totalDays * averageSteps + steps) / (totalDays + 1);
        totalDays++;
        
        if (steps >= minActiveSteps) {
            activeDays++;
        }
        
    }
    
    public int activeDays() {
        return this.activeDays;
    }
    
    public double averageSteps() {
        return this.averageSteps;
    }
    
    
}