/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Danny
 */
public class GuiMain extends Application {

    private Client c;

    @Override
    public void start(Stage primaryStage) {
        c = new Client();
   //          ConnectWindow CW = new ConnectWindow(primaryStage,this.c);
//GameWindow CW = new GameWindow(primaryStage,this.c);
        //          WelcomeWindow CW = new WelcomeWindow(primaryStage,this.c);
     //    CalcWindow CW = new CalcWindow(primaryStage,this.c);
     //   RegisterWindow CW = new RegisterWindow(primaryStage,this.c);
        //      LoginWindow CW = new LoginWindow(primaryStage,this.c);
//        RecoverPassWindow CW = new RecoverPassWindow(primaryStage,this.c);
 //       Recover CW = new Recover(primaryStage,this.c);
 //       MainWindow CW = new MainWindow(primaryStage, this.c);
        //ChangePassWindow CW = new ChangePassWindow(primaryStage, this.c);
//        Scene connectScene = new Scene(CW, 600, 300);
//        primaryStage.setScene(connectScene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
