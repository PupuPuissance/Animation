/*
 * Fenetre.java                                            16 mai 2015
 * IUT INFO1 2014-2015
 */
package iut.info1.fenetre;

import javax.swing.JFrame;

/**
 * Défini la fenêtre de l'animation où se déroule le mouvement de la balle
 * @author maxime
 */
public class Fenetre extends JFrame {

	/* Cette fenêtre utilise un JPanel que j'ai décrit dans la classe Panneau*/
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
	 * Demande à notre classe Panneau de se redéssiner pour que la balle bouge
	 */
	private void dessine() {
		do {
			for (int i = 0; i < notrePanneau.getWidth(); i++) {
				int x = 0;
				int y = 0;
				notrePanneau.setPosX(i);
				notrePanneau.setPosY(i);

				/*
				 *  Redessine, elle appelle la méthode paintComponent de notre 
				 *  classe Panneau. Or ici vu que l'on change les coordonnées de la
				 *  balle cela fait bouger la balle.
				 */
				notrePanneau.repaint();

				// L'instruction suivante permet de mettre en attente le programme 
				try {
					Thread.sleep(10); // Ici 10 millième de seconde d'attente
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				/*
				 * Quand les coordonnées de la balle arrivent au bord de la
				 * fenêtre on réinitialise les coordonnées.
				 */
				if (x == notrePanneau.getWidth() || y == notrePanneau.getHeight()) {
					notrePanneau.setPosX(0);
					notrePanneau.setPosY(0);
				}
			}
		} while (true);
		//System.out.println("blabla"); // S'affiche quand la balle s'arrête

	}
}
