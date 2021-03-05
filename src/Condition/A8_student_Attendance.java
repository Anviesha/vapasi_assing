package Condition;

import java.util.Scanner;

public class A8_student_Attendance {

    public static void main(String[] args) {
        System.out.println("Total Number of Classes held:");

        Scanner scanner = new Scanner(System.in);
        double noOfClassHeld = scanner.nextDouble();

        System.out.println("Number of Classes Attended:");
        double noOfClassAttended = scanner.nextDouble();

        int classAttendance =  (int)((noOfClassAttended / noOfClassHeld) *100);

        if(classAttendance>=75)
            System.out.println("Student is allowed for Exam.");
        else
            System.out.println("Student is not allowed for Exam.");

        System.out.println("Class Attendance percentage:"+ classAttendance);
    }
}
