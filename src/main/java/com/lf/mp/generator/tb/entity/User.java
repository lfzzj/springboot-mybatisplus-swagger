package com.lf.mp.generator.tb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lf
 * @since 2020-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private LocalDate birthday;

    private String note;

    private LocalDate created;

    private LocalDate updated;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 逻辑删除
     */
    private Integer deleted;


}
