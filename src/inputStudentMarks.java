import java.util.Scanner;
public class inputStudentMarks {
    public static int courseworkMarks;
    public static int examMarks;
    public static int totalMarks;

    public void inputStudentMarks(){
        Scanner inputStudentMarks=new Scanner(System.in);

        System.out.println("Coursework is :");
        courseworkMarks =inputStudentMarks.nextInt();
        System.out.println("Exam Marks :");
        examMarks =inputStudentMarks.nextInt();
        totalMarks=courseworkMarks+examMarks;


        

    }


}
