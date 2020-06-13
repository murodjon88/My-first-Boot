package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Robot", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        System.out.print(" <");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        System.out.print(" <");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        String quesion = "Which programming language takes the second place by TIOBE rating?";
        String ansawer1 = "1. C";
        String ansawer2 = "2. Java";
        String ansawer3 = "3. Python";
        String ansawer4 = "4. C++";
        System.out.println(quesion + "\n" + ansawer1 + "\n" + ansawer2 + "\n" + ansawer3 + "/n" + ansawer4);
        while (scanner.hasNext()) {
            System.out.print("< ");
            int ansawer = scanner.nextInt();
            if (ansawer == 2) {
                break;
            } else {
                System.out.println("\n" + "Please, try again.");
            }
            
        }
        // write your code here
    }

    static void end() {
        System.out.println("\n" + "Congratulations, have a nice day!"); // Do not change this text
    }
}
