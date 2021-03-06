package worms.model.statements;

public abstract class Statement implements Cloneable {
	
	/**
	 * Return a textual representation of this expression.
	 *
	 * @return The resulting string is non-empty.
	 *       | result.length() > 0
	 */
	@Override
	public abstract String toString();
	
	public abstract void executeStatement();
	
	public abstract boolean isexecuted();
	
	public abstract void setExecuted(boolean bool);
}
