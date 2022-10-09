//CommissionWorker is an employee that has the wage of 
//the normal salary plus the product of commission and quantity they produce
public class CommissionWorker extends Employee {
    private double salary;
    private double commission;
    private double quantity;

    public CommissionWorker() {
        super();
        salary = 0.0;
        commission = 0.0;
        quantity = 0.0;
    }

    public CommissionWorker(String firstName, String lastName, double salary, double commission, double quantity) {
        super(firstName, lastName);
        this.salary = salary;
        this.commission = commission;
        this.quantity = quantity;
    }

    public double earnings() {
        return salary + (commission * quantity);
    }
}
