
//This is the client of employee project
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class EmployeeClient {
        public static void main(String[] args) {
                Employee employee;
                String output = "";

                SalaryWorker boss = new SalaryWorker("John", "Smith", 800.0);
                CommissionWorker commissionWorker = new CommissionWorker("Sue", "Jones", 400.0, 3.0, 150);
                PieceWorker pieceWorker = new PieceWorker("Bob", "Lewis", 2.5, 200);
                HourlyWorker hourlyWorker = new HourlyWorker("Karen", "Price", 13.75, 40);

                DecimalFormat precision2 = new DecimalFormat("0.00");

                // Employee reference to a Boss
                employee = boss;

                output += employee.toString() + " earned $" +
                                precision2.format(employee.earnings()) + "\n" +
                                boss.toString() + " earned $" +
                                precision2.format(boss.earnings()) + "\n";

                // Employee reference to a CommissionWorker
                employee = commissionWorker;

                output += employee.toString() + " earned $" +
                                precision2.format(employee.earnings()) + "\n" +
                                commissionWorker.toString() + " earned $" +
                                precision2.format(commissionWorker.earnings()) + "\n";

                // Employee reference to a PieceWorker
                employee = pieceWorker;

                output += employee.toString() + " earned $" +
                                precision2.format(employee.earnings()) + "\n" +
                                pieceWorker.toString() + " earned $" +
                                precision2.format(pieceWorker.earnings()) + "\n";

                // Employee reference to an HourlyWorker
                employee = hourlyWorker;

                output += employee.toString() + " earned $" +
                                precision2.format(employee.earnings()) + "\n" +
                                hourlyWorker.toString() + " earned $" +
                                precision2.format(hourlyWorker.earnings()) + "\n";

                JOptionPane.showMessageDialog(null, output,
                                "Demonstrating Polymorphism",
                                JOptionPane.INFORMATION_MESSAGE);

                System.out.println("\t Demonstrating Polymorphism: \n\n" + output);

                System.exit(0);
        }
}
