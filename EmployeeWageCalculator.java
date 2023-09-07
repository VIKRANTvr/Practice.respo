/* UC3 :Add Part time employee and Wage
	Assume part time hours be 4

   UC4: Solving using Case statement
*/

public class EmployeeWageCalculator {
    public static void main(String[] args) {
       
        int EMPLOYEE_WAGE_PER_HOUR = 125;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        String employeeType = "full-time";

        int dailyWage = 0;

        switch (employeeType) {
            case "full-time":
                dailyWage = EMPLOYEE_WAGE_PER_HOUR * FULL_DAY_HOURS;
                break;
            case "part-time":
                dailyWage = EMPLOYEE_WAGE_PER_HOUR * PART_TIME_HOURS;
                break;
            default:
                System.out.println("Invalid employee type.");
                break;
        }

        
        System.out.println("Daily Wage for " + employeeType + " Employee: Rs " + dailyWage);
    }
}
