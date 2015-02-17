/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author ekordik
 */
public class StartUp {
    public static void main(String[] args){
     TipCalculatorService service = new TipCalculatorService(
             new FoodServiceTipStrategy(10.00, 20));
     
     service.calculateTip();
     
    }
         
}
