package org.example;

public class TriangleArea {

        private double base;
        private double height;


    public TriangleArea() {

    }
    public TriangleArea(double base, double height) {
        this.base = base;
        this.height = height;
    }




    public double getBase() {
            return base;
        }

        public double getHeight() {
            return height;
        }


        public void setBase(double base) {
            this.base = base;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double calculate()
        {
            double calculate;
            double cons = 0.5;
            calculate = cons * base * height;
            return calculate;

  /*  private double base;
    private double height;
    private double area;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateArea() {
        area = 0.5 * base * height;
    }

    public double getArea() {
        return area; */
        }

/*    public static void main(String[] args)
    {
        TriangleArea cp = new TriangleArea();
        cp.setBase(3.0);
        cp.setHeight(5.0);
        //cp.calculate();

        System.out.println(cp.calculate());
    }

*/
}
