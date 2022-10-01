package accounts.FXML;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

import java.io.IOException;

public class LoginControl {

    public Parent fxml;
    public AnchorPane anchorPane;
    public TextField fnameField;
    public TextField secNameField;
    public TextField emailAddField;
    public TextField contactField;
    public JFXButton proceedBn;
    public JFXTextField usernameFieldLog;
    public JFXPasswordField passwordField;

    public void logIn(){
        if (usernameFieldLog.getText().isBlank() || passwordField.getText().isBlank()){
           try{
               Parent parent= FXMLLoader.load(getClass().getResource("/Warning.fxml"));
            Stage stage=new Stage();
            stage.setScene(new Scene(parent));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
           } catch (IOException e) {
               e.printStackTrace();
           }
        }

    }
    public void proceed(ActionEvent event){
        if (!(fnameField.getText().isBlank() || secNameField.getText().isBlank() || emailAddField.getText().isBlank() || contactField.getText()
        .isBlank())){
            try {
                fxml = FXMLLoader.load(getClass().getResource("/Proceed.fxml"));
                Scene scene=fxml.getScene();
                JMetro metro=new JMetro(Style.LIGHT);
                metro.setScene(scene);
                anchorPane.getChildren().removeAll();
                anchorPane.getChildren().setAll(fxml);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
           //NullWarning.stop();
            try{
                Parent parent= FXMLLoader.load(getClass().getResource("/Warning.fxml"));
                Stage stage=new Stage();
                stage.setScene(new Scene(parent));
                stage.initStyle(StageStyle.UNDECORATED);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }
