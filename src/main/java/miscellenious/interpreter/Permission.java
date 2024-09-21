package miscellenious.interpreter;

// Terminal Expression
public class Permission implements PermissionExpression {
    private String permission;

    public Permission(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission.toLowerCase());
    }

    @Override
    public String toString() {
        return permission;
    }
}
