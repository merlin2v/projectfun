/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfun;

import javafx.scene.input.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author tuvenat18
 */
public class ProjectFun extends Application {
public static final String buttonColor = "#0066ff";
public static final String buttonHighlight = "#0000cc";
public static final String buttonHColor = "#00fff0";
public static final String buttonClickedColor = "#ffffff";
public static final String buttonClickedBackground = "#45aee2";

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        //             <Main Menu>
        //             <Buttons>
        Button btn = new Button();
        Button size = new Button();
        Button play = new Button();

        play.setText("Play");
        size.setText("How to play");
        btn.setText("Exit");
        btn.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHighlight + ", 5, 0.5, 0, 0)");
        play.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHighlight + ", 5, 0.5, 0, 0)");
        size.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHighlight + ", 5, 0.5, 0, 0)");
        //

        //             <Images>
        final ImageView backgroundImage = new ImageView();
        final ImageView helpBox = new ImageView();
        Image helpIMG = new Image(new FileInputStream("C:\\Users\\kungeth17\\Documents\\NetBeansProjects\\projectfun\\img\\shooter help.png"));
        Image tree = new Image(new FileInputStream("C:\\Users\\kungeth17\\Documents\\NetBeansProjects\\projectfun\\img\\shooter background.png"));
        helpBox.setImage(helpIMG);
        backgroundImage.setImage(tree);

        //             <Text>
       
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
        
        root.getChildren().addAll(backgroundImage, helpBox);
        root.getChildren().add(btn);
        root.getChildren().add(size);
        root.getChildren().add(play);
        gameScreen.getChildren().add(player);
        Scene scene = new Scene(root, 300, 250);
        Scene game = new Scene(gameScreen, 300, 250);
        
        helpBox.setTranslateX(142);
        helpBox.setTranslateY(180);
        helpBox.setVisible(false);
    

        //             <Window>
        primaryStage.setTitle("Shooting Game");
        primaryStage.setScene(scene);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();
        
        
        
        

        //             <Events>
        
        EventHandler<MouseEvent> buttonMouseOver = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                size.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box," + buttonHColor + ", 5, 0.5, 0, 0)");
            }
        };
        
        EventHandler<MouseEvent> buttonMouseOver2 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btn.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHColor + ", 5, 0.5, 0, 0)");
            }
        };
        
        EventHandler<MouseEvent> buttonMouseOver3 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                play.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHColor + ", 5, 0.5, 0, 0)");
            }
        };
        
        EventHandler<MouseEvent> buttonUnMouseOver = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                size.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHighlight + ", 5, 0.5, 0, 0)");
            }
        };
        
        EventHandler<MouseEvent> buttonUnMouseOver2 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btn.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHighlight + ", 5, 0.5, 0, 0)");
            }
        };
        
        EventHandler<MouseEvent> buttonUnMouseOver3 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                play.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHighlight + ", 5, 0.5, 0, 0)");
            }
        };
       
        EventHandler<MouseEvent> buttonClick = new EventHandler<MouseEvent>() {
          @Override
          public void handle(MouseEvent event) {
              size.setStyle("-fx-background-color: " + buttonClickedBackground + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonClickedColor + ", 5, 0.5, 0, 0)");
          } 
        };
        
        EventHandler<MouseEvent> buttonUnClick = new EventHandler<MouseEvent>() {
          @Override
          public void handle(MouseEvent event) {
              size.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHColor + ", 5, 0.5, 0, 0)");
          } 
        };
        
        EventHandler<MouseEvent> buttonClick2 = new EventHandler<MouseEvent>() {
          @Override
          public void handle(MouseEvent event) {
              btn.setStyle("-fx-background-color: " + buttonClickedBackground + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonClickedColor + ", 5, 0.5, 0, 0)");
          } 
        };
        
        EventHandler<MouseEvent> buttonUnClick2 = new EventHandler<MouseEvent>() {
          @Override
          public void handle(MouseEvent event) {
              btn.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHColor + ", 5, 0.5, 0, 0)");
          } 
        };
        
        EventHandler<MouseEvent> buttonClick3 = new EventHandler<MouseEvent>() {
          @Override
          public void handle(MouseEvent event) {
              play.setStyle("-fx-background-color: " + buttonClickedBackground + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonClickedColor + ", 5, 0.5, 0, 0)");
          } 
        };
        
        EventHandler<MouseEvent> buttonUnClick3 = new EventHandler<MouseEvent>() {
          @Override
          public void handle(MouseEvent event) {
              play.setStyle("-fx-background-color: " + buttonColor + "; -fx-border-width: 3px; -fx-background-radius: 10px; -fx-text-fill: white; -fx-background-insets: 0, 1, 1; -fx-effect: dropshadow(three-pass-box, " + buttonHColor + ", 5, 0.5, 0, 0)");
          } 
        };
        
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
        
        size.setOnMouseEntered(buttonMouseOver);
        size.setOnMouseExited(buttonUnMouseOver);
        btn.setOnMouseEntered(buttonMouseOver2);
        btn.setOnMouseExited(buttonUnMouseOver2);
        play.setOnMouseEntered(buttonMouseOver3);
        play.setOnMouseExited(buttonUnMouseOver3);
        
        size.setOnMousePressed(buttonClick);
        size.setOnMouseReleased(buttonUnClick);
        btn.setOnMousePressed(buttonClick2);
        btn.setOnMouseReleased(buttonUnClick2);
        play.setOnMousePressed(buttonClick3);
        play.setOnMouseReleased(buttonUnClick3);
        
        
        size.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if (helpBox.isVisible()) {
                    helpBox.setVisible(false);
                }
                else if (!helpBox.isVisible()) {
                    helpBox.setVisible(true);
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
    
}
