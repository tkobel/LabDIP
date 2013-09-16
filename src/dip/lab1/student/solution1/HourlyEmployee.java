package dip.lab1.student.solution1;

/**
 *
 * @author Tracy
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyRate;
    private double totalHrsForYear;
    private final int MAX_HOURS_IN_A_YEAR = 8376;
    
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    
    @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > MAX_HOURS_IN_A_YEAR) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }
    
}
