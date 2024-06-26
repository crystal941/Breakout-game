import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;

	// Constructor
	public Ball() {
		// TODO: Set width to Settings.BALL_WIDTH
		setWidth(Settings.BALL_WIDTH);
		// TODO: Set width to Settings.BALL_HEIGHT
		setHeight(Settings.BALL_HEIGHT);
		// TODO: Call resetPosition
		resetPosition();
	}

	/**
	 * Resets the ball to the initial position Uses Settings.INITIAL_BALL_X/Y to set
	 * the position of the ball
	 */
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);
		// TODO: Set the balls y by using the INITIAL_BALL_Y (see above)
		setY(Settings.INITIAL_BALL_Y);
	}

	public void update() {
		x += xVelocity;
		// TODO: Increase the y variable by yVelocity (see above)
		y += yVelocity;

		// Bounce off left side of screen
		if (x <= 0) {
			// TODO: Set x to 0 so it does not leave the screen
			setX(0);
			// TODO: Change the x velocity to make the ball go right
			setXVelocity(-getXVelocity());
		}

		// Bounce off right side of screen
		if (x >= Settings.WINDOW_WIDTH - (Settings.BALL_WIDTH + 14)) {
			// TODO: Set x to the right edge of the screen (see the above if condition)
			// set X to let the ball not to leave right side of the screen
			setX(Settings.WINDOW_WIDTH - (Settings.BALL_WIDTH + 14));
			// TODO: Change the x velocity to make the ball go left
			setXVelocity(-getXVelocity());
		}

		// Bounce off top of screen
		if (y <= 0) {
			// TODO: Set y to 0 so it does not leave the screen
			setY(0);
			// TODO: Change the y velocity to make the ball go downward
			setYVelocity(-getYVelocity());
		}
	}

	public void setXVelocity(int x) {
		// TODO: Set the x velocity
		this.xVelocity = x;
	}

	public void setYVelocity(int y) {
		// TODO: Set the y velocity
		this.yVelocity = y;
	}

	public int getXVelocity() {
		return xVelocity; // TODO: Return the x velocity
	}

	public int getYVelocity() {
		return yVelocity; // TODO: Return the y velocity
	}

	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
