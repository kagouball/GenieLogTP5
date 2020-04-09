package nc.univ;

public class Etat2 implements IEtat {


    @Override
    public void evenement1(Automate a) {
        Etat2 e1 = (Etat2) a.getEtatCourant();
        e1.evenement1(a);
    }

    @Override
    public void evenement2(Automate a) {

    }
}
