//HourlyWorker is an employee that has the wage based on their working hours
public class HourlyWorker extends Employee {
    private double wage;
    private int hours;

    public HourlyWorker() {
        super();
        wage = 0.0;
        hours = 0;
    }

    public HourlyWorker(String firstName, String lastName, double wage, int hours) {
        super(firstName, lastName);
        this.wage = wage;
        this.hours = hours;
    }

    public double earnings() {
        return wage * hours;
    }
}
