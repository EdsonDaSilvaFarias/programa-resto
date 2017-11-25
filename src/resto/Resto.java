
package resto;

import java.util.Scanner;


public class Resto {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in );
        
        int x ;
        
        System.out.println(" digite um  valor inteiro :");
        x = input.nextInt();
        
        
        if ( (x % 2)== 0){
           System.out.println("par"); 
        }else {
            System.out.println("impa");
        }
        
        
    }
    
}
