/*
 * Panneau.java                                            16 mai 2015
 * IUT INFO1 2014-2015
 */
package iut.info1.fenetre;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * JPanel qui contient l'ensemble des composants graphiques de l'animation.
 * Ici la balle et le rectangle qui la suit pour effacer les traces.
 * @author maxime
 */
public class Panneau extends JPanel {

	/* Position de la balle sur l'axe des abscisses au départ*/
	private int posX = -50;
	
	/* Position de la balle sur l'axe des ordonnées au départ*/
	private int posY = -50;
	
	/* Description graphique de la balle */
	public void paintComponent(Graphics figure) {
		figure.setColor(Color.white);
		figure.fillRect(0, 0, this.getWidth(), this.getHeight());
		figure.setColor(Color.blue);
		figure.fillOval(posX, posY, 50, 50);
	}

	/**
	 * Récupère la position sur l'axe des abscisses de la balle
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * Modifie la valeur de l'abscisse de la balle
	 * @param posX the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * Récupère la position sur l'axe des ordonnées de la balle
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * Modifie la valeur de l'ordonnee de la balle
	 * @param posY the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
