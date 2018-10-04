package de.openhpi.capstone1.game.controller;

import de.openhpi.capstone1.game.model.*;

public class GameController implements Controller{

	Paddle paddle;
	
	public GameController(Paddle paddle) { 
		this.paddle = paddle;
	}
	
	public void handleEvent() {
		//handle event
	};	
	
}
