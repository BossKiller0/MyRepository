package InvPrime;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;


public class InvMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Common.App_Path =System.getProperty("user.dir");
			SqliteConnection.Connect();
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("StgLogin.fxml")));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setFill(Color.TRANSPARENT);
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
