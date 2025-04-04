import java.util.Scanner;

public class starting {

    public static void main(String[] args) {
        
        

        Scanner start = new Scanner(System.in);
        String sport;
        
        System.out.println("what is your favorate sport?");
        sport = start.nextLine();
        System.out.println("Your favorate sport is : "+sport);
    }
}