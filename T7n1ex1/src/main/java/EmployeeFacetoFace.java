public class EmployeeFacetoFace extends Empoloyee{
    private static int plusGasoline = 100;

    public EmployeeFacetoFace(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
    }

    public int getPlusGasoline() {
        return plusGasoline;
    }

    public void setPlusGasoline(int plusGasoline) {
        this.plusGasoline = plusGasoline;
    }
    @Override
    public int calculateSalary(int workingHours){
        int salary = 0;
        salary = (workingHours * getPriceHour()) + plusGasoline;
        return salary;
    }


}
