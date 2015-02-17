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
public class FoodServiceTipStrategy implements TipCalculatorStrategy {
    private double percent;
    private double mealAmount;
    private Scanner keyboard = new Scanner(System.in);
    
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
    
    @Override
    public final void setPercent(final double percent){
        if(percent < 0 || percent>100){
            throw new IllegalArgumentException();
        }else{
             this.percent = percent/100;
        }    
    }
    
    @Override
    public final void calculateTip(){
        System.out.println("Tip Amount: $" + (mealAmount * percent));
    }
}
