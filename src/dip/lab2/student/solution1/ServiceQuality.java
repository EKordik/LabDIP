/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author emmakordik
 */
public enum ServiceQuality {
    TERRIBLE(0.0), GOOD(0.2), FAIR(0.15), GREAT(0.25);
    private double percent;
    
    ServiceQuality(double percent) {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
    
    
}
