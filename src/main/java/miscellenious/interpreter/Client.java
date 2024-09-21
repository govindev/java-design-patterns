package miscellenious.interpreter;

public class Client {
    public static void main(String[] args) {
        Report report = new Report("CashFlow report", "FINANCE_ADMIN OR ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression exp = builder.build(report);
        System.out.println(exp);

        User user1 = new User("Dave", "USER");

        System.out.println("User access report : " + exp.interpret(user1));
    }
}
