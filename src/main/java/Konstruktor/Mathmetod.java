package Konstruktor;

import java.util.Arrays;

public class Mathmetod {
    public static void main(String[] args) {
        /*//intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
        System.out.println(new Rectangle(10,5).canPlaceInto(new Rectangle(1,15)));
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        // Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));

        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        // Quarke level, name is Test, point count is 3
        System.out.println(new Level("Test", points));
        */String test = "Hello world";


    }
}
class CircleIntersector {
    private int x1, y1, r1;
    private int x2, y2, r2;

    // Конструктор
    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        // Обчислення відстані між центрами двох кіл
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // Перевірка на перетин
        if (distance <= r1 + r2 && distance >= Math.abs(r1 - r2)) {
            return "intersects";
        } else {
            return "not intersects";
        }
    }
}
class Rectangle{
    private int a;
    private int b;
    private int S;
    public Rectangle(int a,int b){

        this.a = a;
        this.b = b;
    }
    public boolean canPlaceInto(Rectangle anotherRect){
        if((this.a<= anotherRect.a&&this.b<= anotherRect.b)||(this.b<= anotherRect.a&&this.a<= anotherRect.b)){
            return true;
        }
        else {
            return false;
        }
    }
}
class TargetFinder{
    public int[] findTarget(int[] aiCoords, int[][] targets){
 double minDistance = Double.MAX_VALUE;
 int[] nierTarget = null;
 for (int i =0; i <=targets.length; i++){
     int[]target=targets[i];
     double distance = Math.sqrt(Math.pow(target[0] - aiCoords[0], 2) + Math.pow(target[1] - aiCoords[1], 2));
     if (distance<minDistance){
         minDistance = distance;
         nierTarget=target;
     }
 }
 return nierTarget;
    }
}
class Level {
    private String levelName;
    private Point[] points;
    public static class Point{
        private int x;
        private int y;
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public Level(String levelName, Point[] points){

        this.levelName = levelName;
        this.points=points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is"+ levelName+", point count is "+ points.length;
    }
}
