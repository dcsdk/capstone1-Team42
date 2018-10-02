
package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.model.Ball;

import processing.core.PApplet;

public class BallView extends AbstractView{
	
	Ball ball;
	
	public BallView(PApplet display, Ball ball) {
		super(display);
		this.ball = ball;
	}
	
	public void update() {
		int ballColor = ball.getBallColor();
		float[] ballCoordinates = ball.getBallCoordinates();
		float ballX = ballCoordinates[0];
		float ballY = ballCoordinates[1];
		float ballWidth = ballCoordinates[2];
		
	    display.noStroke();
	    display.fill(ballColor);
	    display.ellipse(ballX, ballY, ballWidth, ballWidth);
		
	}
}

