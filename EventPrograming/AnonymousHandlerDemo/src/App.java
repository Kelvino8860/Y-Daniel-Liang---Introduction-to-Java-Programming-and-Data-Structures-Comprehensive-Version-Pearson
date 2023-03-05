import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage){
          Text text = new Text(40,40,"Programming is fun");
          Pane pane = new Pane(text);

          //Hold four buttons in an HBox
          Button btUp = new Button("Up");
          Button btDown = new Button("Down");
          Button btLeft = new Button("Left");
          Button btRight = new Button("Right");
          HBox hBox = new HBox(btUp,btDown,btLeft,btRight);
          hBox.setSpacing(10);
          hBox.setAlignment(Pos.CENTER);

          BorderPane borderPane = new BorderPane(pane);
          borderPane.setBottom(hBox);

          //Create and register the handler
          btUp.setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent e){
                  text.setY(text.getY() > 10 ? text.getY() - 5 : 10);
              }
          });

          btDown.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e){
                    text.setY(text.getY() < pane.getHeight() ?
                     text.getY() + 5 : pane.getHeight());
                }
          });

          btLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                text.setX(text.getX() > 0 ? text.getX() - 5 : 0);
            }
          });

          btRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                text.setX(text.getX() < pane.getWidth() -130 ?
                  text.getX() + 5 : pane.getWidth() - 130);
            }
          });

          //Create a scene and place it in the stage
          Scene scene = new Scene(borderPane,400,350);
          primaryStage.setTitle("AnonymouseHandlerDemo");
          primaryStage.setScene(scene);
          primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
