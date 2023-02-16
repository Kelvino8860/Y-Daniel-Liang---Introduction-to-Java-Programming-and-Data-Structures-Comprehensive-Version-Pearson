/*(Game: display a checkerboard) Write a program that displays a checkerboard
in which each white and black cell is a Rectangle with a fill color black or
white, as shown in Figure 14.44c. */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.*;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);

        final int numRows = 10;
        final int numCols = 10;
        Rectangle[] rect = new Rectangle[100];
        int height = 20;
        int width = 20;
        Color colorOne = Color.WHITE;
        Color colorTwo = Color.BLUE;
        int countRect = 0;
        Color temp;

        //Draw rectangles and store them in an array
        for (int i = 0; i < 100; ++i) {

                    rect[i] = new Rectangle();
                    rect[i].setHeight(height);
                    rect[i].setWidth(width);
                    rect[i].setStroke(Color.BLACK);

                    //Change the color fills of the rectangles
                    //Using rows
                    if(i%numRows == 0)
                    {
                        temp = colorOne;
                        colorOne = colorTwo;
                        colorTwo = temp;
                    }
                    
                    //Alternate color fills
                    if(i%2 == 0)
                    {
                        rect[i].setFill(colorOne);
                    }
                    else
                    rect[i].setFill(colorTwo);
        }

        //Add rectangles in a gridPane
        for(int row = 0; row < numRows; ++row){
            for(int col = 0; col < numCols; ++col)
            {
                pane.add(rect[countRect],row,col);
                countRect++;
            }
        }

        Scene scene = new Scene(pane,200,220);
        primaryStage.setTitle("CheckerBoard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
