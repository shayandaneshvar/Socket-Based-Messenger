package ir.shayandaneshvar.presenter;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextArea showArea;

    @FXML
    private JFXButton sendButton;

    @FXML
    private JFXButton exitButton;

    @FXML
    private JFXTextArea typingField;

    @FXML
    void exit(MouseEvent event) {
        root.getScene().getWindow().hide();
        // TODO: 12/24/2019  
        System.exit(0);
    }

    @FXML
    void handleKeyPressed(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            send();
        }
    }

    private void send() {
        // TODO: 12/24/2019  
    }

    @FXML
    void handleSend(MouseEvent event) {
        send();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: 12/22/2019  
    }
}
