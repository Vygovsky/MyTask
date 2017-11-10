package examples.page8;


import java.util.ArrayList;

public class Robot {
    private double x = 0;
    private double y = 0;
    protected double course = 0;
    ArrayList<RobotLine> line = new ArrayList<>();
    //  private Operator operator;
    private RobotListener listener;

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }*/

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

    public void setListener(RobotListener listener) {
        this.listener = listener;
    }

    public ArrayList<RobotLine> getLine() {
        return line;
    }

    public void forward(int distance) {
        if (listener != null) {
            listener.moveStart(x, y);
        }
        final double xOld = x;
        final double yOld = y;

        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);
        if (listener != null) {
            listener.moveEnd(x, y);
        }
        line.add(new RobotLine(xOld, yOld, x, y));
    }

    public void getCoordinate() {
        System.out.println("Coordinate X= " + x + "\n" + "Coordinate Y= " + y + "\n");
    }
}
