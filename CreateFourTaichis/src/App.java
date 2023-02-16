import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class App extends Application {
  @Override
  public void start(Stage primarStage){

      GridPane pane = new GridPane();
      pane.setAlignment(Pos.CENTER);
      pane.setPadding(new Insets(8,8,8,8));
      pane.setHgap(5);
      pane.setVgap(5);

    for(int row = 0; row < 2; ++row)  
    {
        for(int col = 0; col < 2; ++col)
        {
            Group group = new Group();

            Circle circle = new Circle();
            circle.setCenterX(100);
            circle.setCenterY(100);
            circle.setRadius(60);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.WHITE);
      
            Arc arc1 = new Arc(100,100,50,50,0,45);
            arc1.setType(ArcType.ROUND);
            arc1.setStroke(Color.BLACK);
            arc1.setFill(Color.GREEN);
      
            Arc arc2 = new Arc(100,100,50,50,0+90,45);
            arc2.setType(ArcType.ROUND);
            arc2.setStroke(Color.BLACK);
            arc2.setFill(Color.YELLOW);
      
            Arc arc3 = new Arc(100,100,50,50,0+180,45);
            arc3.setType(ArcType.ROUND);
            arc3.setStroke(Color.BLACK);
            arc3.setFill(Color.PINK);
      
            Arc arc4 = new Arc(100,100,50,50,0+270,45);
            arc4.setType(ArcType.ROUND);
            arc4.setStroke(Color.BLACK);
            arc4.setFill(Color.RED);
      
            group.getChildren().addAll(circle,arc1,arc2,arc3,arc4);
            pane.add(group, col, row);
        }
    }
     
      
      Scene scene = new Scene(pane);
      primarStage.setTitle("Create4Taichis");
      primarStage.setScene(scene);
      primarStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
