import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PasswordFieldExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create User Interface elements
        Label accountNameLabel = new Label("Account Name:");
        Label passwordLabel = new Label("Password:");
        TextField accountNameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button submitButton = new Button("Submit");

        // Create layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(accountNameLabel, 0, 0);
        gridPane.add(accountNameField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(submitButton, 1, 2);

        // Create scene and stage
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Password Field Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}