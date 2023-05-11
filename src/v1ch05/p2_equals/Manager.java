package v1ch05.p2_equals;

public class Manager extends Employee
{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject)) return false;
        var other = (Manager) otherObject;
        // super.equals checked that this and other belong to the same class
        return bonus == other.bonus;
    }

    public int hashCode()
    {
        return java.util.Objects.hash(super.hashCode(), bonus);
    }

    public String toString()
    {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
