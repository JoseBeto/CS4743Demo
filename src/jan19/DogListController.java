package jan19;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DogListController implements Initializable {

	@FXML private ListView<Dog> dogList;
	
	private static Logger logger = LogManager.getLogger(DogListController.class);
	private ObservableList<Dog> dogs;
	
	public DogListController(ObservableList<Dog> dogs) {
		this.dogs = dogs;
	}
	
	@FXML
    void onDogListClicked(ActionEvent event) {
    	try {
    		Dog dog = dogList.getSelectionModel().getSelectedItem();
    		if(dog != null) {
    			//display detailed of clicked dog
    			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("DogDetailView.fxml"));
    			loader.setController(new DogDetailController(dog));
    			GridPane rootPane = loader.load();
    			Scene scene = new Scene(rootPane);
    			Stage stage = new Stage();
    			stage.setScene(scene);
    			stage.setTitle("Detial View for " + dog.getDogName());
    			stage.show();

    			logger.info(dog.getDogName() + " clicked");
    		}
    	}catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	//logger.info("dogList clicked");
    }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.dogList.setItems(dogs);
	}

}
