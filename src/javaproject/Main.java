package javaproject;

import javafx.application.Application;
import javafx.application.Platform;
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
		MenuBar menuBar = createMenu(controller);

		vBox.getChildren().add(0, menuBar);

		Scene scene = new Scene(vBox);

		Image icon = new Image(getClass().getResourceAsStream("/images/logo.png"));

		primaryStage.setScene(scene);
		primaryStage.getIcons().add(icon);
		primaryStage.setTitle("Tic Tac Toe");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	private MenuBar createMenu(Controller controller) {
		//File Menu
		Menu fileMenu = new Menu("File");

		MenuItem newMenuItem = new MenuItem("New Game");
		newMenuItem.setOnAction(event -> controller.startGame());

		SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();

		MenuItem quitMenuItem = new MenuItem("Quit Game");
		quitMenuItem.setOnAction(event -> quitGame());

		fileMenu.getItems().addAll(newMenuItem, separatorMenuItem, quitMenuItem);

		//Help Menu
		Menu helpMenu = new Menu("Help");

		MenuItem aboutApp = new MenuItem("About Game");
		aboutApp.setOnAction(event -> aboutGame());

		helpMenu.getItems().addAll(aboutApp);

		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu, helpMenu);

		return menuBar;
	}

	private void aboutGame() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("About Game");
		alert.setHeaderText("How to play");
		alert.setContentText("If you get 3 in a row.\nYou wins");
		alert.show();
	}

	private void quitGame() {
		Platform.exit();
		System.exit(0);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
