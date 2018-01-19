package jan19;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DogListLauncher extends Application {

	private ObservableList<Dog> dogs;
	
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("DogListView.fxml"));
		
		loader.setController(new DogListController(dogs));
		
		BorderPane rootPane = loader.load();
		Scene scene = new Scene(rootPane, 600, 400);
		stage.setScene(scene);
		stage.setTitle("Dog List");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() throws Exception {
		super.init();
		
		dogs = FXCollections.observableArrayList();
		dogs.add(new Dog("Ragnar"));
		dogs.add(new Dog("Sweetie"));
	}
}