package utilities;

import constants.Constants;
import entities.Text;

public class GameOverText extends Text {

	public GameOverText(int score) {
		super(Constants.GAME_OVER_COLOR, Constants.GAME_OVER_TEXT, Constants.GAME_OVER_LOCATION);
		
	}

}
