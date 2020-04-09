package nc.univ;

public class ChronoMoi implements IEvenement{

    private Automate controller;

    public ChronoMoi(Automate controller){
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

    @Override
    public void suspendre() {

    }

    @Override
    public void reprendre() {

    }

    public void lancerChrono(){
        System.out.println("Démarrer");
    }

    public void stopperChrono(){
        System.out.println("Stopper");
    }
}
