package entities;

public class Player extends Entity {
	private Direction mFacingDirection;

	public Player(Position position, Direction dir) {
		super(position);
		this.mFacingDirection = dir;
	}

	@Override
	public boolean canMove(Direction dir) {
		// TODO Auto-generated method stub
		return false;
	}

}
