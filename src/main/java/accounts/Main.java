package accounts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader root =new  FXMLLoader(Main.class.getResource("/_FXMLS/MainPane.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setMaximized(false);
        Scene scene=new Scene(root.load());
        primaryStage.setScene(scene);
        //primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
