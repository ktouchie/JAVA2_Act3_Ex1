import java.util.*;
class parligne {
    
    public static void main(String[] args){
        
        int array[][] = {{1,2,3,4,5},{2,4,6,8,10},{3,6,9,12,15},{4,8,12,16,20}};
        
        for (int n = 0; n<array.length; n++) {
            for (int m = 0; m<array[n].length; m++) {
                System.out.print(array[n][m] + " ");
            }
            System.out.println("");
        }
        
    }
    
}