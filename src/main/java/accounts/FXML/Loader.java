package accounts.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.net.URL;

public class Loader {
    private Pane view;

    public Pane getPane(String fileName){
        try{
            URL fileUrl=MainPane.class.getResource(fileName);
            if(fileUrl==null){
                throw new FileNotFoundException("FXML file not found");
            }
            view =new FXMLLoader().load(fileUrl);
        }catch (Exception e){
            System.out.println("No page found "+fileName);
            e.printStackTrace();
        }
        return view;
    }
}
