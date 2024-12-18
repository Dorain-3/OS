package org.os.os.util;


import org.os.os.Constant.PermissionConstant.Permission;

/**
 * @author 31749
 */
public class PermissionManager {

    private int permissions;

    public int addPermission(Permission permission) {
        return permissions |= permission.getCode();
    }

    public int removePermission(Permission permission) {
        return permissions & ~permission.getCode();
    }

    public boolean check(Permission permission) {
        return (permissions & permission.getCode()) == permission.getCode();
    }

    public static PermissionManager getAdmin() {
        PermissionManager admin = new PermissionManager();
        admin.addPermission(Permission.READ);
        admin.addPermission(Permission.WRITE);
        admin.addPermission(Permission.DELETE);
        return admin;
    }

    public static PermissionManager getUser() {
        PermissionManager user = new PermissionManager();
        user.addPermission(Permission.READ);
        user.addPermission(Permission.WRITE);
        return user;
    }

    public static PermissionManager getGuest() {
        PermissionManager guest = new PermissionManager();
        guest.addPermission(Permission.READ);
        return guest;
    }

}
