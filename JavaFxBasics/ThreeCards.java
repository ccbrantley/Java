import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import java.util.Random;
public class ThreeCards extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10,10,10,10));
        Random rand = new Random();
        int numArray[] = new int[3];
        for (int i = 0; i < 3; i++) {
           numArray[i]= rand.nextInt(52) + 1;
        }
        for (int i = 0; i < 3; i++){
            pane.add(new ImageView(String.format("/card/%s.png",numArray[i])), i,0);
        }
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Three Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String [] args){
        Application.launch(args);
    }
}
