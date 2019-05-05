package javaproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("gameGUI.fxml"));
		VBox vBox = loader.load();

		Controller controller = loader.getController();
		MenuBar menuBar = GameMenuBar.createMenu(controller);

		vBox.getChildren().add(0, menuBar);

		Scene scene = new Scene(vBox);

		Image icon = new Image(getClass().getResourceAsStream("/images/logo.png"));

		primaryStage.setScene(scene);
		primaryStage.getIcons().add(icon);
		primaryStage.setTitle("Tic Tac Toe");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
