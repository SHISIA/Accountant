package accounts.FXML;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class NullWarning {

    public static void stop(){
        Stage primaryStsge=new Stage();
        Button ok=new Button("Got It");
        ok.setTooltip(new Tooltip("Closes Prompt"));
        Label label=new Label("Kindly , No empty Values allowed.");
        Label labelOne=new Label(" If Must be empty, replace with zero.");
        label.applyCss();
        label.wrapTextProperty();
        VBox vBox=new VBox(label,labelOne,ok);
        vBox.setSpacing(20);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(50,50,50,50));
        GridPane gridPane=new GridPane();
        gridPane.add(vBox,50,50);
        gridPane.setPadding(new Insets(10,10,10,10));
        Scene scene=new Scene(gridPane,400,350);
        gridPane.setAlignment(Pos.CENTER);
        primaryStsge.initStyle(StageStyle.TRANSPARENT);
        primaryStsge.initModality(Modality.APPLICATION_MODAL);
        gridPane.getStylesheets().add("css/null.css");
        primaryStsge.setScene(scene);
        Stage finalPrimaryStsge = primaryStsge;
        ok.setOnAction(e-> {
            finalPrimaryStsge.close();
        });

        primaryStsge.showAndWait();
    }
}
