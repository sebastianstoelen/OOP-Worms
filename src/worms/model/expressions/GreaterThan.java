package worms.model.expressions;

public class GreaterThan extends BooleanCompareExpression {
	
	public GreaterThan(DoubleExpressions left,DoubleExpressions right){
		value = left.getValue()>right.getValue();
	}
	
	private boolean value;

	@Override
	public String getOperatorSymbol() {
		return ">";
	}

	@Override
	public Boolean getValue() {
		return value;
	}

	@Override
	public boolean isMutable() {
		return false;
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

}
