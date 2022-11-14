import java.unil.Scanner;

public class Final_Project {
    public static void main(String[] args){
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("-----Welcome to my MINI-TRIVIA game------" + "/n");
        
        System.out.println("What is 27/3 times 6? (54), (27), (53), (22)");
        int q1 = input.nextInt();
        
        if(q1 == 54){
            score++;
        }
        
        System.out.println("what is 33 + 4 / 2? (30), (33), (35), (22)");
        int q2 = input.nextInt();
        
        if(q2 == 35){
            score++;
        }
    
    }
}
