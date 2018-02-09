import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
public class ColorFont extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        pane.setPadding(new Insets(5,5,5,5));
        Text t1 = new Text(0,50,"Java");
        Text t2 = new Text(50,50,"Java");
        Text t3 = new Text(100,50,"Java");
        Text t4 = new Text(150,50,"Java");
        Text t5 = new Text(200,50,"Java");
        t1.setRotate(90);
        t2.setRotate(90);
        t3.setRotate(90);
        t4.setRotate(90);
        t5.setRotate(90);
        t1.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        t2.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        t3.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        t4.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        t5.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        t1.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        t2.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        t3.setFont(Font.font("Times ROman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        t4.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        t5.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        t1.setOpacity(Math.random());
        t2.setOpacity(Math.random());
        t3.setOpacity(Math.random());
        t4.setOpacity(Math.random());
        t5.setOpacity(Math.random());
        pane.getChildren().add(t1);
        pane.getChildren().add(t2);
        pane.getChildren().add(t3);
        pane.getChildren().add(t4);
        pane.getChildren().add(t5);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Color Font Tut");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String [] args){
        Application.launch(args);
    }
}
