package com.atguigu.pojo;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * 用户类
 *
 * @author zlt
 * @date 2025-12-17
 */
/**
 * projectName: com.atguigu.pojo
 */
@Data
public class User {
    //age   1 <=  age < = 150
    @Min(10)
    private int age;

    //name 3 <= name.length <= 6
    @Length(min = 3,max = 10)
    @NotBlank//字符串不为空
    private String name;

    //email 邮箱格式
    @Email
    private String email;

    @Past
    private Data birthday;
}
