/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 * This start up class is to demonstrate the TipCalculatorService. 
 * @author Emma Kordik
 * @version 1.00
 */
public class StartUp {
    public static void main(String[] args){
        
     TipCalculatorService service = new TipCalculatorService(
             new TaxiTipStrategy(30,20));
     
        System.out.println(service.calculateTip());
     
     
    }
         
}
