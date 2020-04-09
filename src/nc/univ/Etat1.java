package nc.univ;

public class Etat1 implements IEtat{

    @Override
    public void demarrer(Automate a) {
        ChronoProf2 chrono = a.getControle();
        chrono.lancerChrono();
        a.changementEtat(new Etat2());
    }

    @Override
    public void arreter(Automate a) {
        //Etat2 e2 = (Etat2) a.getEtatCourant();
        //e2.evenement1(a);
    }
}
