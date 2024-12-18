package org.os.os.entity;

import com.mysql.cj.jdbc.Blob;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.os.os.util.PermissionManager;

/**
 * @author 31749
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class File extends Node{

    private Long id;

    private String name;

    private String fileType;

    private Long size;

    private Blob content;

    private PermissionManager permissionManager;

    public File() {

    }

}
