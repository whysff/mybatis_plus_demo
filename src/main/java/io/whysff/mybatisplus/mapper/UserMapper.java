package io.whysff.mybatisplus.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.whysff.mybatisplus.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/06/05
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据id查询用户信息为Map
     * @param id
     * @return
     */
    Map<String, Object> selectMapById(@Param("id") Long id);
}
