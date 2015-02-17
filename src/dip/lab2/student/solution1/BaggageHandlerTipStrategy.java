/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.util.Scanner;

/**
 * The BaggageHandlerTipStrategy class is a low-level class based off the TipCalculatorStrategy
 * interface. 
 * This class has a constructor that accepts the number of bags carried and the 
 * percent of the tip (based off of quality of service). It also has a constructor
 * that just accepts the number of bags carried.
 * There are two methods in this class. One that sets the percent of the tip (the 
 * setPercent method) and the other, calculateTip that calculates the amount of
 * the tip.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class BaggageHandlerTipStrategy implements TipCalculatorStrategy {
    private double percent;
    private double billAmount;
    private final double RATE_PER_BAG = 1.00;
    private Scanner keyboard = new Scanner(System.in);
    
    /**
     * Constructor that accepts number of bags and percent
     * @param numBags
     * @param percent 
     */
    public BaggageHandlerTipStrategy(final double numBags, final double percent){
        //Validates the number of bags entered and calculates the total bill
        if(numBags<0 || numBags > 20){
           throw new IllegalArgumentException();
       }else{
           this.billAmount = numBags * RATE_PER_BAG;
       }
        
        
        //Validates the percent entered and sets the percent variable
        if(percent<0 || percent >100){
            throw new IllegalArgumentException();
        }else{
            this.percent = percent/100;
        }
    }
    /**
     * Constructor that accepts the number of bags
     * @param numBags 
     */
    public BaggageHandlerTipStrategy(final double numBags){
        //Validates the number of bags entered and calculates the total bill
        if(numBags<0 || numBags > 20){
           throw new IllegalArgumentException();
       }else{
           this.billAmount = numBags * RATE_PER_BAG;
       }
        
    }
    /**
     * 
     * @param percent 
     */
    @Override
    public final void setPercent(double percent) {
        if(percent<0 || percent >100){
            throw new IllegalArgumentException();
        }else{
            this.percent = percent/100;
        }
    }

    @Override
    public final double calculateTip() {        
        return billAmount * percent;
    }
    
}
