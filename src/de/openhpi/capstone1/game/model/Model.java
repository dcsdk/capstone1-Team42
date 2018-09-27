package de.openhpi.capstone1.game.model;

  

public abstract class Model {

	private int action = 0;
	
	public void someAction (int value) {
		this.action +=value;
	}
	
	public int getAction() {
		return this.action;
	}
	
}
