package pattern;

import javafx.scene.image.Image;

public class Sticker extends Prototipo{

    private Double WIDTH;
    private Double HEIGHT;
    
    private Double POSITION_X;
    private Double POSITION_Y;
    
    private Image IMAGE;
    
    protected Sticker(Double width, Double height) {
    	this.WIDTH = width;
    	this.HEIGHT = height;
    	this.POSITION_X = 0.0;
    	this.POSITION_Y = 0.0;
	}
    
    public static Sticker creaPrototipo(Double width, Double height) {
    	Sticker s = new Sticker(width, height);
    	s.setPosition(0.0, 0.0);
    	
    	return s; 
	}

	@Override
	public Prototipo copy() {
		Sticker s = new Sticker(this.getWidth, this.getHeight);
		return s;
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
