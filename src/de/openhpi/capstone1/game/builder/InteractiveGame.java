package de.openhpi.capstone1.game.builder;

import processing.core.PApplet;

import de.openhpi.capstone1.game.view.*;
import de.openhpi.capstone1.game.controller.GameController;
import de.openhpi.capstone1.game.model.Model;
import de.openhpi.capstone1.game.view.*;

public class InteractiveGame extends InteractiveComponent {
	
	GameController gameController;
	Model model;
	
	public InteractiveGame() {}
	
	public void addModel() {
		System.out.println("Adding model to game object");
		model = new Model();
	}
	
	public void createViews(PApplet applet) {
		System.out.println("Adding views to game object");
		views = new AbstractView[3];

		//Views don't exist yet

		views[0] = new PaddleView(applet, model);
		views[1] = new BallView(applet, model);
		views[2] = new BlockView(applet, model);

	}
	
	public void addController() {
		System.out.println("Adding controller to game object");
		gameController = new GameController(model);
	}
	
	@Override
	public void handleEvent() {
		
	}


}
