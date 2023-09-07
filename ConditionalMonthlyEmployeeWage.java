 /* Calculate Wages till a condition of total working hours or num of days is reached for a month 
Assume 200 hours and 25 days */

public class ConditionalMonthlyEmployeeWage {
    public static void main(String[] args) {
       
        int EMPLOYEE_WAGE_PER_HOUR = 125;

        int FULL_DAY_HOURS = 8;

        int MAX_WORKING_HOURS = 200;

        int MAX_WORKING_DAYS = 25;

        int monthlyWage = 0;

        int totalHoursWorked = 0;

        int totalDaysWorked = 0;


        while (totalHoursWorked < MAX_WORKING_HOURS && totalDaysWorked < MAX_WORKING_DAYS) {
            monthlyWage += EMPLOYEE_WAGE_PER_HOUR * FULL_DAY_HOURS;
            totalHoursWorked += FULL_DAY_HOURS;
            totalDaysWorked++;
        }
        System.out.println("Monthly Wage for a Full-time Employee: Rs " + monthlyWage);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Total Days Worked: " + totalDaysWorked);
    }
}