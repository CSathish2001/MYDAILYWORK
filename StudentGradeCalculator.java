import java.util.Scanner;

public class StudentGradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("*..Student Grade Calculater..*");
        System.out.print("Enter No.of Subjects: ");
        int subjects_count = sc.nextInt();
        int total = 0;
        //Requesting user input (Subject Marks)...
        for(int i = 1; i <= subjects_count; i++)
        {
            System.out.print("Enter marks obtained in Subject "+i+" : ");
            int marks = sc.nextInt();
            total+= marks;
            // Checking out minimum marks obtained to pass Subject... 
            if(marks < 36)
            {
                total = 0;
                break;
            }
        }
        //Calculating Average Marks obtained in Subjects... 
        float average = (float)total/subjects_count;

        //Printing Garde to Average Marks...
        char grade;
        if(average >= 90)
        {
            grade = 'O';
        }
        else if (average >= 80) 
        {
            grade = 'A';   
        }
        else if(average >= 70)
        {
            grade = 'B';
        }
        else if(average >= 60)
        {
            grade = 'C';
        }
        else if(average >= 50)
        {
            grade = 'D';
        }
        else if(average >= 36)
        {
            grade = 'E';
        }
        else 
        {
            grade = 'F';
        }
        //Printing Final result of Student...
        System.out.println("Total Marks Scored is : "+total);
        System.out.println("Average Percentage is Gained is : "+average+"%");
        System.out.println("Grade : "+grade);
    }   

}
