package worms.model.expressions;import worms.model.types.DoubleType;/** * A class of binary expressions, representing the multiplication of * the operand at the left-hand side with the operand at the right * hand side. *  * @version  2.0 * @author   Eric Steegmans */public class Multiplication extends DoubleBinaryExpression {	/**	 * Initialize this new multiplication with given operands.	 *	 * @param  left	 *         The left operand for this new multiplication.	 * @param  right	 *         The right operand for this new multiplication.	 * @effect This new multiplication is initialized as a binary expression	 *         with the given operands.	 *       | super(left,right)	 */	public Multiplication(Expression left, Expression right)			throws IllegalOperandException {		super((DoubleExpression)left, (DoubleExpression)right);	}	/**	 * Return the value of this multiplication.	 *	 * @return The product of the values of the operands of this addition.	 *       | result ==	 *       |   getLeftOperand().getValue() *	 *       |   getRightOperand().getValue()	 */	@Override	public DoubleType getValue() {		return new DoubleType(((Double) getLeftOperand().getValue().getValue()) * 				((Double) getRightOperand().getValue().getValue()));	}	/**	 * Return the symbol representing the operator of this multiplication.	 * 	 * @return The string "*"	 *       | result.equals("*")	 */	@Override	public String getOperatorSymbol() {		return "*";	}	@Override	protected void setOperandAt(int index, DoubleExpression left) {		// TODO Auto-generated method stub			}	@Override	public String toString() {		// TODO Auto-generated method stub		return null;	}}