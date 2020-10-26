package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String seniors[] = {"Rogan", "Brandon"};
        String juniors[] = {"Bryan", "Hamilton", "Kenadi", "Mason"};
        String sophomores[] = {"Luke", "Will", "Alexis", "Taten"};

        System.out.println("Type a student's name in Mr. Osowski's 5th hour house A class.");
        String name = input.nextLine();

        for (int i = 0; i < sophomores.length; i++){
          if (name.equals(sophomores[i])){
              System.out.println("Grade 10.");
          }  
        }

        for (int i = 0; i < juniors.length; i++){
          if (name.equals(juniors[i])){
              System.out.println("Grade 11.");
          }  
        }

        for (int i = 0; i < seniors.length; i++){
          if (name.equals(seniors[i])){
              System.out.println("Grade 12.");
          }  
        }
    }
}