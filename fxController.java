package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class Controller {
    //@FXML private Button btn1;
    @FXML
    private Label name;
    @FXML
    private Label old;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private TextArea txt1;
    @FXML
    private TextArea txt2;

    @FXML
    protected void imprimir (ActionEvent evento) {
        String name=txt1.getText();
        lbl4.setText(name);
        String valor = txt2.getText();
        int old = Integer.parseInt(valor);

        if (old >= 18) {
            lbl3.setText("Puede Votar");
        }
        else if (old< 18){
            lbl3.setText("No Puede Votar");
        }



    }
}