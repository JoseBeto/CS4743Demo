package jan19;

import java.net.URL;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DogDetailController implements Initializable {

	private static Logger logger = LogManager.getLogger(DogDetailController.class);
	@FXML private TextField dogName;
    @FXML private Button saveDog;
    
    private Dog dog;
    
    public DogDetailController() {
    	
    }
    
    public DogDetailController(Dog dog) {
    	this();
    	
    	this.dog = dog;
    }
    
    @FXML
    void onSaveDogClick(ActionEvent event) {
    	//dog.setDogName(dogName.getText());
    	logger.info("Model's name is " + dog.getDogName());
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//dogName.setText(dog.getDogName());
		dogName.textProperty().bindBidirectional(dog.dogNameProperty());
	}

}
