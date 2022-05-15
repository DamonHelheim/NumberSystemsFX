package SofjaApp;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class SofjaAppMain extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Sofja.fxml"));
		
		Scene scene = new Scene(root, 1050, 664);
		
		scene.getStylesheets().add("/fxml/style/SofjaMain.css");
		
		primaryStage.setScene(scene);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
