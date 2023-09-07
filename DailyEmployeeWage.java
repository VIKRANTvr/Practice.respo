/* Calculate Daily Wage Employee Wage
	Assume employee wage to be Rs 125/= per hour  &
           Number of hours for Full Day  = 8 hours */

public class DailyEmployeeWage {
    public static void main(String[] args) {
        
        int EMPLOYEE_WAGE_PER_HOUR = 125;
        int FULL_DAY_HOURS = 8;

       
        int DailyWage = EMPLOYEE_WAGE_PER_HOUR * FULL_DAY_HOURS;


        System.out.println("Daily Wage for an Employee: Rs " + DailyWage);
    }
}