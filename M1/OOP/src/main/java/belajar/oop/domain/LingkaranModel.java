package belajar.oop.domain;

/**
 *
 * @author Irman Juliansyah
 */
public class LingkaranModel {

    private double phi;
    private double r;

    public LingkaranModel() {

    }

    public LingkaranModel(double phi, double r) {
        this.phi = phi;
        this.r = r;
    }

    //getter setter phi
    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getPhi() {
        return phi;
    }

    //getter setter r
    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

}
