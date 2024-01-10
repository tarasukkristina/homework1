import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subject: ");
        int numSubject = scanner.nextInt();

        int totalGrade = 0;
        int subject = 1;
        for (int i = 1; i <= numSubject; i++) {          //i=номер предмета
            System.out.println("Enter the grade of subject " + i + ":");
            int grade = scanner.nextInt();
            if (grade >= 1 && grade <= 10) {
                totalGrade += grade;
                subject++;
            } else {System.out.println("Enter the number from 1 to 10");
            }
        }
        double averageGrade = totalGrade / numSubject;
        System.out.println("Average grade: " + averageGrade);

    }
}