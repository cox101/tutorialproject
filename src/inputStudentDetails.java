import java.util.Scanner;
public class inputStudentDetails {
     public static String studentName;
     public static int studentNumber;
    void inputStudentDetails(){
        Scanner inputStudentDetails = new Scanner(System.in);
        System.out.println("Student Name :");
        studentName = inputStudentDetails.next();
        System.out.println("Student Number :");
        studentNumber = inputStudentDetails.nextInt();

    }
}
