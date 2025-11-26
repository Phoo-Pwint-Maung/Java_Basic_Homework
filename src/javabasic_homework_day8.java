import java.util.Scanner;

public class javabasic_homework_day8 {
    public static void main(String[] args) {
        String studentName ;
        int score;
        int age;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your name : ");
        studentName = userInput.nextLine();

        System.out.print("Please enter your score (0-100) : ");
        score = userInput.nextInt();

        System.out.print("Please enter your age : ");
        age = userInput.nextInt();


        //Show student name
        System.out.println("Your name is : " + studentName);

        //Show score
        System.out.println("Your score is : " + score);

        //Check score grade and show grade
        if(score >= 90){
            System.out.println("Your grade is A");
        }else if(score >= 80){
            System.out.println("Your grade is B");
        }else if (score >= 70){
            System.out.println("Your grade is C");
        }else if (score >= 60){
            System.out.println("Your grade is D");
        }else{
            System.out.println("Your grade is E");
        }

        //Check age and show age
        if(age < 18){
            System.out.println("You are Minor student");
        }
        else{
            System.out.println("You are Adult student");
        }



    }
}
