package nc.univ;

import nc.univ.ChronoProf2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class IHMChrono extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	JButton demarrer = new JButton("demarrer");
	JButton arreter = new JButton("arreter");
	ChronoProf2 chrono;

	public IHMChrono(int duree) {
		setPreferredSize(new Dimension(500,300));
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		chrono = new ChronoProf2(this, duree, 200, 120, 100);
		demarrer.addActionListener(this);
		arreter.addActionListener(this);
		add(demarrer);
		add(arreter);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();

		if (source == demarrer) chrono.demarrer();
		else if  (source == arreter) chrono.arreter();
	}

	public void paintComponent(Graphics g)  {
		super.paintComponent(g);
		chrono.dessine(g);
	}
}
