package Array;

import java.util.Scanner;

public class StudentSystem {
    String[] students = {
            "Aysel",
            "Murad",
            "Nigar",
            "Elvin",
            "Leyla",
            "Tural"
    };

    int[] grades = {
            85,
            42,
            91,
            67,
            38,
            76
    };


    public void gradesStudent(){
        for(int i = 0; i < students.length; i++) {
            System.out.println("Student: " + students[i] + " grades: " + grades[i]);
        }
    };

    public void avaregeGrade(){
        int sum=0;
        for(int i = 0; i < grades.length; i++) {
            sum+=grades[i];
        }
        double sum1=(double)sum/students.length;
        System.out.println(sum1);
    }

    public void highestGrade(){
        int highest=0;
        for(int i = 0; i < grades.length; i++) {
            if(grades[i]>highest){
                highest=grades[i];
            }
        }
        System.out.println("Highest grade: " + highest);
    }

    public void lowestGrade(){
        int lowest=0;
        for(int i = 0; i < grades.length; i++) {
            if(grades[i]<lowest){
                lowest=grades[i];
            }
        }
        System.out.println("Highest grade: " + lowest);
    }




    public void passedStudents(){
        for(int i = 0; i < students.length; i++) {
            if(grades[i]>50)
            System.out.println("Student: " + students[i] + " grades: " + grades[i]);
        }
    }


    public void failedStudent(){
        for(int i = 0; i < students.length; i++) {
            if(grades[i]<50)
                System.out.println("Student: " + students[i] + " grades: " + grades[i]);
        }
    }


    public void searchGrade(){
        Scanner input = new Scanner(System.in);
        int searchGrade = input.nextInt();
        boolean found = false;
        for(int i = 0; i < students.length; i++) {
            if(grades[i]==searchGrade) {
                System.out.println("Student: " + students[i] + " Grade found!");
                found = true;
            }}
        if (!found) {
            System.out.println("Grade not found!");
        }

    }
}
