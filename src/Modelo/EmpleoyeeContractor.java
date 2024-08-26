package Modelo;

public class EmpleoyeeContractor extends Empleoyee {
    private int hourWorked;
    private double proyectSalary;

    public EmpleoyeeContractor(String name, double proyectSalary, int hourWorked) {
        super(name, proyectSalary * hourWorked);
        this.proyectSalary = proyectSalary;
        this.hourWorked = hourWorked;
    }


    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    public double getProyectSalary() {
        return proyectSalary;
    }

    public void setProyectSalary(double proyectSalary) {
        this.proyectSalary = proyectSalary;
    }


    @Override
    public double CalculatePayment() {
        return monthlySalary;
    }
}
