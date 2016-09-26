
package javachallenges;
import java.util.Scanner;

public class JavaChallenges {

    //1
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System. in);
        String answer = sc.nextLine();
        System.out.println("Hello, " + answer);
    //2
   String Country="England";
   String Population="60,000,000";
   System.out.println(Country + " has a population of " + Population);
   //3
        System.out.println("What is your first number?");
        Scanner sc1 = new Scanner (System. in);
        String answer1 = sc1.nextLine ();
        int number = Integer.parseInt(answer1);
        System.out.println("What is your second number?");
        Scanner sc2 = new Scanner (System. in);
        String answer2 =sc2.nextLine ();
        int number1 = Integer.parseInt(answer2);
        System.out.println(answer2 + " divided by " + answer1 + " equals " + number1/number);
        //4
        System.out.println("Type a number: ");
        Scanner sc3 = new Scanner (System. in);
        String answer3 =sc3.nextLine();
        int num = Integer.parseInt(answer3);
        if (num < 100){
            System.out.println ("Your number is less than 100");
        }else
            System.out.println("Your number is more than 100");
        //5
        System.out.println("What is your test score?");
        Scanner sc4 = new Scanner (System. in);
        String answer4 =sc4.nextLine();
        int score = Integer.parseInt (answer4);
        if (score> 20)
            System.out.println("You got an A");
        if (score>10 && score<19)
            System.out.println("You got a C");
        if(score<10)
            System.out.println("You failed the test");
        //6
        System.out.println("What is the rectangle's width?");
        Scanner sc5 = new Scanner (System. in);
        String answer5 =sc5.nextLine ();
        int width = Integer.parseInt (answer5);
        System.out.println("What is the rectangle's length?");
        Scanner sc6 = new Scanner (System. in);
        String answer6 =sc6.nextLine ();
        int length = Integer.parseInt (answer6);
        System.out.println("The rectangle's area is: " + (width*length));
        //7
        System.out.println("What speed were you going in mph?");
        Scanner sc7 = new Scanner (System. in);
        String answer7 = sc7.nextLine ();
        int speed = Integer.parseInt (answer7);
        System.out.println("How long were you travelling for in hours?");
        Scanner sc8 = new Scanner (System. in);
        String answer8 = sc8.nextLine ();
        int time = Integer.parseInt (answer8);
        System.out.println("You travelled: " + speed*time + " miles");
        //8
        System.out.println("Type a number: ");
        Scanner sc9 = new Scanner (System. in);
        String answer9 =sc9.nextLine ();
        int firstNum = Integer.parseInt (answer9);
        System.out.println("Type another number: ");
        Scanner sc10 = new Scanner (System.in);
        String answer10 = sc10.nextLine ();
        int secondNum = Integer.parseInt (answer10);
        System.out.println("Would you like to +, -, * or / your two numbers?");
        Scanner sc11 = new Scanner (System. in);
        String answer11 =sc11.nextLine ();
        if (answer11.contains ("+")){
            System.out.println("Your answer is: " + (firstNum+secondNum));}
        if (answer11.contains ("-")){
            System.out.println("Your answer is: " +  (firstNum-secondNum));}
        if (answer11.contains ("*")){
            System.out.println("Your answer is: " + (firstNum*secondNum));}
        if (answer11.contains ("/")){
            System.out.println("Your answer is: " + (firstNum/secondNum));}
        }
        
    
    }
    
        
