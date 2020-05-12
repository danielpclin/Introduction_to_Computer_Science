/*
 * Assignment 6
 * Course: CE1002
 * Name: 林柏臣
 * Student ID: 106501565
 */
package ce1002.a6.s106501565;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class A6_106501565 extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));

        Scene scene = new Scene(root, 600 ,400);

        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }
}
