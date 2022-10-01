package accounts.FXML;

import com.jfoenix.controls.JFXButton;
import eu.hansolo.medusa.Clock;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.time.ZonedDateTime;
import java.util.ResourceBundle;

public class MenuPane implements Initializable {

    public Clock clock;
    public JFXButton btn;

    public  void gear(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if (clock.isVisible()){
            Thread thread=new Thread(()->{
                while (true){
                    clock.setTime(ZonedDateTime.now());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }

            });
            thread.start();
        }
    }
    public void loadPeeps(){
        BorderPane bordePane=(BorderPane) btn.getScene().getRoot();
        Pane pane=new Loader().getPane("/People.fxml");
        bordePane.setCenter(pane);
    }

}
