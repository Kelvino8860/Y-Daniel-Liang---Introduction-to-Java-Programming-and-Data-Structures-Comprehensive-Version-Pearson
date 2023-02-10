/*(Tic-tac-toe board) Write a program that displays a tic-tac-toe board, as
shown in Figure 14.43b. A cell may be X, O, or empty. What to display
at each cell is randomly decided. The X and O are the image files x.gif
and o.gif. */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class App extends Application{
    @Override
    public void start(Stage primaryStage){

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5,5,5,5));
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        Image image1 = new Image("images/x.gif");
        Image image2 = new Image("images/o.gif");

        pane.add(new ImageView(image2),0,0);
        pane.add(new ImageView(image1),1,0);
        pane.add(new ImageView(image2),2,0);
        pane.add(new ImageView(image1),0,1);
        pane.add(new ImageView(image1),2,1);
        pane.add(new ImageView(image1),0,2);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Tic-Tac-Toe-Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}