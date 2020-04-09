package nc.univ;

public class Automate implements IEvenement{

    private IEtat etatCourant;
    private ChronoProf2 controle;

    public Automate(){
        etatCourant = new Etat1();
    }

    public IEtat getEtatCourant() {
        return etatCourant;
    }

    public void changementEtat(IEtat etat){
        etatCourant = etat;
    }

    public ChronoProf2 getControle() {
        return controle;
    }

    public void setControle(ChronoProf2 controle) {
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
}
