public class Hare {
    int move_type(int i, int random){
        if(random<=2){
            i = i+0; //Sleep
        }
        else if(random <=4){
            i=i+9; // Big hop
        }else if(random <=5){
            i = i-12; // Big slip
        }else if(random <=8){
            i = i+1; // Small hop
        }
        else{
            i=i-2; // Small Slip
        }
        return i;
    }
}
