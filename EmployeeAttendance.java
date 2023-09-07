/* Check Employee is Present or Absent
Use (RANDOM) for Attendance Check */

import java.util.Random;

public class EmployeeAttendance {
    public static void main(String[] args) {
        
        Random r = new Random();

      
        int attendance = r.nextInt(2);

        
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}