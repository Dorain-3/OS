package org.os.os.Constant;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.os.os.util.PermissionManager;

import java.security.Permission;

/**
 * @author 31749
 */
@Getter
@RequiredArgsConstructor
public class PermissionConstant {

    private static final PermissionManager ADMIN = PermissionManager.getAdmin();

    private static final PermissionManager USER = PermissionManager.getUser();

    private static final PermissionManager GUEST = PermissionManager.getGuest();

    @Getter
    @RequiredArgsConstructor
    public enum Permission {
        READ(1, "读"),
        WRITE(2, "写"),
        DELETE(4, "删");

        @EnumValue
        @Getter
        private final Integer code;
        private final String desc;

        public static Permission getByCode(Integer code) {
            for (Permission permission : Permission.values()) {
                if (permission.getCode().equals(code)) {
                    return permission;
                }
            }
            return null;
        }
    }


}
