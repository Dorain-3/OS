package org.hechao.os;

import lombok.Data;

import java.util.List;

/**
 * @author 31749
 */
@Data
public class Directory {

    private Integer id;

    private Integer parentId;

    private String name;

    private Directory parent;

    private List<Directory> children;

    private List<File> files;

}
