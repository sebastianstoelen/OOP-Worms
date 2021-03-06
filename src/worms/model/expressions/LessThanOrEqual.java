package worms.model.expressions;

import worms.model.types.BooleanType;

public class LessThanOrEqual extends Comparator {
	
	public LessThanOrEqual(Expression left,Expression right){
		super(left,right);
	}
	
	@Override
	public String getOperatorSymbol() {
		return "<=";
	}

	@Override
	public BooleanType getValue() {
		return new BooleanType((Double) super.getLeft().getValue().getValue() 
				<= (Double) super.getRight().getValue().getValue());
	}

	@Override
	public String toString() {
		return super.getLeft().toString() + getOperatorSymbol() + super.getRight().toString() ;
	}

	@Override
	public LessThanOrEqual clone() {
		return new LessThanOrEqual(super.getLeft(),super.getRight());
	}

}

