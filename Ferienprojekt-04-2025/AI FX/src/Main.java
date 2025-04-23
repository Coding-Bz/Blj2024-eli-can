import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        // Haupt-Container
        AnchorPane root = new AnchorPane();
        root.setPrefSize(900, 500);
        root.setStyle("-fx-background-color: #e4ddb1;");

        // Register-Panel
        VBox registerBox = new VBox(20);
        registerBox.setAlignment(Pos.CENTER);
        registerBox.setPadding(new Insets(40));
        registerBox.setStyle("-fx-background-color: #d1e3bb; -fx-background-radius: 20;");
        registerBox.setLayoutX(600);
        registerBox.setLayoutY(80);

        Label registerTitle = new Label("REGISTER");
        registerTitle.setFont(new Font(24));
        registerTitle.setTextFill(Color.WHITE);

        VBox inputFields = new VBox(10);

        Label usernameLabel = new Label("USERNAME");
        usernameLabel.setTextFill(Color.WHITE);
        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter Username");
        usernameField.setStyle("-fx-background-color: #8b9a6e; -fx-background-radius: 40; -fx-text-fill: white;");

        Label passwordLabel = new Label("PASSWORD");
        passwordLabel.setTextFill(Color.WHITE);
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");
        passwordField.setStyle("-fx-background-color: #8b9a6e; -fx-background-radius: 40; -fx-text-fill: white;");

        inputFields.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField);
        registerBox.getChildren().addAll(registerTitle, inputFields);

        // Login Button
        Button loginButton = new Button("LOGIN");
        loginButton.setLayoutX(160);
        loginButton.setLayoutY(200);
        loginButton.setStyle("-fx-background-color: #8b9a6e; -fx-text-fill: white; -fx-font-size: 18px; -fx-background-radius: 40; -fx-padding: 10 40;");

        // Alles zusammenfügen
        root.getChildren().addAll(registerBox, loginButton);

        // Szene und Stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login/Register GUI ohne FXML");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
