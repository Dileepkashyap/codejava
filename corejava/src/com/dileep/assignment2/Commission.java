package com.dileep.assignment2;
import java.util.Scanner;
public class Commission {
	private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void Details() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        this.phone = scanner.nextLine();
        System.out.print("Enter Sales Amount: ");
        this.salesAmount = scanner.nextDouble();
    }

    // Method to calculate commission based on sales amount
    public void calculateCommission() {
        double commission = 0.0;
        if (salesAmount >= 100000)
            commission = salesAmount * 0.10;
        else if (salesAmount >= 50000)
            commission = salesAmount * 0.05;
        else if (salesAmount >= 30000)
            commission = salesAmount * 0.03;

        // Display commission if calculated
        if (commission > 0)
            System.out.println("Commission: ₹" + commission);
        else
            System.out.println("No commission earned.");
    }

    public static void main(String[] args) {
        Student student = new Student(); // Creating a Student object 

        Commission employee = new Commission(); // Creating a Commission object

        // Accept details of the sales employee
        employee.Details();

        // Calculate and display commission
        employee.calculateCommission();
    }
}
