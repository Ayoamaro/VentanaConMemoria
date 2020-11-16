package dad.javafx.ventana;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;

/**
 * @author Ayoze Amaro
 *
 */
public class Controller implements Initializable {

	@FXML
	private GridPane view;
	
	@FXML
	private Slider redSlider, greenSlider, blueSlider;
	
	public Controller() throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public void initialize(URL location, ResourceBundle resources) { }
	
	public GridPane getView() {
		return this.view;
	}
}
