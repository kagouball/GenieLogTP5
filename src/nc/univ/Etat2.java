package nc.univ;

public class Etat2 implements IEtat {


    @Override
    public void demarrer(Automate a) {
        ChronoProf2 chrono = a.getControle();
        chrono.lancerChrono();
    }

    @Override
    public void arreter(Automate a) {
        ChronoProf2 chrono = a.getControle();
        chrono.stopperChrono();
        a.changementEtat(new Etat1());
    }
}
