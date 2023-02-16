import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.geometry.*;

public class App extends Application{

    @Override
    public void start(Stage primaryStage){

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);

        final int numRows = 10;
        final int numCols = 10;
        int countTextFields = 0;

        TextField[] textField = new TextField[100];

        //Add textFields in the gridPane
        for(int row = 0; row < numRows; ++row)
        {
            for(int col = 0; col < numCols; ++col)
            {
                int num = (int)(Math.random()*2);
                String str = String.valueOf(num);

                textField[countTextFields] = new TextField();
                textField[countTextFields].setText(str);
                pane.add(textField[countTextFields],col,row);

                countTextFields++;
            }
        }

        Scene scene = new Scene(pane,250,260);
        primaryStage.setTitle("DisplayRandomNumbers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

