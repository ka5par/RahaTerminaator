import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.text.html.ImageView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by OveLiis on 26/04/2016.
 */
public class showstageLoosiaken {
public static void showStage(){
    try {

        Stage newStage = new Stage();
        AnchorPane page = (AnchorPane) FXMLLoader.load(Peaklass.class.getResource("loosiaken.fxml"));
        Scene scene = new Scene(page);
        newStage.setScene(scene);
        newStage.setTitle("Mängupõrgu");
        newStage.initStyle(StageStyle.UNDECORATED);
        newStage.show();
    } catch (Exception ex) {
        Logger.getLogger(Peaklass.class.getName()).log(Level.SEVERE, null, ex);
    }
}}