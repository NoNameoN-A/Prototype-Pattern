package test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class UsaEGetta extends Application
{
  @Override
  public void start(Stage theStage)
  {
    theStage.setTitle( "Canvas Example" );

    Group root = new Group();
    Canvas canvas = new Canvas( 400, 400 );
    GraphicsContext gc = canvas.getGraphicsContext2D();

    gc.setFill( Color.RED );
    gc.setStroke( Color.BLACK );
    gc.setLineWidth(2);
    Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
    gc.setFont( theFont );
    gc.fillText( "Hello, World!", 60, 50 );
    gc.strokeText( "Hello, World!", 60, 50 );

    Image earth = null;
    try{
        earth = new Image("image/giardino_halloween.jpg");
    }catch(Exception e){
        System.out.println(e.toString());
    }

    System.out.println("height: "+earth.getHeight()+" width: "+earth.getWidth());
    //gc.drawImage( earth, 0, 0);
    gc.drawImage(earth, 0, 0, 50, 50);
    gc.drawImage(earth, 0, 0, 55, 55);
    gc.drawImage(earth, 0, 0, 60, 60);
    gc.drawImage(earth, 10, 10, 50, 50);
    gc.drawImage(earth, 20, 20, 50, 50);
    gc.drawImage(earth, 30, 30, 50, 50);
    
    
    root.getChildren().add( canvas );
    Scene theScene = new Scene( root );
    theStage.setScene( theScene );
    theStage.setResizable(false);
    theStage.show();

  }

  public static void main(String[] args)
  {
    launch(args);
  }
}