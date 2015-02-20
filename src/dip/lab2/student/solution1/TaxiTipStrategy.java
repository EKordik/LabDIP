/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 * TaxiTipStrategy implements TipCalculatorStrategy and calculates the tip for a
 * Taxi driver.
 * This class has a method to set the percent based off of the quality of service 
 * and a calculateTip method which calculates and returns the amount you should 
 * be paying as a tip. The setQualityPercent method sets the percent value for
 * each enum allowing for an override of the default values. 
 * The constructor accepts a parameter of a double for the cost of the ride and 
 * automatically sets enums to good=20%, fair =%15, great =20%, terrible = 0%.
 * There also is a constructor that accepts both an ENUM for quality of service 
 * and a double for the percent of the tip.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class TaxiTipStrategy implements TipCalculatorStrategy{
    private double cabCost;
    private double percent;
    private ServiceQuality quality;
    /**
     * 
     * @param cabCost 
     */
    public TaxiTipStrategy(double cabCost){
              //Validates and sets the cost of the cab
        if(cabCost <0){
            throw new IllegalArgumentException();
        }else{
            this.cabCost = cabCost;
        }
        
        
         //Intiailizes Enums
        quality.GOOD.setPercent(.2);
        quality.FAIR.setPercent(.15);
        quality.GREAT.setPercent(.2);
        quality.TERRIBLE.setPercent(.00);
        
        this.setTipQualityPercent(quality);
    }
    
    /**
     * 
     * @param cabCost
     * @param percent 
     */
    public TaxiTipStrategy(double cabCost, ServiceQuality quality, double percent){
        //Validates and sets the cost of the cab
        if(cabCost <0){
            throw new IllegalArgumentException();
        }else{
            this.cabCost = cabCost;
        }
        this.setQualityPercent(quality,percent);
        this.setTipQualityPercent(quality);
    }
    /**
     * 
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
    public double calculateTip() {
        return cabCost*percent;
    }
    
}
