/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 * TaxiTipStrategy implements TipCalculatorStrategy and calculates the tip for a
 * Taxi driver.
 * This class has a method to set the percent and a calculateTip method which
 * calculates and returns the amount you should be paying as a tip.
 * The constructor accepts a parameter of a double for the cost of the ride and 
 * automatically sets the percent to 20%. 
 * There also is a constructor that accepts both a double for the cost of the ride
 * and a double for the percent of the tip.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class TaxiTipStrategy implements TipCalculatorStrategy{
    private double cabCost;
    private double percent;
    
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
        
        percent = 0.2;
    }
    
    /**
     * 
     * @param cabCost
     * @param percent 
     */
    public TaxiTipStrategy(double cabCost, double percent){
        //Validates and sets the cost of the cab
        if(cabCost <0){
            throw new IllegalArgumentException();
        }else{
            this.cabCost = cabCost;
        }
        
        
        //Validates and sets the percent
        if(percent < 0 || percent>100){
            throw new IllegalArgumentException();
        }else{
             this.percent = percent/100;
        }   
    }
    /**
     * 
     * @param percent 
     */
    @Override
    public void setPercent(double percent) {
        //Validates and sets the percent
        if(percent < 0 || percent>100){
            throw new IllegalArgumentException();
        }else{
             this.percent = percent/100;
        }       }

    @Override
    public double calculateTip() {
        return cabCost*percent;
    }
    
}
