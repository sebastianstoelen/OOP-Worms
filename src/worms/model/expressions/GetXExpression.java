package worms.model.expressions;

import worms.model.Food;
import worms.model.Worm;
import worms.model.types.DoubleType;
import worms.model.types.Entity;

public class GetXExpression extends Expression {

	private final Expression worm;
	
	public GetXExpression(Expression worm) {
		if (worm instanceof SelfWormExpression)
			this.worm= new EntityExpression<Worm>((new SelfWormExpression()).getValue());
		else
			this.worm = worm;
	}

	@Override
	public boolean equals(Object other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoubleType getValue() {
		if (((Entity<?>)worm.getValue()).getValue() instanceof Worm)
			return new DoubleType(((Worm)((Entity<?>) worm.getValue()).getValue()).getX());
		return new DoubleType(((Food)((Entity<?>) worm.getValue()).getValue()).getX());
	}

}
