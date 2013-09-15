package dip.lab2.student.solution1;

/**
 *
 * @author Tracy
 */
public interface TipCalculator {
    public static double GOOD_RATE = 0.20;
    public static double FAIR_RATE = 0.15;
    public static double POOR_RATE = 0.10;
    public abstract double getTip();
    public ServiceQuality getServiceQuality();
}
