public class Main {
    // class can be a template,number of objects ,blueprint

    public static void main(String[] args) {

        // calling inputStudentDetails
        inputStudentDetails diplomaStudentDetailsInput=new inputStudentDetails();
        diplomaStudentDetailsInput.inputStudentDetails();
        inputStudentMarks diplomaStudentMarkInput=new inputStudentMarks();
        diplomaStudentMarkInput.inputStudentMarks();
        //call  printStudentName
        printStudentName diplomaStudentNamePrint=new printStudentName();
        diplomaStudentNamePrint.printStudentName();
        //call printStudentNumber
        printStudentNumber diplomaStudentNumberPrint=new printStudentNumber();
        diplomaStudentNumberPrint.printStudentNumber();
        printStudentMarks diplomaStudentMarks=new printStudentMarks();
        diplomaStudentMarks.printStudentMarks();




    }
}