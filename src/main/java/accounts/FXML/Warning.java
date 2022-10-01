package accounts.FXML;

import com.jfoenix.controls.JFXButton;
import javafx.stage.Stage;

public class Warning {
    public JFXButton rectifyBtn;

    public void close(){
        Stage stage=(Stage) rectifyBtn.getScene().getWindow();
        stage.close();
    }
}
