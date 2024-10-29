/*
Problem : Compare 2D Points For Distance From Origin
*/

package java_hands_on;
import java.util.Scanner;

class Points {
    private double x;
    private double y;

    // Constructors with parameters
    public Points(double x, double y){
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX(){ return x; }
    public double getY(){ return y; }

    // Setters
    public void setX(double x){ this.x = x; }
    public void setY(double y){this.y = y; }

    public double distanceFromOrigin(){ return Math.sqrt(x*x + y*y); }
}

public class java_3_conditional_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        Points p1 = new Points(x1,y1);
        Points p2 = new Points(x2, y2);
        Points p3 = new Points(x3, y3);

        Points farthestPoint = pointWithHighestOriginDistance(p1, p2, p3);
        System.out.printf("%.1f\n", farthestPoint.getX());
        System.out.printf("%.1f\n", farthestPoint.getY());

        sc.close();
    }

    private static Points pointWithHighestOriginDistance(Points p1, Points p2, Points p3){
        double distance1 = p1.distanceFromOrigin();
        double distance2 = p2.distanceFromOrigin();
        double distance3 = p3.distanceFromOrigin();
        if(distance1 >= distance2 && distance1 >= distance3){
            return p1;
        }else if(distance2 >= distance1 && distance2 >= distance3){
            return p2;
        }else{
            return p3;
        }
    }
}
