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
public interface TipCalculatorStrategy {

    public void setPercent(final double percent);
    public abstract void calculateTip();
    
}
