package worms.model.expressions;

import worms.model.Food;
import worms.model.Worm;
import worms.model.types.DoubleType;
import worms.model.types.Entity;

public class GetYExpression extends OperationExpression {

	public GetYExpression(Expression entity) {
		super(entity);
	}

	@Override
	public String toString() {
		return ("getY(" + getEntity().toString() + ")");
	}

	@Override
	public DoubleType getValue() {
		Expression entity = getEntity();
		if (entity instanceof SelfWormExpression){
			return new DoubleType((Double)SelfWormExpression.getWorm().getY());}
		if ((entity.getValue().getValue()) instanceof Worm)
			return new DoubleType(((Worm)((Entity<?>) entity.getValue()).getValue()).getY());
		return new DoubleType(((Food)((Entity<?>) entity.getValue()).getValue()).getY());
	}

	@Override
	public GetYExpression clone() {
		return new GetYExpression(getEntity());
	}

}
