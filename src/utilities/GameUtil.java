package utilities;

import java.util.List;

import entities.Rect;

public class GameUtil {

	public static void sleep(int timeMillis) {
		try {
			Thread.sleep(timeMillis);
		} catch(InterruptedException e) {
		}
	}
	
	public static void moveRects(List<Rect> rects) {
		for (int i = rects.size() - 1; i >= 1; i--) {
			rects.set(i ,rects.get(i - 1));
		}
	}
	
	public static int random (int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
}
