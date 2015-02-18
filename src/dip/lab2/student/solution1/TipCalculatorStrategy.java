/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 * The TipCalculatorStrategy interface has a setPercent method that accepts a 
 * double as a parameter and a calculateTip method to calculate the actual tip
 * amount.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public interface TipCalculatorStrategy {

    public abstract void setTipPercent(final ServiceQuality quality);
    public abstract double calculateTip();
    
}
