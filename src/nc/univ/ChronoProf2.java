package nc.univ;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class ChronoProf2 implements Runnable,IEvenement {
    private int x, y, diametre;
    private JComponent proprietaire;
    private Thread deroulement;
    private long tempsEcoule = 0; // exprime en millisecondes
    private long duree; // nombre de millisecondes pour un tour complet
    private long momentDebut = 0;
    private long momentSuspension;
    private boolean finir;
    private boolean suspendu=false;

    private Automate controller;

    /* - proprietaire donne le composant devant contenir l'image du chronometre.
     * - duree donne le temps en secondes mis pour que le chronometre fasse un tour complet,
     * apres ce temps, le chronometre s'arrete.
     * - x et y indiquent  les coordonnees du coin superieur gauche du carre
     * circonscrit au chronometre
     *- diametre indique le diametre du chronometre*/
    public ChronoProf2(JComponent proprietaire, int duree, int x, int y, int diametre) {
        this.duree = duree * 1000;
        this.x = x;
        this.y = y;
        this.diametre = diametre;
        this.proprietaire = proprietaire;

        this.controller = new Automate();
        controller.setControle(this);
    }



    //=========CONTROLES SUR CHRONO===================

    /* Demarre le chronometre */
    public void lancerChrono()  {
        deroulement = new Thread(this);
        deroulement.start();
    }

    public synchronized void stopperChrono() {
        suspendu=false;
        finir = true;
        notifyAll();
    }

    /* Fait tourner le chronometre */
    public void run() {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        finir = false;
        momentDebut = System.currentTimeMillis();
        while((tempsEcoule < duree) && (!finir))
        {
            tempsEcoule = System.currentTimeMillis() -
                    momentDebut;
            proprietaire.repaint(new Rectangle(x, y, diametre, diametre));
            try {
                Thread.sleep(200);
                synchronized(this) {
                    while (suspendu && !finir) wait();
                }
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    /* Dessine le chronometre selon le temps pendant lequel il a tourne  depuis qu'il a ete mis en fonctionnement */
    public void dessine(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillArc(x, y, diametre, diametre, 90,
                (int)(360 - tempsEcoule * 360 / duree));
        g.setColor(Color.GREEN);
        g.fillArc(x, y, diametre, diametre,90,
                (int)(-tempsEcoule * 360 / duree));
    }

    @Override
    public void demarrer() {
        controller.demarrer();
    }

    @Override
    public void arreter() {
        controller.arreter();
    }

}
