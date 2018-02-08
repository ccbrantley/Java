import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import java.util.Random;
public class TicTacToe extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        Image xImage = new Image("/X.jpg");
        Image oImage = new Image("/O.jpg");
        pane.getChildren().add(new ImageView("/X.jpg"));
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                Random rand = new Random();
                int n = rand.nextInt(2) + 1;
                if (n == 2) {
                    pane.add(new ImageView(xImage), i, x);
                } else {
                    pane.add(new ImageView(oImage), i, x);
                }
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
