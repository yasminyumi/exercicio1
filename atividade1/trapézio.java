package atividade1;

import java.util.Scanner;

public class trapézio {
   
    public static void main(String[] args) {

        Integer h, b, B, a;

        Scanner ler = new Scanner (System.in);

        System.out.println("Digite o valor da altura: ");
        h = ler.nextInt();
        
        System.out.println("Digite o valor da base menor: ");
        b = ler.nextInt();
        
        System.out.println("Digite o valor da base maior: ");
        B = ler.nextInt();

        a = (h * (b + B)) / 2;
        System.out.println("O valor da área é " + a);

    }
    
}
