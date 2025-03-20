package pole;

import java.util.Objects;

class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p2.setX(2);
        p2.setY(2);
        p2.setZ(3);

        StarTrack track1 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p2);

        StarTrack track2 = new StarTrack();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack track3 = new StarTrack();
        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println(track1.equals(track2)); //Should be true
        System.out.println(track1.equals(track3));
        System.out.println(track1.hashCode() == track2.hashCode());
    }
}

class Point {
    private int x;
    private int y;
    private int z;

    // Геттер для x
    public int getX() {
        return x;
    }

    // Сеттер для x
    public void setX(int x) {
        this.x = x;
    }

    // Геттер для y
    public int getY() {
        return y;
    }

    // Сеттер для y
    public void setY(int y) {
        this.y = y;
    }

    // Геттер для z
    public int getZ() {
        return z;
    }

    // Сеттер для z
    public void setZ(int z) {
        this.z = z;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return x == point.x && y == point.y && z == point.z;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
class StarTrack {
    private Point start;
    private Point finish;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StarTrack point = (StarTrack) o;
        return start.equals(point.start) && finish.equals(point.finish);
    }
    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }
}
