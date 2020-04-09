package nc.univ;

import javax.swing.*;

public class X implements IEvenement{

    private Automate controller;

    public X(Automate controller){
        this.controller = controller;
    }

    @Override
    public void evenement1() {
        controller.evenement1();
    }

    @Override
    public void evenement2() {
        controller.evenement2();
    }

    public void action1(){
        System.out.println("Je réalise l'action 1");
    }

    public void action2(){
        System.out.println("Je réalise l'action 2");
    }
}
