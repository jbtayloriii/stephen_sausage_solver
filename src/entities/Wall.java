package entities;

public class Wall extends Entity {

	public Wall(Position position) {
		super(position);
	}

	@Override
	public boolean canMove(Direction dir) {
		return false;
	}

}
