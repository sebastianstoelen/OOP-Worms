package worms.model.expressions;

import worms.model.Food;
import worms.model.Worm;
import worms.model.types.DoubleType;
import worms.model.types.Entity;

public class GetRadiusExpression extends Expression {

	private final EntityExpression<?> worm;
	
	public GetRadiusExpression(Expression worm) {
		if (worm instanceof SelfWormExpression)
			this.worm= new EntityExpression<Worm>((new SelfWormExpression()).getValue());
		else
			this.worm = (EntityExpression<?>)worm;
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
		if (worm.getValue().getValue() instanceof Worm)
			return new DoubleType(((Worm)worm.getValue().getValue()).getRadius());
		return new DoubleType(Food.getRadius());
	}

}
