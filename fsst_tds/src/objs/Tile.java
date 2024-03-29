package objs;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import main.Game;
import objs.enumerators.Objects;

/**
 * @author	Simon Grundner <br>
 *			3AHEL
 */

public class Tile extends GameObj {

	public Tile(Game game) {
		super(game);
	}

	@Override
	public void assignType() {
		object = Objects.TILE;
	}
	
	// ------------------------------------------------------------
	// update
	// ------------------------------------------------------------

	@Override
	public void update() {
	}

	@Override
	public void colliding() {}

	// ------------------------------------------------------------
	// Draw
	// ------------------------------------------------------------

	@Override
	public AffineTransform transform(Graphics2D graphics) {
		return null;
	}
	
	@Override
	public void drawStats(Graphics2D graphics) {}

	// ------------------------------------------------------------
	// Getters - Setters
	// ------------------------------------------------------------

	public void setImg(BufferedImage img) { this.img = img; }
}
