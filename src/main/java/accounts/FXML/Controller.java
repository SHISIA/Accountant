package accounts.FXML;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Parent fxml;
    public AnchorPane anchorPane;
    public AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition transition=new TranslateTransition(Duration.seconds(1),anchorPane);
        transition.setToX(anchorPane.getLayoutX() * 35);
        transition.play();
        transition.setOnFinished((e)->{
            try {
                fxml= FXMLLoader.load(getClass().getResource("/Login.fxml"));
                anchorPane.getChildren().removeAll();
                anchorPane.getChildren().setAll(fxml);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

    }

    public void signUp(ActionEvent actionEvent){

        TranslateTransition transition=new TranslateTransition(Duration.seconds(1),anchorPane);
        transition.setToX(anchorPane.getLayoutX() * 0.5);
        transition.play();
        transition.setOnFinished((e)->{
            try {
                fxml= FXMLLoader.load(getClass().getResource("/SigningUp.fxml"));
                anchorPane.getChildren().removeAll();
                anchorPane.getChildren().setAll(fxml);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }

    public void signIn(ActionEvent actionEvent){
        TranslateTransition transition=new TranslateTransition(Duration.seconds(1),anchorPane);
        transition.setToX(anchorPane.getLayoutX() * 35);
        transition.play();
        transition.setOnFinished((e)->{
            try {
                fxml= FXMLLoader.load(getClass().getResource("/Login.fxml"));
                anchorPane.getChildren().removeAll();
                anchorPane.getChildren().setAll(fxml);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }

    public AnchorPane pane(){
        return anchorPane;
    }
}
