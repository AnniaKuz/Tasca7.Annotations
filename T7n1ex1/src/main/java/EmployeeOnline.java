public class EmployeeOnline extends Empoloyee{
    private static final int INTERNET = 50;
    public EmployeeOnline(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public int calculateSalary(int workingHours){
        int salary = 0;
        salary = (workingHours * getPriceHour()) + INTERNET;
        return salary;
    }

}
