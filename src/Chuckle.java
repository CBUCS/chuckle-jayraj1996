import java.util.Random;
import java.util.Scanner;
public class Chuckle {
    public static Random r = new Random();

    public Chuckle() {
        Scanner scan = new Scanner(System.in); //Scanner is class used to take input from users.

        for (int i = 0; i < 12; i++) {
            int dice1 = (int)Math.random()*6 + 1;  // Roll the dice by setting each of the dice to be
            int dice2 = (int)Math.random()*6 + 1;   // a random number between 1 and 6.
            System.out.println("dice1 value : " + dice1);
            System.out.println("dice2 value : " + dice2);
            System.out.println("Sum :" + (dice1 + dice2));
            System.out.println("--------");
            System.out.println("Press 1 to roll out and Press 2 to lock the dices");
            int temp = scan.nextInt();
            switch(temp) {
                case 1:
                    dice1 =(int)(Math.random()*6)+ 1;
                    dice2 = (int)(Math.random()*6) + 1;
                    System.out.println("dice1 value : " + dice1);
                    System.out.println("dice2 value : " + dice2);
                    System.out.println("sum :" + (dice1 + dice2));
                    break;

                case 2:
                    System.out.println("Press 1 to lock dice 1 and 2 to lock dice 2");
                    int temp1 = scan.nextByte();
                    if (temp1 == 1) {
                        dice2 = (int)(Math.random()*6) + 1;
                        System.out.println("dice1 value : " + dice1);
                        System.out.println("dice2 value : " + dice2);
                        System.out.println("Sum :" + (dice1 + dice2));

                    }
                    if (temp1 == 2) {
                        dice1 = (int)(Math.random()*6) + 1;
                        System.out.println("dice1 value : " + dice1);
                        System.out.println("dice2 value : " + dice2);
                        System.out.println("Sum :" + (dice1 + dice2));
                    }
                    break;

            }
        }
    }

    public static void main(String[] args) {
        Chuckle ck = new Chuckle();
    }


}

