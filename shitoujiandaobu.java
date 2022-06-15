// 石头剪刀布
import java.util.Scanner;
import java.util.Random;
public class shitoujiandaobu{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int random = 0;
        int input = 0;
        while(true) {
            System.out.println("Please input(0=shi,1=jian,2=bu).");
            input = sc.nextInt();
            System.out.println("Please wait computer...");
            random = rd.nextInt(3);
            System.out.println(random);
            if (random == input) {
                System.out.println("They're having the same scores.");
            } else if (random == 0 && input == 1) {
                System.out.println("You lose...");
            } else if (random == 0 && input == 2){
                System.out.println("You win!");
            } else if (random == 1 && input == 0){
                System.out.println("You win!");
            } else if (random == 2 && input == 0){
                System.out.println("You lose...");
            } else if (random == 1 && input == 2){
                System.out.println("You lose...");
            } else if(random == 2 && input == 1){
                System.out.println("You win!");
            } else{
                System.out.println("Input is error!");
            }
        }
    }
}