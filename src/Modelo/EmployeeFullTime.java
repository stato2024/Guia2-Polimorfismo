package Modelo;

public class EmployeeFullTime extends Empleoyee {


    public EmployeeFullTime(String name, double monthlySalary) {
        super(name,monthlySalary);
    }

    @Override
    public double CalculatePayment() {
        return monthlySalary;
    }


}
