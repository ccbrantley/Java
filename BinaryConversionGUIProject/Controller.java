package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
public class Controller implements Initializable {
    ObservableList<String> conversionTypes =
            FXCollections.observableArrayList("Decimal to Binary",
                    "Decimal to Hex","Binary to Decimal","Hex to Decimal");
    @FXML
    ChoiceBox chcConversion;
    @FXML
    Button btnClear;
    @FXML
    Button btnConvert;
    @FXML
    TextField txtConverValue;
    @FXML
    Label lblConverOutput;
    public void initialize(URL location, ResourceBundle resources){
        chcConversion.setItems(conversionTypes);
        chcConversion.setValue("Decimal to Binary");
        btnClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lblConverOutput.setText(". . . .");
                txtConverValue.clear();
            }
        });
        btnConvert.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    if (chcConversion.getValue() == "Decimal to Binary") {
                        lblConverOutput.setText(new StringBuilder((Conversion.dec2Bin(Integer.parseInt(txtConverValue.getText())))).reverse().toString());
                    } else if (chcConversion.getValue() == "Decimal to Hex") {
                        lblConverOutput.setText("0x" + new StringBuilder(Conversion.dec2Hex(Integer.parseInt(txtConverValue.getText()))).reverse().toString());
                    } else if (chcConversion.getValue() == "Binary to Decimal") {
                        lblConverOutput.setText(String.valueOf(Conversion.bin2Dec(txtConverValue.getText())).toString());
                    } else if (chcConversion.getValue() == "Hex to Decimal") {
                        lblConverOutput.setText(String.valueOf(Conversion.hex2Dec(txtConverValue.getText())).toString());
                    }
                }
                catch(Exception e){lblConverOutput.setText("Incorrect input format.");}
            }
        });
    }
}
