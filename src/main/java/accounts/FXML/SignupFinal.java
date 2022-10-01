package accounts.FXML;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SignupFinal {

    public Parent fxml;
    public AnchorPane anchorPane;
    public TextField nickName;
    public TextField profilePic;

    public void complete(ActionEvent event){
        if (nickName.getText().isBlank() || profilePic.getText().isBlank()){
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
              fxml = FXMLLoader.load(getClass().getResource("/_FXMLS/Final.fxml"));
              ;
              anchorPane.getChildren().removeAll();
              anchorPane.getChildren().setAll(fxml);
          } catch (IOException e) {
              e.printStackTrace();
          }
        }
    }
}
