package org.os.os.entity;

import lombok.*;
import org.apache.ibatis.javassist.bytecode.analysis.ControlFlow;
import org.os.os.util.PermissionManager;

import java.util.List;

/**
 * @author 31749
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Directory  extends Node{

    private Integer id;

    private String name;

    private PermissionManager permissionManager;

    public Directory(){
    }

}
