/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.stage.Stage;

/**
 *
 * @author tuvenat18
 */
public class ProjectFun extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        //             <Main Menu>
        //             <Buttons>
        Button btn = new Button();
        Button size = new Button();
        Button play = new Button();

        play.setText("Play");
        size.setText("Set the Size");
        btn.setText("Exit");
        btn.setStyle("-fx-background-color: #0066ff; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, #0000cc, 5, 0.5, 0, 0)");
        play.setStyle("-fx-background-color: #0066ff; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, #0000cc, 5, 0.5, 0, 0)");
        size.setStyle("-fx-background-color: #0066ff; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, #0000cc, 5, 0.5, 0, 0)");
        

        //             <Images>
        final ImageView backgroundImage = new ImageView();
        Image tree = new Image(new FileInputStream("C:\\Users\\kungeth17\\Desktop\\tree.jpg"));
        backgroundImage.setImage(tree);

        //             <StackPanes>
        StackPane root = new StackPane();
        StackPane gameScreen = new StackPane();

        //             <Initialization>
        
        //             <Game Screen>
        Circle player = new Circle(100, 200, 50);
        player.setFill(Color.BLACK);
        player.setCenterX(150);
        player.setCenterY(150);
        player.setVisible(true);

        //             <Button Position>
        btn.setTranslateY(100);
        size.setTranslateY(50);

        //             <Adding Elements>
        //root.getChildren().addAll(backgroundImage);
        root.getChildren().add(btn);
        root.getChildren().add(size);
        root.getChildren().add(play);
        gameScreen.getChildren().add(player);
        Scene scene = new Scene(root, 300, 250);
        Scene idk = new Scene(new Group(), 300, 250);
        idk.getStylesheets().add("path/stylesheet.css");
        Scene game = new Scene(gameScreen, 300, 250);
        
    

        //             <Window>
        primaryStage.setTitle("Shooting Game");
        primaryStage.setScene(scene);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();
        
        
        
        

        //             <Events>
        play.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                primaryStage.setScene(game);
            }
        });

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        size.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if (primaryStage.getHeight() == 700) {
                    primaryStage.setHeight(500);
                } else {
                    primaryStage.setHeight(700);
                }
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static void createGS(StackPane g) {

    }

}
