 package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

    	try {
    		FXMLLoader loader =new FXMLLoader(getClass().getResource("sample.fxml"));
    		//AnchorPane root = (AnchorPane) loader.load();//
            AnchorPane pane=loader.load();
    		//Scene scene = new Scene(root);
            Scene scene=new Scene(pane);
            scene.getStylesheets().addAll(getClass().getResource("style.css").toExternalForm());
            primaryStage.setTitle("Start a POJO");
            primaryStage.setScene(scene);
            primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

    }

    public static void main(String[] args) {
        launch(args);
    }
}