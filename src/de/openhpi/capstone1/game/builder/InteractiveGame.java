package de.openhpi.capstone1.game.builder;

import processing.core.PApplet;

import de.openhpi.capstone1.game.model.*;
import de.openhpi.capstone1.game.view.*;
import de.openhpi.capstone1.game.controller.*;


public class InteractiveGame extends InteractiveComponent {
	
	GameController gameController;
	Paddle paddle;
	Brick brick;
	Ball ball;
	
	public InteractiveGame() {}
	
	public void addModel() {
		System.out.println("Adding model to game object");
		paddle = new Paddle();
		brick = new Brick();
		ball = new Ball ();
		
	}
	
	public void createViews(PApplet applet) {
		System.out.println("Adding views to game object");
		views = new AbstractView[3];

		views[0] = new PaddleView(applet, paddle);
		views[1] = new BallView(applet, ball);
		views[2] = new BlockView(applet, brick);

	}
	
	public void addController() {
		System.out.println("Adding controller to game object");
		gameController = new GameController(paddle);
	}
	
	@Override
	public void handleEvent() {
		
	}

	public void drawGameObjects() {
//		model.drawBricks();
		ball.drawBall();
//		model.drawPaddle();
	}
	
}
