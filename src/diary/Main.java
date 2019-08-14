package diary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    static Stage window;


    @Override
    public void start(Stage primaryStage) throws Exception{

        window=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("diaryCover.fxml"));
        window.setTitle("Diary v1.0");

        window.setResizable(false);
        window.setScene(new Scene(root, 800, 502));
        window.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
