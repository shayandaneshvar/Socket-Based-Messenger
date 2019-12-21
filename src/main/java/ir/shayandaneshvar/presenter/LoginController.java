package ir.shayandaneshvar.presenter;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import ir.shayandaneshvar.model.Client;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private JFXTextField name;

    @FXML
    private JFXTextField ip;

    @FXML
    private JFXTextField port;

    @FXML
    private AnchorPane root;

    @FXML
    private ImageView closeButton;

    @FXML
    private JFXButton submit;

    @FXML
    void closeProgram(MouseEvent event) {
        Toolkit.getDefaultToolkit().beep();
        root.getScene().getWindow().hide();
    }

    @FXML
    void tryConnect(MouseEvent event) {
        // TODO: 12/21/2019
        // FIXME: 12/22/2019
        Client client = new Client(name.getText(), ip.getText(),
                Integer.parseInt(port.getText()));

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        root.setOnMouseDragged(event -> {
            root.getScene().getWindow().setX(event.getScreenX());
            root.getScene().getWindow().setY(event.getScreenY());
        });
    }
}
