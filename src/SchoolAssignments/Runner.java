package SchoolAssignments;

public class Runner {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Rectangle r1 = new Rectangle(7.0, 5.0);

        System.out.println(c1.getArea());
        System.out.println(r1.getArea());
    }
}