package javaproject;

import javafx.application.Platform;
import javafx.scene.control.*;

public class GameMenuBar {

	public static MenuBar createMenu(Controller controller) {
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

	private static void aboutGame() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("About Game");
		alert.setHeaderText("How to play");
		alert.setContentText("If you get 3 in a row.\nYou wins");
		alert.show();
	}

	private static void quitGame() {
		Platform.exit();
		System.exit(0);
	}
}
