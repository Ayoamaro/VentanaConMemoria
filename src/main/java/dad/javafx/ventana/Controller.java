package dad.javafx.ventana;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
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
		colores.redProperty().bindBidirectional(redSlider.valueProperty());
		colores.greenProperty().bindBidirectional(greenSlider.valueProperty());
		colores.blueProperty().bindBidirectional(blueSlider.valueProperty());
		
		colores.redProperty().addListener(e -> onRedPropertyChange(e));
		colores.greenProperty().addListener(e -> onGreenPropertyChange(e));
		colores.blueProperty().addListener(e -> onBluePropertyChange(e));
	}
	
	private void onRedPropertyChange(Observable e) {
		background = Color.rgb(colores.redProperty().intValue(), colores.greenProperty().intValue(), colores.blueProperty().intValue());
		view.setBackground(new Background(new BackgroundFill(background, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	private void onGreenPropertyChange(Observable e) {
		background = Color.rgb(colores.redProperty().intValue(), colores.greenProperty().intValue(), colores.blueProperty().intValue());
		view.setBackground(new Background(new BackgroundFill(background, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	private void onBluePropertyChange(Observable e) {
		background = Color.rgb(colores.redProperty().intValue(), colores.greenProperty().intValue(), colores.blueProperty().intValue());
		view.setBackground(new Background(new BackgroundFill(background, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public GridPane getView() {
		return this.view;
	}
}
