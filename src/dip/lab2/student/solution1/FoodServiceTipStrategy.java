/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;


/**
 * FoodServiceTipStrategy is a low-level class to calculate the tip for a food
 * service or restaurant. 
 * This class has a constructor that sets the tip percent and the cost of the
 * meal when the class is called. It also has a constructor that just accepts
 * the cost of the meal. 
 * There are two methods in this class. the setQuality method sets the percent 
 * of the tip based on the quality of the service. The calculateTip method 
 * calculates the amount of the tip.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class FoodServiceTipStrategy implements TipCalculatorStrategy {
    private double percent;
    private double mealAmount;
    
    /**
     * Constructor that sets both the meal cost and the percent of tip
     * @param mealAmount
     * @param quality
     */
    public FoodServiceTipStrategy(final double mealAmount, ServiceQuality quality){
       //Validates and sets the cost of the meal 
        if(mealAmount < 0 ){
          throw new IllegalArgumentException();
      }else {
          this.mealAmount= mealAmount;
      }
      
        this.setTipPercent(quality);
    }
    /**
     * Constructor that accepts and parameter for the meal Amount and automatically
     * sets the tip percent to 20%.
     * 
     * @param mealAmount 
     */
    public FoodServiceTipStrategy(final double mealAmount){
         if(mealAmount < 0 ){
          throw new IllegalArgumentException();
      }else {
          this.mealAmount= mealAmount;
      }
         this.percent = .2;
    }
    
    /**
     * Sets the percent based on the quality of the service received
     * @param quality 
     */
   @Override
    public final void setTipPercent(ServiceQuality quality){
        switch(quality){
            case GOOD: percent = .2;break;
            case FAIR: percent = .15; break;
            case TERRIBLE: percent = .0;break;
            case GREAT: percent = .25;break;
        }
    }
    /**
     * Calculates the Tip Amount
     */
    
    @Override
    public final double calculateTip(){
        return mealAmount*percent;
    }
}
