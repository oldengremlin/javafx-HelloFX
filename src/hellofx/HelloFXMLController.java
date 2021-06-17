/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author olden
 */
public class HelloFXMLController implements Initializable {

    @FXML
    private Label theLabel;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void handleClickMeButton(ActionEvent event) {
        theLabel.setText(
                "Hello, JavaFX "
                + System.getProperty("javafx.version")
                + "\nRunning on Java "
                + System.getProperty("java.version")
                + "."
        );
    }

}
