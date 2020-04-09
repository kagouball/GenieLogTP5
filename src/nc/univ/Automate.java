package nc.univ;

public class Automate implements IEvenement{

    private IEtat etatCourant;
    private X controle;

    public Automate(){
        etatCourant = new Etat1();
    }

    public IEtat getEtatCourant() {
        return etatCourant;
    }

    public void changementEtat(IEtat etat){
        etatCourant = etat;
    }

    public X getControle() {
        return controle;
    }

    public void setControle(X controle) {
        this.controle = controle;
    }

    @Override
    public void evenement1() {
        etatCourant.evenement1(this);
    }

    @Override
    public void evenement2() {
        etatCourant.evenement2(this);
    }
}
