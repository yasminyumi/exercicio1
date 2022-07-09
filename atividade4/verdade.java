package atividade4;

public class verdade {

    public static void main(String[] args) {
        
        Boolean a, b, c, d, e, f;
        int i=0;

        a = (1 > 2);
        System.out.println("(1 > 2) " + a);

        b = (8 == 8);
        System.out.println("(8 == 8) " + b);

        c = ((12 - 5) > 6);
        System.out.println("((12 - 5) > 6) " + c) ;

        d = (0 < 3) && (8 < 9);
        System.out.println("(0 < 3) e (8 < 9) " + d);

        e =  ((i++) > i);
        System.out.println("((i++) > i) " + e);

        f = ((10 * 90 / 50 - 2) == 16); 
        System.out.println("(( 10 * 90 / 50 - 2) == 16) " + f);

    }
    
}

