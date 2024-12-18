package org.os.os.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author 31749
 */
@Data
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private String password;

    private Integer permissions;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public User(){

    }
}
