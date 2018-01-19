package jan19;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DogDetailLauncher extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("DogDetailView.fxml"));
		
		loader.setController(new DogDetailController(new Dog("Ragnar")));
		
		GridPane rootPane = loader.load();
		Scene scene = new Scene(rootPane, 400, 200);
		stage.setScene(scene);
		stage.setTitle("Dog Detail");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
