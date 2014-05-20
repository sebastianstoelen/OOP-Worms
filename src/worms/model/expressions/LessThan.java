package worms.model.expressions;

import worms.model.types.BooleanType;
import be.kuleuven.cs.som.annotate.Model;

public class LessThan extends Comparator {

	@Model
	public LessThan(Expression left, Expression right) {
		this.leftOperand = left;
		this.rightOperand = right;
	}
		
	public BooleanType getValue() {
		return new BooleanType((Double)getLeftOperand().getValue().getValue() < (Double)getRightOperand().getValue().getValue());	
		}


	@Override
	public boolean equals(Object other) {
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOperatorSymbol() {
		// TODO Auto-generated method stub
		return "<";
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
}

