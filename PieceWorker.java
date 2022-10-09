//PieceWorker is an employee that has the wage based on the quantity they produce
public class PieceWorker extends Employee {
    private double wagePerPiece;
    private int quantity;

    public PieceWorker() {
        super();
        wagePerPiece = 0.0;
        quantity = 0;
    }

    public PieceWorker(String firstName, String lastName, double wagePerPiece, int quantity) {
        super(firstName, lastName);
        this.wagePerPiece = wagePerPiece;
        this.quantity = quantity;
    }

    public double earnings() {
        return wagePerPiece * quantity;
    }
}
