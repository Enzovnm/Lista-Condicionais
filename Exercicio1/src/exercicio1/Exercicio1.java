package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada;
        short num;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = entrada.nextShort();
        
        if(num%2==0)
            System.out.println("O número "+num+" é par");
        
        else
            System.out.println("O número"+num+" é impar");
        
    }
    
}
