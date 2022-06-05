package io.whysff.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/06/05
 */
@Data
@TableName("t_user")
public class User {
    @TableId("uid")
    private Long id;
    private String userName;
    private Integer age;
    private String email;

    @TableLogic
    private int isDel;


}
