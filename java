import java.unil.Scanner;

public class Final_project {
    public static void main(String[] args){
        int score = 0;
        Scanner Obj = new Scanner(System.in);
        System.out.println("-----Welcome to my MINI-TRIVIA game------" + "/n");
        
        System.out.println("What is your Name: ");
        String name = Obj.nextLine();
        System.out.println("Your name is: " + name);
        Obj.close();
        
        System.out.println("What is 27/3 times 6? (54), (27), (53), (22)");
        int q1 = Obj.nextInt();
        
        if(q1 == 54){
            score++;
        }
        
        System.out.println("what is 33 + 4 / 2? (30), (33), (35), (22)");
        int q2 = Obj.nextInt();
        
        if(q2 == 35){
            score++;
        }
        
        System.out.println("How many states are in the U.S. (52), (49), (50), (44)");
        int q3 = Obj.nextInt();
        
        if(q3 == 50){
            score++;
        }
        
        System.out.println("What year did Abraham lincoln die. (1863), (1899), (2022), (1865) ");
        int q4 = Obj.nextInt();
        
        if(q4 == 15){
            score++;
        }
        
        System.out.println(name + "You scored" + score);
    
    }
}
