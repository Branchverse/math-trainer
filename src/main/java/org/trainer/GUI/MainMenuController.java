package org.trainer.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class MainMenuController extends Controller {

    @FXML
    private VBox root;

    @FXML
    private void openAbout(ActionEvent actionEvent) {
        changeScene(ABOUT_FXML, root);
    }

    @FXML
    private void startGame(ActionEvent actionEvent) {
        changeScene(GAME_FXML, root);
    }

}