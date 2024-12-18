package org.hechao.os;

import lombok.Data;

/**
 * @author 31749
 */
@Data
public class File {

    private Integer id;

    private Integer parentId;

    private String name;

    private String content;

    private Directory directory;
}
