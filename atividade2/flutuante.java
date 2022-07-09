package atividade2;


import java.util.Scanner;


public class flutuante {

    public static void main(String[] args) {

        Float h, b, B, a;

        Scanner ler = new Scanner (System.in);

        System.out.println("Digite o valor da altura: ");
        h = ler.nextFloat();
        
        System.out.println("Digite o valor da base menor: ");
        b = ler.nextFloat();
        
        System.out.println("Digite o valor da base maior: ");
        B = ler.nextFloat();

        a = (h * (b + B)) / 2;

        System.out.println("O valor exato da área é " + a + " e o valor arredondado para inteiro é " +Math.ceil(a));

    }
    
}  

