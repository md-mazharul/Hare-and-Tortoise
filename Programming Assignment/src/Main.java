import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Tortoise tortoises = new Tortoise();
        Hare hares = new Hare();

        int tortoise_move  = 0; // The initial point of the race
        int hare_move =0; // The initial point of the race

        System.out.println("BANG !!!!! ");
        System.out.println("AND THEY'RE OFF !!!!!");

        while(tortoise_move <70 && hare_move <70){

            for(int i =0;i<70;i++){
                if(i == hare_move){
                    System.out.print("H"); // print Hear position
                }else if (i == 69) {
                    System.out.print("|"); // The end point of the race
                }
                else{
                    System.out.print("-"); //the racetrack
                }
            }
            System.out.println();

            for(int i =0;i<70;i++){
                if(i == tortoise_move){
                    System.out.print("T"); // print Tortoise position
                }
                else if (i == 69){
                    System.out.print("|"); // The end point of the race
                }
                else{
                    System.out.print("-"); //the racetrack
                }
            }
            System.out.println();

            int tortoise_random = rand.nextInt(10)+1; //Find the tortoise's random move
            tortoise_move= tortoises.move_type(tortoise_move, tortoise_random);

            if(tortoise_move <0){
                tortoise_move = 0; // if Tortoise position is less than initial point then tortoise point is 0
            }

            int hear_random = rand.nextInt(10)+1; //Find the hears random move
            hare_move = hares.move_type(hare_move,hear_random);

            if(hare_move <0){
                hare_move = 0;// if Hare position is less than initial point then tortoise point is 0
            }
            if(tortoise_move == hare_move){

                int temp =0;

                while(temp < tortoise_move){
                    System.out.print("-");
                    temp++;
                }
                System.out.print("OUCH!!!");

                while(temp < 62){
                    System.out.print("-");
                    temp++;
                }
                System.out.println();
            }
        }

        if(tortoise_move >=69){ // Tortoise wins

            for(int i =0;i<68;i++){
                System.out.print("-");
            }

            System.out.println("T");
            System.out.println("TORTOISE WINS!!! YAY!!!");
            System.out.println("Tortoise rewarded with a pail of fresh carrots");

        }else{ // Hare wins

            for(int i =0;i<68;i++){
                System.out.print("-");
            }

            System.out.println("H");
            System.out.println("Hare wins");
            System.out.println("Hare rewarded with a pail of fresh carrots");
        }
    }
}