package java_hands_on;

import java.util.Scanner;

class Point {
    private int x;
    private int y;

    // Constructors with parameters
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX(){ return x; }
    public int getY(){ return y; }

    // Setters
    public void setX(int x){ this.x = x; }
    public void setY(int y){this.y = y; }
}

public class java_2_classes_and_objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);

        double distance = findDistance(p1, p2);

        System.out.printf("%.3f", distance);

        sc.close();
    }

    private static double findDistance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}
