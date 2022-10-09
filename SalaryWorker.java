//SalaryWorker is an employee that is paid weekly
public class SalaryWorker extends Employee {
    private double weeklySalary;

    public SalaryWorker() {
        super();
        weeklySalary = 0.0;
    }

    public SalaryWorker(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }

    public double earnings() {
        return weeklySalary;
    }
}
