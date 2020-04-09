package nc.univ;

import java.util.Scanner;

public class MyX {
    public static void main(String[] args) {

        Automate automate = new Automate();
        ChronoMoi chrono = new ChronoMoi(automate);
        //automate.setControle(chrono);



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
                    chrono.demarrer();
                    break;
                case 2:
                    chrono.arreter();
                    break;
                default:
                    System.out.println("WRONG");
                    break;
            }
        }

    }
}
