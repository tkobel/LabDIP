/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Tracy
 */
public class TipService {

    public TipService() {
    }
    
    public double getTipAmount(TipCalculator tip) {
        return tip.getTip();
    }
}
