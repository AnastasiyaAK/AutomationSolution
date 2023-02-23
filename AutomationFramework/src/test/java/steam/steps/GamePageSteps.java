package steam.steps;

import io.qameta.allure.Step;
import steam.models.GameInfo;
import steam.pages.GamePage;

import java.util.ArrayList;
import java.util.logging.Logger;

public class GamePageSteps {
    public static final Logger logger = Logger.getLogger(MainPageSteps.class.getName());

    @Step("gat game info from game page")
    public GameInfo getGameInfoFromGamePage() {
        GamePage gamePage = new GamePage();
        logger.info("Observe game’s info on opened page");
        ArrayList<String> listOfTags = new ArrayList<>(gamePage.getTextFromListOfTagsOfGame());
        GameInfo gameInfo = new GameInfo(gamePage.getTextFromNameOfGame(), gamePage.getTextFromReviewsStatusOfGame(), gamePage.getTextFromPriceOfGame(), listOfTags);

        return gameInfo;
    }

}
