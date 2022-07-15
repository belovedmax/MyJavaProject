public class Complex {
    public static void main(String[] args) {

    }
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(){
        this(5,7);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public String addComplexNumbers(Complex obj){
        double addReal = this.getReal() + obj.getReal();
        double addImaginary = this.getImaginary() + obj.getImaginary();
        return String.format("%.2f, %.2f%s", addReal,addImaginary,"i");
    }
    public String subtractComplexNumbers(Complex obj){
        double subReal = this.getReal() - obj.getReal();
        double subImaginary = this.getImaginary();

        return String.format("%.2f,%.2f%s",subReal,subImaginary,"i");

    }
}

