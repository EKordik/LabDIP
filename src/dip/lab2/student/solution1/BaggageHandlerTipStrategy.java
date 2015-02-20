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
 * that just accepts the number of bags carried. The setQualityPercent method 
 * sets the percent value for each enum allowing for an override of the default values. 
 * There are other methods in this class. One that sets the percent of the tip (the 
 * setPercent method) based off of the quality of service received. and the other, 
 * calculateTip that calculates the amount of the tip. The setRatePerBag method
 * accepts a double and sets the rate of pay per bag. It is initialized with a 
 * value of $1 per bag for two more more bags and $2 for one bag.
 * 
 * Default Enum values: good=20%, Great=20%, fair=15%, terrible=0%.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class BaggageHandlerTipStrategy implements TipCalculatorStrategy {
    private double percent;
    private double billAmount;
    private double ratePerBag = 1.00;
    private ServiceQuality quality;
    /**
     * Constructor that accepts number of bags and Quality of service
     * @param numBags
     * @param quality 
     */
    public BaggageHandlerTipStrategy(final double numBags, ServiceQuality quality,
            double percent){
        //Validates the number of bags entered and calculates the total bill
        if(numBags<0 || numBags > 20){
           throw new IllegalArgumentException();
       }else{
           if(numBags<2){
                this.billAmount = 2;
            }else{
                this.billAmount = numBags * ratePerBag;
            }
       }
        
        this.setQualityPercent(quality,percent);
        this.setTipQualityPercent(quality);
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
            if(numBags<2){
                this.billAmount = 2;
            }else{
                this.billAmount = numBags * ratePerBag;
            }
       }
        
         //Intiailizes Enums
        quality.GOOD.setPercent(.2);
        quality.FAIR.setPercent(.15);
        quality.GREAT.setPercent(.2);
        quality.TERRIBLE.setPercent(.00);
        
        this.setTipQualityPercent(quality);
    }
    
    public final void setRatePerBag(double rate){
        ratePerBag=rate;
    }
    
    /**
     * @param quality 
     */
    @Override
    public final void setTipQualityPercent(ServiceQuality quality){
        switch(quality){
            case GOOD: percent = quality.getPercent();
            case FAIR: percent = quality.getPercent(); break;
            case TERRIBLE: percent = quality.getPercent();break;
            case GREAT: percent = quality.getPercent();break;
        }
    }
    
    /**
     * 
     * @param quality
     * @param percent 
     */
    @Override
    public final void setQualityPercent(ServiceQuality quality, double percent){
        if(percent<0 || percent > 100){
            throw new IllegalArgumentException();
        }else{
            quality.setPercent(percent/100);
        }
    }

    @Override
    public final double calculateTip() {        
        return billAmount * percent;
    }
    
}
