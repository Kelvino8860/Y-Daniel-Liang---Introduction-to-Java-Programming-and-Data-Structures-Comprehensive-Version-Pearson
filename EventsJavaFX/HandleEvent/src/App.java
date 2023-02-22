import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
  @Override
  public void start(Stage primaryStage){

      //Create a pane and set its properties
      HBox pane = new HBox(10);
      pane.setAlignment(Pos.CENTER);
      Button btOk = new Button("OK");
      OKHandlerClass handler1 = new OKHandlerClass();
      btOk.setOnAction(handler1);
      Button btCancel = new Button("Cancel");
      CancelHandlerClass handler2 = new CancelHandlerClass();
      btCancel.setOnAction(handler2);

      pane.getChildren().addAll(btOk,btCancel);

      Scene scene = new Scene(pane);
      primaryStage.setTitle("EventHandler");
      primaryStage.setScene(scene);
      primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

  class OKHandlerClass implements EventHandler<ActionEvent>{

     @Override
     public void handle(ActionEvent e){
        System.out.println("OK button clicked");
     }
  }

  class CancelHandlerClass implements EventHandler<ActionEvent>{
      @Override
      public void handle(ActionEvent e){
         System.out.println("Cancel button clicked");
      }
  }
}
