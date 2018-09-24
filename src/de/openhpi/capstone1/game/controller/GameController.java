package de.openhpi.capstone1.game.controller;

import de.openhpi.capstone1.game.model.*;

public class GameController implements Controller{

	Model model;
	
	public GameController(Model model) { 
		this.model = model;
	}
	
	public void handleEvent() {
		//handle event
	};	
	
}
