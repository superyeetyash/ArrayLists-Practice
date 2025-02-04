package SchoolAssignments;

public class Peasant extends Subject
{
    public Peasant(String name, int age, double wealth) {
        super(name, age, wealth);
    }

    @Override
    public void work() {
        System.out.println(getName() + " farms the land and ears 10 wealth.");
        setWealth(getWealth() + 10);
    }

    @Override
    public void tax() {
        double taxAmount = getWealth() * 0.05;
        setWealth(getWealth() - taxAmount);
        System.out.println(getName() + " pays 5% of their wealth in taxes: " + taxAmount);
    }
}

