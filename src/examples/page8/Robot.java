package examples.page8;

public class Robot {
    private double x = 0;
    private double y = 0;
    protected double course = 0;

   /* public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }
*/
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public void forward(int distance) {
        x = x + distance * Math.cos(course / 180 * Math.PI);
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }

    public void getCoordinate() {
        System.out.println("Coordinate X= " + x + "\n" + "Coordinate Y= " + y);
    }
}
