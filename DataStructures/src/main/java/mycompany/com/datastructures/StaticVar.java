
package mycompany.com.datastructures;

import java.util.Scanner;



public class StaticVar {
   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        
        while(true) {
            System.out.print("Informe o nome do susario: ");
            nome = input.next();
            GenId.create();
            System.out.println("O ID de "+nome+"é "+GenId.id );
        }
        
    }
}