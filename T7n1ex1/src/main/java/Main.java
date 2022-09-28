public class Main {
    public static void main(String[] args) {
        EmployeeOnline employee1 =
                new EmployeeOnline("Jose", "Sanchez", 10);
        EmployeeFacetoFace employee2 =
                new EmployeeFacetoFace("Maria", "Gomez", 10);


        System.out.println(employee1.calculateSalary(160));
        System.out.println(employee2.calculateSalary(80));
    }
}
