package worms.model.expressions;

public abstract class BooleanCompareExpression extends BooleanExpressions {

	@Override
	public boolean hasAsSubExpression(Expression<Boolean> expression) {
		return expression==this;
	}
	
	public abstract String getOperatorSymbol();

}
