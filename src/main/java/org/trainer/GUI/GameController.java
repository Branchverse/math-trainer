package org.trainer.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import org.trainer.Exercise.Arithmetic;
import org.trainer.Exercise.Factory;
import org.trainer.Statistics.Statistics;
import org.trainer.exceptions.IllegalFactoryArgument;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController extends Controller implements Initializable {

    @FXML
    private GridPane root;
    @FXML
    private Label taskLabel;
    @FXML
    private TextField answerField;
    @FXML
    private Label gameModeratorAnswer;

    private final Factory f1 = new Factory();
    private final Statistics statCollector = new Statistics();
    private Arithmetic taskType;
    private String randomType;
    private int[] task;

    @FXML
    private void stopGame(ActionEvent actionEvent) {
        changeScene(MAIN_MENU_FXML, root);
    }

    private void typeLoader() {
        try {
            randomType = f1.getRandomType(true, true, true, true, true, true, true);
            taskType = f1.getArithmetic(randomType, "beginner");

        } catch (IllegalFactoryArgument e1) {
            e1.printStackTrace();
        }
    }

    private void displayTask() {
        typeLoader();
        task = taskType.getTask();
        taskLabel.setText(taskType.getRenderedTask(task));
    }

    @FXML
    private void enterAnswer(ActionEvent actionEvent) {

        if (answerField.getText().matches("\\d+")) {
            int numericInput = Integer.parseInt(answerField.getText());

            if (taskType.checkSolution(task, numericInput)) {
                gameModeratorAnswer.setText(numericInput + " is correct");
            } else {
                gameModeratorAnswer.setText(numericInput + " is NOT correct. Correct answer " + taskType.getSolution(task));
            }

            statCollector.collector(randomType, taskType.checkSolution(task, numericInput));
            statCollector.statSaver();
            typeLoader();
            displayTask();
            answerField.clear();
        } else {
            gameModeratorAnswer.setText("Enter a number into the input field");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayTask();
    }
}