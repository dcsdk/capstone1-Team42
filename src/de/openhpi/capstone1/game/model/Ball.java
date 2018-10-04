package de.openhpi.capstone1.game.model;

import de.openhpi.capstone1.game.starter.TheApp;
import processing.core.PApplet;

public class Ball extends PApplet {
///*******Ball Class**************/
/* The default class has the following default modes
 * Constructor function: to create a new ball call:
   Ball ballName= new Ball(x, y, Width, Color);
 * ballName.draw();  //this draws the ball
 * ballName.update(); //this moves the ball
 * ballName.checkWallCollision(); //
 */
	
	//Display window size
	int widthD = TheApp.widthD;
	int heightD = TheApp.heightD;
	
	private int ballWidthStart = 16;
	private float ballStartX = widthD/2; 
	private float ballStartY=heightD/2;
	
	private float speedY= 3.5f;
	private float speedX= 3.5f;

	private float ballX = ballStartX;
	private float ballY = ballStartY;
	private float ballWidth = (float)ballWidthStart;
    private int ballColor = color(255, 0, 0);  
 

  
  //This is constructor known as the function that initiates

	public Ball(){

	}

	  public int getBallColor() {
		  return ballColor;
	}
	
  public float[] getBallCoordinates()
  {
	  float[] ballCoordinates = {ballX,ballY,ballWidth};
	  return ballCoordinates;
  }
  
	//draw the ball
	public void drawBall() {
	    update();
	    if(checkWallCollision()) {
//	      lives--;
	      move(widthD/2, heightD/2);
	    }
	}

  
  //this changes the ball to the speed;
  private void update() {
    ballX+=speedX;
    ballY+=speedY;
  }
  private void move(int X, int Y) {
    ballX = X;
    ballY = Y;
    speedY= 4;
    speedX= 4;
  }
  
  //this does the bounce
  private boolean checkWallCollision() {
    if (ballX>widthD-ballWidth/2) {
        speedX=-abs(speedX); 
    } else if (ballX<ballWidth/2) {
       speedX=abs(speedX);
    } if (ballY>heightD-ballWidth/2) { 
        speedY=-abs(speedY);
        return true; 
    } else if (ballY<ballWidth/2) {
        speedY= abs(speedY);
    }
    return false;
  }
}