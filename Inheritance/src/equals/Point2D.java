package equals;

/**
 * Created by deepakkumar on 2017-08-22.
 */
public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}
