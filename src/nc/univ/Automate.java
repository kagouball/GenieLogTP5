package nc.univ;

public class Automate implements IEvenement{

    private IEtat etatCourant;
    private X controle;

    public Automate(){
    }

    public void setEtatCourant(IEtat etatCourant){
        this.etatCourant = etatCourant;
    }

    public IEtat getEtatCourant() {
        return etatCourant;
    }

    public void changementEtat(IEtat etat){

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

    }
}
