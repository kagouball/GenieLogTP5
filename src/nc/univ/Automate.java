package nc.univ;

public class Automate implements IEvenement{

    private IEtat etatCourant;
    private Chrono controle;

    public Automate(){
        etatCourant = new Etat1();
    }

    public IEtat getEtatCourant() {
        return etatCourant;
    }

    public void changementEtat(IEtat etat){
        etatCourant = etat;
    }

    public Chrono getControle() {
        return controle;
    }

    public void setControle(Chrono controle) {
        this.controle = controle;
    }

    @Override
    public void demarrer() {
        etatCourant.demarrer(this);
    }

    @Override
    public void arreter() {
        etatCourant.arreter(this);
    }

    @Override
    public void suspendre() {
        etatCourant.suspendre(this);
    }

    @Override
    public void reprendre() {
        etatCourant.reprendre(this);
    }
}
