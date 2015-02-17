/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.util.Scanner;

/**
 *
 * @author ekordik
 */
public class BaggageHandlerTipStrategy implements TipCalculatorStrategy {
    private double percent;
    private double billAmount;
    private final double RATE_PER_BAG = 1.00;
    private Scanner keyboard = new Scanner(System.in);
    
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
    
    
    @Override
    public void setPercent(double percent) {
        if(percent<0 || percent >100){
            throw new IllegalArgumentException();
        }else{
            this.percent = percent/100;
        }
    }

    @Override
    public void calculateTip() {
        System.out.println("Tip Amount: $" + (billAmount *percent));
    }
    
}
