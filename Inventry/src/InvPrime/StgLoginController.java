package InvPrime;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StgLoginController implements Initializable {

	@FXML
	private AnchorPane pan;

	@FXML
	private Label pan1;

	@FXML
	private Label pan2;

	@FXML
	private Label Close;

	@FXML
	private ComboBox<String> cb1;

	@FXML
	private ImageView img;

	@FXML
	private PasswordField pass;

	private double x = 0;
	private double y = 0;

	private Stage stage;

	@FXML
	void Close_Click(MouseEvent event) {
		System.exit(0);
	}

	@FXML
	void Pressed(MouseEvent event) {
		stage = (Stage) pan.getScene().getWindow();
		x = event.getSceneX();
		y = event.getSceneY();
	}

	@FXML
	void Dragged(MouseEvent event) {
		stage.setX(event.getScreenX() - x);
		stage.setY(event.getScreenY() - y);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Image image = new Image(getClass().getResource("/Res/perrson.png").toString());
		img.setImage(image);
		
		System.out.println(getClass().getResource("/Res/perrson.png").toString());
		
//		Image image1 = new Image("/Res/perrson.png");
//        img = new ImageView(image1);

		cb1.getItems().addAll("Silus", "Satan", "Clerk");

		pan.sceneProperty().addListener((obs, oldScene, newScene) -> {
			if (newScene != null) {
				cb1.requestFocus();
			}
		});

	}

}
