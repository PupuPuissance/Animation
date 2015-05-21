/*
 * Fenetre.java                                            16 mai 2015
 * IUT INFO1 2014-2015
 */
package iut.info1.fenetre;

import javax.swing.JFrame;

/**
 * D�fini la fen�tre de l'animation o� se d�roule le mouvement de la balle
 * @author maxime
 */
public class Fenetre extends JFrame {

	/* Cette fen�tre utilise un JPanel que j'ai d�crit dans la classe Panneau*/
	private Panneau notrePanneau = new Panneau();

	public Fenetre() {
		this.setTitle("Animation");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setContentPane(notrePanneau);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		dessine();
	}

	/**
	 * Demande � notre classe Panneau de se red�ssiner pour que la balle bouge
	 */
	private void dessine() {
		do {
			for (int i = 0; i < notrePanneau.getWidth(); i++) {
				int x = 0;
				int y = 0;
				notrePanneau.setPosX(i);
				notrePanneau.setPosY(i);

				/*
				 *  Redessine, elle appelle la m�thode paintComponent de notre 
				 *  classe Panneau. Or ici vu que l'on change les coordonn�es de la
				 *  balle cela fait bouger la balle.
				 */
				notrePanneau.repaint();

				// L'instruction suivante permet de mettre en attente le programme 
				try {
					Thread.sleep(10); // Ici 10 milli�me de seconde d'attente
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				/*
				 * Quand les coordonn�es de la balle arrivent au bord de la
				 * fen�tre on r�initialise les coordonn�es.
				 */
				if (x == notrePanneau.getWidth() || y == notrePanneau.getHeight()) {
					notrePanneau.setPosX(0);
					notrePanneau.setPosY(0);
				}
			}
		} while (true);
		//System.out.println("blabla"); // S'affiche quand la balle s'arr�te

	}
}
