package application.controller;

import java.io.IOException;
import java.net.URL;

import application.CommonObjs;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

/**
 * This class is for controlling the main page of the DevMate application.
 */
public class MainController {
	
	@FXML HBox mainBox;
	
	/**
	 * Load the home page when the application starts.
	 */
	@FXML
	public void initialize() {
		// Home page fxml file
		URL url = getClass().getClassLoader().getResource("view/HomePage.fxml");
		
		// Load the home page into the mainBox
		try {
			AnchorPane pane1 = (AnchorPane)FXMLLoader.load(url); // convert to anchor pane
					
			// remove child 1 if it exists
			if (mainBox.getChildren().size() > 1) { // both child 0 and 1 exist
				mainBox.getChildren().remove(1);
			}
					
			// add home page to the mainBox, gets added as child 1
			mainBox.getChildren().add(pane1);
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * When the New Project button is clicked, the fxml file will be inserted into the main page.
	 */
	@FXML public void showNewProjectPageOp() {
		
		// New Project page fxml file
		URL url = getClass().getClassLoader().getResource("view/NewProjectPage.fxml");
		
		// Load the New Project page into the mainBox
		try {
			AnchorPane pane2 = (AnchorPane)FXMLLoader.load(url);
			
			// remove child 1 if exists
			if (mainBox.getChildren().size() > 1) { // both child 0 and 1 exist
				mainBox.getChildren().remove(1);
			}
			
			// add new project pane to the mainBox as child 1
			mainBox.getChildren().add(pane2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML public void showViewData() {

		// New Project page fxml file
		URL url = getClass().getClassLoader().getResource("view/ViewData.fxml");
		
		// Load the New Project page into the mainBox
		try {
			AnchorPane pane2 = (AnchorPane)FXMLLoader.load(url);
			
			// remove child 1 if exists
			if (mainBox.getChildren().size() > 1) { // both child 0 and 1 exist
				mainBox.getChildren().remove(1);
			}
			
			// add new project pane to the mainBox as child 1
			mainBox.getChildren().add(pane2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private CommonObjs commonObjs = CommonObjs.getInstance();

	/**
	 * When user clicks 'Back to Home page', application navigates to the Home page.
	 */
	@FXML public void goToHome() {
		// home page url
		URL url = getClass().getClassLoader().getResource("view/HomePage.fxml");
		
		try { // load home page into mainBox
			AnchorPane pane1 = (AnchorPane)FXMLLoader.load(url); // convert to anchor pane
				
			// reference of mainBox
			HBox mainBox = commonObjs.getMainBox();
				
			// remove child 1 if it exists
			if (mainBox.getChildren().size() > 1) { // both child 0 and 1 exist
				mainBox.getChildren().remove(1);
			}
				
			// add Home page to the mainBox as child 1
			mainBox.getChildren().add(pane1);
				
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}
