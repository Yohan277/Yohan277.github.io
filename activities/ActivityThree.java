import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeComputation {
    //Method 1 Get Average
    public static double getAverage(double gr1, double gr2, double gr3)
    {

        double ave = (gr1 + gr2 + gr3) / 3;
        return ave;
    }
        //Method 2 getRemarks()
        public static String getRemarks(double ave) {

            if(ave >= 60) {
                return "Passed";
            } else {
                return "Failed";
            }
        }
        //Method 3 displayResult()
        public static void displayResult(double tempAve) {
            double a = (tempAve);
            String remarks = getRemarks(a);
            System.out.println("Average is " + a);
            System.out.println("Remarks is " + remarks);
        }

        //NEW VOID METHOD studInfo
        public static void studInfo(String studNumber, String studName, String course, String yearLevel) {
            System.out.println("\n--- Student Information ---");
            System.out.println("Student number: " + studNumber);
            System.out.println("Student Name: " + studName);
            System.out.println("Course: " + course);
            System.out.println("Year Level " + yearLevel);
    }

    public static String getEquiv(double ave) {
        if (ave >= 90 && ave <= 100) {
            return "A";
        } else if (ave >= 83 && ave <= 89) {
            return "B";
        } else if (ave >= 75 && ave <= 82) {
            return "C";
        } else if (ave >= 60 && ave <= 74) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Number: ");
        String studNum = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String studName = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Year Level: ");
        String yearLevel = scanner.nextLine();

        System.out.println("Enter grade 1: ");
        double grade1 = scanner.nextDouble();
        System.out.print("Enter grade 2: ");
        double grade2 = scanner.nextDouble();
        System.out.print("Enter grade 3: ");
        double grade3 = scanner.nextDouble();

        double a = getAverage(grade1, grade2, grade3);
        String equiv = getEquiv(a);

        studInfo(studNum, studName, course, yearLevel);
        displayResult(a);
        System.out.println("Equivalent Grade: " + equiv);

        scanner.close();
    }
}

