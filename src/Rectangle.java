public class Rectangle {
    private double a;
    private double b;
    private double surfaceArea;
    private double circumference;

    public void   setA(double a){
        this.a = a;
    }
    public double getA(){return a; }

    public void   setB(double b){
        this.b = b;
    }
    public double getB(){ return b; }

    public double getSurfaceArea(){
        return surfaceArea;
    }

    public double getCircumference(){
        return circumference;
    }


    public void calcSurfaceArea(){
        surfaceArea = a * b;
    }

    public void calcCircumference(){
        circumference = 2 * a + 2 * b;
    }

    public Rectangle(double a, double b){
        setB(b);
        setA(a);
    }
}
