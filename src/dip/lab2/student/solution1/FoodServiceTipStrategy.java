/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * FoodServiceTipStrategy is a low-level class to calculate the tip for a food
 * service or restaurant. 
 * This class has a constructor that sets the tip percent and the cost of the
 * meal when the class is called. It also has a constructor that just accepts
 * the cost of the meal. 
 * There are two methods in this class. the setPercent method sets the percent 
 * of the tip. The calculateTip method calculates the amount of the tip and 
 * displays that.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class FoodServiceTipStrategy implements TipCalculatorStrategy {
    private double percent;
    private double mealAmount;
    private Scanner keyboard = new Scanner(System.in);
    
    /**
     * Constructor that sets both the meal cost and the percent of tip
     * @param mealAmount
     * @param percent 
     */
    public FoodServiceTipStrategy(final double mealAmount, final double percent){
       //Validates and sets the cost of the meal 
        if(mealAmount < 0 ){
          throw new IllegalArgumentException();
      }else {
          this.mealAmount= mealAmount;
      }
       //Validates and sets percent 
       if(percent < 0 || percent>100){
            throw new IllegalArgumentException();
        }else{
             this.percent = percent/100;
        }   
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
     * Sets the percent of the tip
     * @param percent 
     */
    @Override
    public final void setPercent(final double percent){
        if(percent < 0 || percent>100){
            throw new IllegalArgumentException();
        }else{
             this.percent = percent/100;
        }    
    }
    /**
     * Calculates the Tip Amount
     */
    
    @Override
    public final double calculateTip(){
        DecimalFormat formatTip = new DecimalFormat("$###,###,##0.00");
        double total = mealAmount*percent;
                
        return mealAmount*percent;
    }
}
