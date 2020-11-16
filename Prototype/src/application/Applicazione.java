package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import pattern.Sticker;

public class Applicazione implements Initializable{

    @FXML
    private Canvas halloweenGarden;
    private GraphicsContext gc;
    private String idImageClicked;
    private Sticker PROTOTIPO;
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	gc = halloweenGarden.getGraphicsContext2D();
        Image image = new Image("image/giardino_halloween.jpg");
		gc.drawImage(image, 0, 0, 800, 483);
		
		PROTOTIPO = new Sticker(50.0, 50.0);

	}

    @FXML
    void stickerScelto(MouseEvent event) {
    	idImageClicked = ((ImageView)event.getSource()).getId(); //cobweb
    }

    @FXML
    void rilasciaImmagine(MouseEvent event) {
    	if(idImageClicked != null) { //Verifico che sia stata selezionata un immagine
			
			Sticker sticker = (Sticker) PROTOTIPO.copy();
			sticker.setPosition(event.getX(), event.getY());
			sticker.setImage(new Image("images/sticker/png/" + idImageClicked + ".png"));

	    	gc = halloweenGarden.getGraphicsContext2D();
	    	gc.drawImage(sticker.getImage(),
	    			sticker.getPosition_X(), sticker.getPosition_Y(), 
	    			sticker.getWidth(), sticker.getHeight());
    	}
    	else
    		System.out.println("Immagine non selezionata");
    }

	
    
}
