package interpreter.begin;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user); 
}
