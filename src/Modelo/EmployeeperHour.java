package Modelo;

public class EmployeeperHour extends Empleoyee{

    private int hourWorked;
    private double priceHour;

    public EmployeeperHour(String name, int hourWorked, double priceHour) {
        super(name, hourWorked * priceHour);
        this.hourWorked = hourWorked;
        this.priceHour = priceHour;
    }


    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }


    @Override
    public double CalculatePayment() {
        return monthlySalary;
    }
}
