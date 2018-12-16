package com.tushuo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 咸鱼
 * @date 2018/12/13 22:36
 */
@Data
@NoArgsConstructor
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
}
