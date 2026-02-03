import java.util.*;
public class RPS{
    public static void main(String[] args){
        int choice;
        String weapon;
        String op4Weapon;
        int countW = 0;
        int countT = 0;
        int countL = 0;
        int userWeapon = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MY GAME OF ROCK-PAPER-SICCORS! ENTER 0 TO QUIT AT ANYTIME");

        


        do {  
            int op4 = (int)(Math.random()*4);
            if (op4 == 1) {
                op4Weapon = "rock";
            } else if (op4 == 2) {
                op4Weapon = "paper";
            } else {
                op4Weapon = "scissors"; 
            }
            System.out.println("..."); //end of initilization
                    System.out.println("CHOOSE YOUR WEAPON: ");
                    weapon = input.nextLine().toLowerCase();

            if (weapon.equals("rock")) {
                userWeapon = 1;
            } else if (weapon.equals("paper")) {
                userWeapon = 2;
            } else if (weapon.equals("scissors")) {
                userWeapon = 3;
            } else {
                System.out.println("INVALID WEAPON!");
            }                     //weapon math done

            //start of attack calculations

            //rock portion
           if (userWeapon == 1 && op4 == 1) {
            System.out.println("COMPUTER CHOSE: ROCK... ITS A TIE!");
                countT++;
           } else if (userWeapon == 1 && op4 == 2) {
            System.out.println("COMPUTER CHOSE: PAPER... YOU LOSE!");
                countL++;
           } else if (userWeapon ==1 && op4 == 3) {
            System.out.println("COMPUTER CHOSE: SCISSORS... YOU WIN!");
                countW++;
           } 
           //paper portion
            if (userWeapon == 2 && op4 == 1) {
            System.out.println("COMPUTER CHOSE: ROCK... YOU WIN!");
                countW++;
           } else if (userWeapon == 2 && op4 == 2) {
            System.out.println("COMPUTER CHOSE: PAPER... ITS A TIE!");
                countT++;
           } else if (userWeapon ==2 && op4 == 3) {
            System.out.println("COMPUTER CHOSE: SCISSORS... YOU LOSE!");
                countL++;
           }
           //scissors portion
            if (userWeapon == 3 && op4 == 1) {
            System.out.println("COMPUTER CHOSE: ROCK... YOU LOSE!");
                countL++;
           } else if (userWeapon == 3 && op4 == 2) {
            System.out.println("COMPUTER CHOSE: PAPER... YOU WIN!");
                countW++;
           } else if (userWeapon ==3 && op4 == 3) {
            System.out.println("COMPUTER CHOSE: SCISSORS... ITS A TIE!");
                countT++;
           }

           System.out.println(" ");
            System.out.println("WOULD YOU LIKE TO CONTINUE?... ENTER 1 TO CONTINUE OR 0 TO QUIT");
            choice = input.nextInt();
            input.nextLine();


            

        } while (choice != 0);
        System.out.println("YOU WON: "+ countW + " TIMES, TIED "  + countT +  " TIMES & LOST " + countL + " TIMES, WHAT A TRACK RECORD!" );
    }
}