package javaproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

	@FXML
	public VBox vBox;

	@FXML
	public Pane pane;

	@FXML
	public GridPane gridPane;

	@FXML
	public TextField player1Text;

	@FXML
	public TextField player2Text;

	@FXML
	public Rectangle rectangle1;

	@FXML
	public Rectangle rectangle2;

	@FXML
	public Rectangle rectangle3;

	@FXML
	public Rectangle rectangle4;

	@FXML
	public Rectangle rectangle5;

	@FXML
	public Rectangle rectangle6;

	@FXML
	public Rectangle rectangle7;

	@FXML
	public Rectangle rectangle8;

	@FXML
	public Rectangle rectangle9;

	private static String player1Name;
	private static String player2Name;

	private static int turn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		startGame();

		player1Text.setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.ENTER) {
				player1Name = player1Text.getText();
				player1Text.setEditable(false);
			}
		});

		player2Text.setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.ENTER) {
				player2Name = player2Text.getText();
				player2Text.setEditable(false);
			}
		});

		rectangle1.setOnMouseClicked(event -> {
			if (rectangle1.getFill() == Color.CYAN) {
				if (turn % 2 != 0) rectangle1.setFill(Color.FIREBRICK);
				else rectangle1.setFill(Color.GREEN);
				checkWinner();
			} else
				giveWarning();
		});

		rectangle2.setOnMouseClicked(event -> {
			if (rectangle2.getFill() == Color.CYAN) {
				if (turn % 2 != 0) rectangle2.setFill(Color.FIREBRICK);
				else rectangle2.setFill(Color.GREEN);
				checkWinner();
			} else
				giveWarning();
		});

		rectangle3.setOnMouseClicked(event -> {
			if (rectangle3.getFill() == Color.CYAN) {
				if (turn % 2 != 0) rectangle3.setFill(Color.FIREBRICK);
				else rectangle3.setFill(Color.GREEN);
				checkWinner();
			} else
				giveWarning();
		});

		rectangle4.setOnMouseClicked(event -> {
			if (rectangle4.getFill() == Color.CYAN) {
				if (turn % 2 != 0) rectangle4.setFill(Color.FIREBRICK);
				else rectangle4.setFill(Color.GREEN);
				checkWinner();
			} else
				giveWarning();
		});

		rectangle5.setOnMouseClicked(event -> {
			if (rectangle5.getFill() == Color.CYAN) {
				if (turn % 2 != 0) rectangle5.setFill(Color.FIREBRICK);
				else rectangle5.setFill(Color.GREEN);
				checkWinner();
			} else
				giveWarning();
		});

		rectangle6.setOnMouseClicked(event -> {
			if (rectangle6.getFill() == Color.CYAN) {
				if (turn % 2 != 0) rectangle6.setFill(Color.FIREBRICK);
				else rectangle6.setFill(Color.GREEN);
				checkWinner();
			} else
				giveWarning();
		});

		rectangle7.setOnMouseClicked(event -> {
			if (rectangle7.getFill() == Color.CYAN) {
				if (turn % 2 != 0) rectangle7.setFill(Color.FIREBRICK);
				else rectangle7.setFill(Color.GREEN);
				checkWinner();
			} else
				giveWarning();
		});

		rectangle8.setOnMouseClicked(event -> {
			if (rectangle8.getFill() == Color.CYAN) {
				if (turn % 2 != 0) rectangle8.setFill(Color.FIREBRICK);
				else rectangle8.setFill(Color.GREEN);
				checkWinner();
			} else
				giveWarning();
		});

		rectangle9.setOnMouseClicked(event -> {
			if (rectangle9.getFill() == Color.CYAN) {
				if (turn % 2 != 0) rectangle9.setFill(Color.FIREBRICK);
				else rectangle9.setFill(Color.GREEN);
				checkWinner();
			} else
				giveWarning();
		});
	}

	public void startGame() {
		turn = 1;

		player1Name = player1Text.getText();
		player2Name = player2Text.getText();

		rectangle1.setFill(Color.CYAN);
		rectangle2.setFill(Color.CYAN);
		rectangle3.setFill(Color.CYAN);
		rectangle4.setFill(Color.CYAN);
		rectangle5.setFill(Color.CYAN);
		rectangle6.setFill(Color.CYAN);
		rectangle7.setFill(Color.CYAN);
		rectangle8.setFill(Color.CYAN);
		rectangle9.setFill(Color.CYAN);
	}

	private void checkWinner() {
		if (rectangle1.getFill() == rectangle2.getFill() && rectangle2.getFill() == rectangle3.getFill()
				&& (rectangle1.getFill() != Color.CYAN))
			winner();

		else if (rectangle4.getFill() == rectangle5.getFill() && rectangle5.getFill() == rectangle6.getFill()
				&& (rectangle4.getFill() != Color.CYAN))
			winner();

		else if (rectangle7.getFill() == rectangle8.getFill() && rectangle8.getFill() == rectangle9.getFill()
				&& (rectangle7.getFill() != Color.CYAN))
			winner();

		else if (rectangle1.getFill() == rectangle4.getFill() && rectangle4.getFill() == rectangle7.getFill()
				&& (rectangle1.getFill() != Color.CYAN))
			winner();

		else if (rectangle2.getFill() == rectangle5.getFill() && rectangle5.getFill() == rectangle8.getFill()
				&& (rectangle2.getFill() != Color.CYAN))
			winner();

		else if (rectangle3.getFill() == rectangle6.getFill() && rectangle6.getFill() == rectangle9.getFill()
				&& (rectangle3.getFill() != Color.CYAN))
			winner();

		else if (rectangle1.getFill() == rectangle5.getFill() && rectangle5.getFill() == rectangle9.getFill()
				&& (rectangle1.getFill() != Color.CYAN))
			winner();

		else if (rectangle3.getFill() == rectangle5.getFill() && rectangle5.getFill() == rectangle7.getFill()
				&& (rectangle3.getFill() != Color.CYAN))
			winner();

		else if (rectangle1.getFill() != Color.CYAN && rectangle2.getFill() != Color.CYAN && rectangle3.getFill() != Color.CYAN &&
		 		 rectangle4.getFill() != Color.CYAN && rectangle5.getFill() != Color.CYAN && rectangle6.getFill() != Color.CYAN &&
				 rectangle7.getFill() != Color.CYAN && rectangle8.getFill() != Color.CYAN && rectangle9.getFill() != Color.CYAN)
			gameDraw();

		else turn++;
	}

	private void gameDraw() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("DRAW");
		alert.setHeaderText("Game Draw");
		alert.showAndWait();

		startGame();
	}

	private void winner() {
		if (turn % 2 != 0)
			showWinner(player1Name);
		else showWinner(player2Name);
	}

	private void showWinner(String playerName) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("WINNER");
		alert.setHeaderText("Congratulation");
		alert.setContentText(playerName + " wins");
		alert.showAndWait();

		startGame();
	}

	private void giveWarning() {
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("ERROR");
		alert.setHeaderText("Use other block");
		alert.setContentText("Block is already in use");
		alert.show();
	}
}