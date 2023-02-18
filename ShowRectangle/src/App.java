import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage primaryStage){

        Group group = new Group();
        //group.setScaleX(2);
        //group.setScaleY(2);

        Rectangle r1 = new Rectangle(25,10,60,30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        Rectangle r2 = new Rectangle(25,50,60,30);
        Rectangle r3 = new Rectangle(25,90,60,30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);

        group.getChildren().addAll(new Text(10,27,"r1"), r1, new Text(10,67,"r2"), r2,
                 new Text(10,107,"r3"), r3);

        for(int i = 0; i < 4; ++i)
        {
            Rectangle r = new Rectangle(100,50,100,30);
            r.setRotate(i * 360/8);
            r.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            r.setFill(Color.WHITE);
            group.getChildren().add(r);
        }


         Scene scene = new Scene(new BorderPane(group));
         primaryStage.setTitle("ShowRectangle");
         primaryStage.setScene(scene);
         primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
