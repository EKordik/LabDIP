/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.util.Scanner;

/**
 * This start up class is to demonstrate the TipCalculatorService. 
 * @author Emma Kordik
 * @version 1.00
 */
public class StartUp {
    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);
        int serviceQuality;
        
        TipCalculatorService service = new TipCalculatorService(
             new BaggageHandlerTipStrategy(3, ServiceQuality.GOOD));

        System.out.print("How was the service? Great(1), Good(2), Fair(3), Terrible(4): ");
        serviceQuality = Integer.parseInt(keyboard.nextLine());
        while(serviceQuality < 0 || serviceQuality >5){
            System.out.println("Invalid Entry.");
            System.out.print("How was the service? Great(1), Good(2), Fair(3), Terrible(4): ");
            serviceQuality = Integer.parseInt(keyboard.nextLine());
        }
        
        switch(serviceQuality){
            case 1:service.setTipPercent(ServiceQuality.GREAT);break;
            case 2: service.setTipPercent(ServiceQuality.GOOD);break;
            case 3:service.setTipPercent(ServiceQuality.FAIR);break;
            case 4:service.setTipPercent(ServiceQuality.TERRIBLE);break;
        }
        
        System.out.println(service.calculateTip());
     
     
    }
         
}
