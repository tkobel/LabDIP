package dip.lab1.student.solution1;
import java.text.NumberFormat;
/**
 *
 * @author Tracy
 */
public class Startup {
    public static void main(String[] args) {
        
        HourlyEmployee emp1 = new HourlyEmployee(17, 2335);
        SalariedEmployee emp2 = new SalariedEmployee(55000, 25000);
        SalariedEmployee emp3 = new SalariedEmployee(80000,9500);
        
        Employee[] employees = {emp1, emp2, emp3};

        HRService hr = new HRService();

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:" + 
                    nf.format(hr.getAnnualPayForEmployee(employees[i])));
            
        }
    }
}
