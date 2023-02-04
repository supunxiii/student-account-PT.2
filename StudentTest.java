import java.util.Scanner;

public class StudentTest{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = userInput.nextLine();
        System.out.println("Enter Student Address: ");
        String address = userInput.nextLine();
        System.out.println("Enter Current Level (As a Number): ");
        int level = userInput.nextInt();

        Student student1 = new Student(name, address, level);
        student1.displayValue();
        System.out.println();
        System.out.println("Enter Marks for Software Development: ");
        double sftDevMark = userInput.nextDouble();
        System.out.println("Enter Marks for Web Design & Development: ");
        double webDevMark = userInput.nextDouble();
        System.out.println("Enter Marks for Trends in Computer Science: ");
        double tcsMark = userInput.nextDouble();

        boolean moduleProgress = student1.passCheck(sftDevMark, webDevMark, tcsMark);
        if (moduleProgress == true){
            System.out.println("Congratulations! "+name+", you have passed the module.");
        } else {
            System.out.println(name+", you have failed the module. You need do the module once more.");
        }
    }
}