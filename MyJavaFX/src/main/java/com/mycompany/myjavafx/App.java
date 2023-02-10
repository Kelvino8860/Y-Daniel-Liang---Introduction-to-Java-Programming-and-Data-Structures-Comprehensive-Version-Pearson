

package com.mycompany.myjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class App extends Application{
       @Override
	   public void start(Stage primaryStage){
	          Button btOK = new Button("Kelvino");
			  Scene scene = new Scene(btOK,200,250);
			  primaryStage.setTitle("MyJavaFX");
			  primaryStage.setScene(scene);
			  primaryStage.show();
	   }
	   
	   public static void main(String[] args){
	         Application.launch(args);
	   }
}