/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 * The BaggageHandlerTipStrategy class is a low-level class based off the TipCalculatorStrategy
 * interface. 
 * This class has a constructor that accepts the number of bags carried and the 
 * percent of the tip (based off of quality of service). It also has a constructor
 * that just accepts the number of bags carried.
 * There are two methods in this class. One that sets the percent of the tip (the 
 * setPercent method) based off of the quality of service received. and the other, 
 * calculateTip that calculates the amount of the tip.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class BaggageHandlerTipStrategy implements TipCalculatorStrategy {
    private double percent;
    private double billAmount;
    private final double RATE_PER_BAG = 1.00;
    
    /**
     * Constructor that accepts number of bags and Quality of service
     * @param numBags
     * @param quality 
     */
    public BaggageHandlerTipStrategy(final double numBags, ServiceQuality quality){
        //Validates the number of bags entered and calculates the total bill
        if(numBags<0 || numBags > 20){
           throw new IllegalArgumentException();
       }else{
           this.billAmount = numBags * RATE_PER_BAG;
       }
        
        this.setTipPercent(quality);
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
     * @param quality 
     */
    @Override
    public final void setTipPercent(ServiceQuality quality){
        switch(quality){
            case GOOD: percent = .2;break;
            case FAIR: percent = .15; break;
            case TERRIBLE: percent = .0;break;
            case GREAT: percent = .2;break;
        }
    }

    @Override
    public final double calculateTip() {        
        return billAmount * percent;
    }
    
}
