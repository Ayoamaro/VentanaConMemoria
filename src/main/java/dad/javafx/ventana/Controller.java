package dad.javafx.ventana;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

/**
 * @author Ayoze Amaro
 *
 */
public class Controller implements Initializable {

	private Model colores = new Model();
	Color background;
	
	@FXML
	private GridPane view;
	
	@FXML
	private Slider redSlider, greenSlider, blueSlider;
	
	public Controller() throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		
		redSlider.valueProperty().bindBidirectional(colores.redProperty());
		blueSlider.valueProperty().bindBidirectional(colores.blueProperty());
		greenSlider.valueProperty().bindBidirectional(colores.greenProperty());

		colores.colorProperty().addListener((o, ov, nv) -> {
			view.setStyle("-fx-background-color: rgb(" + nv.getRed() * 256 + "," + nv.getGreen() * 256 + ", "
					+ nv.getBlue() * 256 + ");");
		});
	}
	
	public GridPane getView() {
		return this.view;
	}
	
	public Model getModel() {
		return colores;
	}
}
