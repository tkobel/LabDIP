/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.text.NumberFormat;

/**
 *
 * @author Tracy
 */
public class Startup {
    
    public static void main(String[] args){
       
        TipCalculator bill1 = new FoodServiceTipCalculator(ServiceQuality.GOOD, 55);
        TipCalculator bill2 = new FoodServiceTipCalculator(ServiceQuality.POOR, 55);
        TipCalculator bill3 = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 5);
        
        TipCalculator[] tips = {bill1, bill2, bill3};
        
        TipService tipService = new TipService();
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        for(int i=0; i<tips.length; i++) {
            System.out.println("Tip amount: " + nf.format(tipService.getTipAmount(tips[i])));
        }
    }
}
