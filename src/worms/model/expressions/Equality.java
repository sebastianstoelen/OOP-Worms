package worms.model.expressions;

import worms.model.types.BooleanType;


public class Equality extends Comparator {

	public Equality(Expression left,Expression right){
		this.leftOperand = left;
		this.rightOperand = right;
	}
	
	@Override
	public String getOperatorSymbol() {
		return "==";
	}

	@Override
	public BooleanType getValue() {
		return new BooleanType(getLeftOperand().getValue().equals(getRightOperand().getValue()));
	}

	

	


	@Override
	public Expression getLeftOperand() {
		return leftOperand;
	}

	@Override
	public Expression getRightOperand() {
		return rightOperand;
	}
	
	private final Expression leftOperand;
	
	private final Expression rightOperand;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
