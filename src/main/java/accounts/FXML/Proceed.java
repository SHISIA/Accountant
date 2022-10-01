package accounts.FXML;

import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Proceed {

    public Parent fxml;
    public AnchorPane anchorPane;
    public JFXRadioButton showPassCheck;
    public TextField privilege;
    public TextField passField;
    public TextField usernameField;
    public PasswordField confirmPassField;

    public void complete(ActionEvent event) {
        if (usernameField.getText().isBlank() ||passField.getText().isBlank()|| confirmPassField.getText().isBlank()|| privilege.getText().isBlank()){
            try{
                Parent parent= FXMLLoader.load(getClass().getResource("/_FXMLS/Warning.fxml"));
                Stage stage=new Stage();
                stage.setScene(new Scene(parent));
                stage.initStyle(StageStyle.UNDECORATED);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {
            try {
                fxml = FXMLLoader.load(getClass().getResource("/_FXMLS/SignupFinal.fxml"));
                anchorPane.getChildren().removeAll();
                anchorPane.getChildren().setAll(fxml);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        try {
//            fxml= FXMLLoader.load(getClass().getResource("/accounts/FXML/signupFinal.fxml"));;
//            anchorPane.getChildren().removeAll();
//            anchorPane.getChildren().setAll(fxml);
//        } catch (IOException e) {
//            e.printStackTrace();
        }
    }
