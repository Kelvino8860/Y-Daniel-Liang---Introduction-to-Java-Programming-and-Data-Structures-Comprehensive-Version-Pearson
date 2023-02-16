/*(Display 54 cards) Expand Exercise 14.3 to display all 54 cards (including two
   jokers), nine per row. The image files are jokers and are named 53.png and 54.png. */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
   @Override
   public void start(Stage primaryStage){

      GridPane pane = new GridPane();
      pane.setAlignment(Pos.CENTER);
      pane.setVgap(3);
      pane.setHgap(3);

      final int numRows = 6;
      final int numCols = 9;
      int countImages = 1;
      int displayCount = 0;

      //Create an image array to store all the 54 images
      Image[] image = new Image[54];
      //Use a loop to add all the images in the array
      for(int i = 0; i < image.length; ++i)
      {
        String str = String.valueOf(countImages);
        image[i] = new Image("card/" +str +".png");
        countImages++;
      }

      for(int row = 0; row < numRows; ++row)
      {
        for(int col = 0; col < numCols; ++col)
        {
             ImageView imageView = new ImageView(image[displayCount]);
             pane.add(imageView,col,row);
             displayCount++;
        }
      }

      Scene scene = new Scene(pane);
      primaryStage.setTitle("DisplayImages");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args) {
    launch(args);
   }
}
