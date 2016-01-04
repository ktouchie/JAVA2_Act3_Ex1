import java.util.*;
class parcolonne {
    
    public static void main(String[] args){
        
        int array[][] = {{1,2,3,4,5},{2,4,6,8,10},{3,6,9,12,15},{4,8,12,16,20}}; //n=4; m=5
        
        int m = 0;
        int n = 0;
        
        do {
            for (n=0; n<array.length; n++) {
                System.out.print(array[n][m] + " ");
            }
            m++;
            System.out.println("");
        } while (m<array[0].length);
    }
    
}