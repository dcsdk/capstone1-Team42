package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.model.Model;

import processing.core.PApplet;

public abstract class AbstractGameView extends AbstractView {

	protected Model model;

	public AbstractGameView(PApplet display, Model model) {
		super(display);
		this.model = model;
	}

}
