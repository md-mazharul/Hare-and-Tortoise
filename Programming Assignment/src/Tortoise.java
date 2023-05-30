public class Tortoise {
    int moves;
    int move_type(int i, int random){
        if(random<=5){
           i = i+3; //Fast plod
        }
        else if(random <=7){
            i=i-6; // Slip
        }else{
            i=i+1; //Slow plod
        }
        return i;
    }
}
