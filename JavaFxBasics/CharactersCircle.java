import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Forever extends Application {
    @Override
    public void start (Stage primaryStage){
        Pane pane = new Pane();
        pane.setPadding(new Insets(5,5,5,5));
        String temp = "Welcome to Java";
        int angle = 0;
        int rotate = 90;
        for (int i = 0; i < temp.length(); i++, angle += 24, rotate +=24) {
            double x = (100 + 200 * Math.cos(Math.toRadians(angle))) + 300;
            double y = (100 + 200 * Math.sin(Math.toRadians(angle))) + 300;
            Text t1 = new Text(x,y,String.valueOf(temp.charAt(i)));
            t1.setFill(Color.color(Math.random(),Math.random(),Math.random()));
            t1.setFont(Font.font("Courier",FontWeight.BOLD, 44));
            t1.setRotate(rotate);
            pane.getChildren().add(t1);
        }
        Scene scene = new Scene(pane, 800, 800);
        primaryStage.setTitle("Rotate Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String [] args){
        Application.launch(args);
    }
}
