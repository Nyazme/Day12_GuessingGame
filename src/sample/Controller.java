package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Random;
import java.util.Scanner;

public class Controller {

    @FXML
    private Text guessGameText;

    @FXML

    private Text questionText;

    @FXML
    private Button submitButton;

    @FXML
    private TextField userInput;

    @FXML
    private Text responseText;


    Scanner sc = new Scanner(System.in);
    Random generator = new Random();

    int MIN = 1;
    int MAX = 5;
    int answer, guess;
    int numberOfGuesses = 0;
    int guesses;
    String another;
    boolean flag;
    boolean anotherFlag = true;


    public void clickedTheButton(ActionEvent actionEvent) {
        answer = generator.nextInt(MAX) + 1;
        String userEntry = userInput.getText();
        int userInput = Integer.parseInt(userEntry);
        guess = userInput;

        //questionText.setText("I'm thinking of a number");

        if (guess == answer) {
            responseText.setText("That's correct, Great Job!!!");
        } else if (guess > answer) {
            responseText.setText("Too High, Guess again");
        } else if (guess < answer) {
            responseText.setText("Too Low, Guess again");
        }

    }

}









