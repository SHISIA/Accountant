package accounts.images;

import eu.hansolo.medusa.Gauge;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class SPEED implements Initializable {

    public AnchorPane gauge;
    public Gauge speed;

    public void accelerate(ActionEvent evt){
        Double check=speed.getCurrentValue();
        speed.setValue(check+10);
        if (speed.getCurrentValue()>=150){
            speed.setLedBlinking(true);
            speed.setLedColor(Color.RED);
            speed.setLedVisible(true);
        }else {
            speed.setLedVisible(false);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        speed.setValue(10);
        speed.setMaxValue(200);

    }
}
