package entities;

public abstract class Entity {
	protected Position mPosition;
	
	public Entity(Position position) {
		this.mPosition = position;
	}

	public enum Direction {
		LEFT, RIGHT, UP, DOWN
	}
	
	public abstract boolean canMove(Direction dir);
}
