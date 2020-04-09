package nc.univ;

public class Chrono implements IEvenement{

    private Automate controller;

    public Chrono(Automate controller){
        this.controller = controller;
    }

    @Override
    public void demarrer() {
        controller.demarrer();
    }

    @Override
    public void arreter() {
        controller.arreter();
    }

    public void lancerChrono(){
        System.out.println("Démarrer");
    }

    public void stopperChrono(){
        System.out.println("Stopper");
    }
}
