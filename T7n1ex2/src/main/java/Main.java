/**
 * Add to this class a deprecated method using annotation. Call from the class Main this method,
 * deleting with annotation the "warnings" of the deprectated methods.
 */
public class Main {
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        EmployeeOnline employee1 =
                new EmployeeOnline("Jose", "Sanchez", 10);
        EmployeeFacetoFace employee2 =
                new EmployeeFacetoFace("Maria", "Gomez", 10);


        System.out.println(employee1.calculateSalary(160));
        System.out.println(employee2.calculateSalary(80));


        System.out.println(employee1.deprecatedMethod());
        employee2.deprecatedMethod();
    }
}
