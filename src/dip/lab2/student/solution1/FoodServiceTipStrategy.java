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
 * calculates the amount of the tip.The setQualityPercent method sets the percent 
 * value for each enum allowing for an override of the default values. 
 * 
 * Enums initial values: Good = 20%, Fair = 15%, Great = 25%, Terrible =0%
 * @author Emma Kordik
 * @version 1.00
 */
public class FoodServiceTipStrategy implements TipCalculatorStrategy {
    private double percent;
    private double mealAmount;
    private ServiceQuality quality;
    
    /**
     * Constructor that sets both the meal cost and the percent of tip
     * @param mealAmount
     * @param quality
     */
    public FoodServiceTipStrategy(final double mealAmount, ServiceQuality quality, 
            double percent){
       //Validates and sets the cost of the meal 
        if(mealAmount < 0 ){
          throw new IllegalArgumentException();
      }else {
          this.mealAmount= mealAmount;
      }
      
        this.setQualityPercent(quality, percent);
        this.setTipQualityPercent(quality);
        
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

         //Intiailizes Enums
        quality.GOOD.setPercent(.2);
        quality.FAIR.setPercent(.15);
        quality.GREAT.setPercent(.25);
        quality.TERRIBLE.setPercent(.00);
        
        this.setTipQualityPercent(quality);
    }
    
    /**
     * Sets the percent based on the quality of the service received
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
    
    /**
     * Calculates the Tip Amount
     */
    
    @Override
    public final double calculateTip(){
        return mealAmount*percent;
    }
}
