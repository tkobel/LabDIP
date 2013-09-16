package dip.lab1.student.solution1;

/**
 *
 * @author Tracy
 */
public class HRService {
    private Employee employee;

    public double getAnnualPayForEmployee(Employee e) {
        return e.getAnnualWages();
    }
}
