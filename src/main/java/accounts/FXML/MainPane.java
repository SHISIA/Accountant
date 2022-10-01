package accounts.FXML;

import eu.hansolo.medusa.Clock;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.net.URL;
//import java.time.Clock;
import java.util.ResourceBundle;

public class MainPane implements Initializable {

    public Clock clock;

    public BorderPane bordePane;
    public Label menuTwo;
    public Label menuOne;
    public Parent fxm;
    public Rectangle hoverOne;
    public Rectangle hoverTwo;
    public Rectangle hoverThree;
    public Rectangle hoverFinal;

    public void setHoverAll() {
        hoverOne.setVisible(false);
        hoverTwo.setVisible(false);
        hoverThree.setVisible(false);
        hoverFinal.setVisible(false);
    }

        public void setHoverOne() {
        hoverOne.setVisible(true);
        hoverTwo.setVisible(false);
        hoverThree.setVisible(false);
        hoverFinal.setVisible(false);
    }
    public void setHoverTwo() {
        hoverTwo.setVisible(true);
        hoverOne.setVisible(false);
        hoverThree.setVisible(false);
        hoverFinal.setVisible(false);
    }
    public void setHoverThree() {
        hoverThree.setVisible(true);
        hoverOne.setVisible(false);
        hoverTwo.setVisible(false);
        hoverFinal.setVisible(false);
    }
    public void setHoverFinal() {
        hoverFinal.setVisible(true);
        hoverOne.setVisible(false);
        hoverTwo.setVisible(false);
        hoverThree.setVisible(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Pane pane=new Loader().getPane("/Dashboard.fxml");
            bordePane.setCenter(pane);

        Pane pane1=new Loader().getPane("/MenuPane.fxml");
        bordePane.setLeft(pane1);


    }
    public void loadDash(){
        Pane pane=new Loader().getPane("/Dashboard.fxml");
        bordePane.setCenter(pane);
    }


}
