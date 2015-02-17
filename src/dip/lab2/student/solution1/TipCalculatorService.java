/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author ekordik
 */
public class TipCalculatorService {
    private TipCalculatorStrategy tip;
    
    public TipCalculatorService(TipCalculatorStrategy tip){
        this.tip=tip;
    }
    
    //Sets the percent of the tip
    public void setTipInfo(double percent){
        tip.setPercent(percent);
    }
    
    //Calculates the amount of the tip
    public void calculateTip(){
        tip.calculateTip();
    }
}
