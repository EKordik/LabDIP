/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.text.DecimalFormat;

/**
 * TipCalculatorService to calculate tips.
 * This is a high level class. The constructor accepts a TipCalculatorStrategy to
 * be used when calculating the tip. It also has a setTipPercent method that 
 * accepts a double as a parameter and sends that to the TipCalculatorStrategy
 * The calculateTip method calculates the proper tip amount.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class TipCalculatorService {
    private TipCalculatorStrategy tip;
    
    public TipCalculatorService(TipCalculatorStrategy tip){
        this.tip=tip;
    }
    /**
     * Sets the percent of the tip
     * @param percent 
     */
    public void setTipPercent(double percent){
        tip.setPercent(percent);
    }
    
    //Calculates the amount of the tip
    public String calculateTip(){
        DecimalFormat formatTip = new DecimalFormat("$###,##0.00");
        
        return "Tip Amount: " + formatTip.format(tip.calculateTip());
    }
}
