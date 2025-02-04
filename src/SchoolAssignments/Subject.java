package SchoolAssignments;

public class Subject
{
    private final String name;
    private final int age;
    private double wealth;

    public Subject(String name, int age, double wealth) {
        this.name = name;
        this.age = age;
        this.wealth = wealth;
    }

    public void work() {
        System.out.println(name + " works in the kingdom");
    }

    public void tax() {
        double taxAmount = 0.1 * wealth;
        wealth -= taxAmount;
        System.out.println(name + " pays 10% of their wealth in taxes: " + taxAmount);
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public double getWealth() {
        return wealth;
    }

    public void setWealth(double wealth) {
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return "SchoolAssignments.Subject{name='" + name + "', age=" + age + ", wealth=" + wealth + "}";
    }
}
