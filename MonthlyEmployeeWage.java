//Calculate Wages  for a month  Assume 26 days in a month


public class MonthlyEmployeeWage {
    public static void main(String[] args) {
      
        int EMPLOYEE_WAGE_PER_HOUR = 125;
        int FULL_DAY_HOURS = 8;
        int WORKING_DAYS_IN_MONTH = 26;
        int monthlyWage = 0;

        for (int day = 1; day <= WORKING_DAYS_IN_MONTH; day++) {
            monthlyWage += EMPLOYEE_WAGE_PER_HOUR * FULL_DAY_HOURS;
        }

       
        System.out.println("Monthly Wage for a Full-time Employee: Rs " + monthlyWage);
    }
}