package de.openhpi.capstone1.game.builder;

import processing.core.PApplet;

public class InteractiveGameBuilder {
	public static InteractiveGame create(PApplet applet) {
		InteractiveGame iGame = null;
	
		//build components
		System.out.println("Instantiating game object");
		iGame = new InteractiveGame();
		
		iGame.addModel();
		
		iGame.createViews(applet);
		
		iGame.addController();
		
		return iGame;
	}
}
