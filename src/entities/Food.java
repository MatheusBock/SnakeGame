package entities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import constants.Constants;
import utilities.GameUtil;

public class Food extends Rect {
	
	private int eatenTimes;

	public Food(Snake snake, Rectangle drawingArea) {
		setColor(Color.RED);
		setDimension(new Dimension(Constants.FOOD_SIZE, Constants.FOOD_SIZE));
		setRandomLocation(snake, drawingArea);
	}

	public void setRandomLocation(Snake snake, Rectangle drawingArea) {
		int offset = 3;
		
		do {
			int minX = (int)drawingArea.getMinX() + offset;
			int minY = (int)drawingArea.getMinY() + offset;

			int maxX = (int)drawingArea.getMaxX() - Constants.FOOD_SIZE - offset;
			int maxY = (int)drawingArea.getMaxY() - Constants.FOOD_SIZE - offset;

			int randomX = GameUtil.random(minX, maxX);
			int randomY = GameUtil.random(minY, maxY);

			setLocation(new Point(randomX, randomY));
		} while(snake.intersects(this));
	}
	
	public void checkIfEaten(Snake snake, Rectangle drawingArea) {
		if (snake.intersects(this)) {
			eatenTimes++;
			setRandomLocation(snake, drawingArea);
			snake.elongate();
		}
	}
	
	public int getEatenTimes() {
		return eatenTimes;
	}
}
