import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class App extends Application{
    @Override
    public void start(Stage primaryStage){

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5,5,5,5));
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        Image image1 = new Image("images/uk.gif");
        Image image2 = new Image("images/ca.gif");
        Image image3 = new Image("images/china.gif");
        Image image4 = new Image("images/us.gif");

        pane.add(new ImageView(image1),0,0);
        pane.add(new ImageView(image2),1,0);
        pane.add(new ImageView(image3),0,1);
        pane.add(new ImageView(image4),1,1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("DisplayFlags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
