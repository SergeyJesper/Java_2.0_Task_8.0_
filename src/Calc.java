public class Calc {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public String getAdd(){
        String a = String.format("%.4f", x+y);
        return a;
    }
    public String getSub(){
        String s = String.format("%.4f", x-y);
        return s;
    }
    public String getMul(){
        String m = String.format("%.4f", x*y);
        return m;
    }

    public String getDiv ()throws ArithmeticException{
        if (y==0){
            throw new ArithmeticException();
        }
        double a = x / y;
        String fd = String.format("%.4f", a);
        return fd;
    }
}

