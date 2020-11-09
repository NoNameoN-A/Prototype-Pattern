package pattern;

import javafx.scene.image.Image;

public class Sticker extends Prototipo{

    private static Double WIDTH;
    private static Double HEIGHT;
    
    private static Double POSITION_X;
    private static Double POSITION_Y;
    
    private static Image IMAGE;
    
    public Sticker(Double width, Double height) {
    	this.WIDTH = width;
    	this.HEIGHT = height;
    	this.POSITION_X = 0.0;
    	this.POSITION_Y = 0.0;
	}

	@Override
	public Prototipo copy() {
		//Prendo la grandezza del prototipo
		Sticker stickerClonato = new Sticker(this.getWidth(), this.getHeight());
        return stickerClonato;
	}

	public void setPosition(Double x, Double y) {
		this.POSITION_X = x;
    	this.POSITION_Y = y;
	}

	@Override
	public Double getWidth() { return WIDTH; }
	@Override
	public Double getHeight() { return HEIGHT; }
	public void setImage(Image i) { IMAGE = i; }
	public Image getImage() { return IMAGE; }
	public Double getPosition_Y() { return POSITION_Y; }
	public Double getPosition_X() { return POSITION_X; }
}
