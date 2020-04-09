package nc.univ;

import java.util.Scanner;

public class MyX {
    public static void main(String[] args) {
        Automate automate = new Automate();
        X x = new X(automate);
        automate.setControle(x);



        Scanner sc = new Scanner(System.in);
        int choix = 3;
        while(choix != 0){
            System.out.println("1 -> evenement 1" +
                    "\n2 -> evenement 2" +
                    "+\n0 -> quitter");
            choix = sc.nextInt();

            switch (choix){
                case 0:
                    System.out.println("BYE");
                    break;
                case 1:
                    x.evenement1();
                    break;
                case 2:
                    x.evenement2();
                    break;
                default:
                    System.out.println("WRONG");
                    break;
            }
        }

    }
}
