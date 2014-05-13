package worms.model.expressions;

public class Sqrt extends DoubleUnaryExpression {

	protected Sqrt(DoubleExpression operand) throws IllegalOperandException {
		super(operand);
	}

	@Override
	public String getOperatorSymbol() {
		return "sqrt";
	}

	@Override
	public Double getValue() {
		return Math.sqrt((getOperand().getValue()));
	}

	@Override
	protected void setOperandAt(int index, Expression<?> left) {
		// TODO Auto-generated method stub
		
	}

}
