public class ShapeCalculator {

    private double[] result = new double[2];

   public double[] calc(Circle arg){

       arg.calcCircumference();
       arg.calcSurfaceArea();
       result[0] = arg.getCircumference();
       result[1] = arg.getSurfaceArea();
       return result;

   }

    public double[] calc(Rectangle arg){

        arg.calcCircumference();
        arg.calcSurfaceArea();
        result[0] = arg.getCircumference();
        result[1] = arg.getSurfaceArea();
        return result;

    }

    public double[] calc(Square arg){

        arg.calcCircumference();
        arg.calcSurfaceArea();
        result[0] = arg.getCircumference();
        result[1] = arg.getSurfaceArea();
        return result;

    }

    public double[] calc(Triangle arg){

        arg.calcCircumference();
        arg.calcSurfaceArea();
        result[0] = arg.getCircumference();
        result[1] = arg.getSurfaceArea();
        return result;

    }
}
