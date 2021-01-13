package movement;

import objs.properties.Position;

/**
 * @author	Simon Grundner <br>
 *			3AHEL
 */

public interface Controller {

	boolean reqUp();
	boolean reqDown();
	boolean reqLeft();
	boolean reqRight();
	boolean exit();
	boolean reset();
	boolean evade();
	boolean shoot();
	boolean charge();
	boolean refresh();
	boolean swMap();
	boolean resetCollision();
	boolean question();
	boolean spawners();
	Position getMousePos();
}
