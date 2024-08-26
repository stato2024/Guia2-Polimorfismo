package Modelo;

public abstract class Empleoyee {
    protected String name;
    protected double monthlySalary;

    public Empleoyee( String name, double monthlySalary) {
        this.monthlySalary = monthlySalary;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public abstract double CalculatePayment();
}
