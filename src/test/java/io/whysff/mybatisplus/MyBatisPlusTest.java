package io.whysff.mybatisplus;

import io.whysff.mybatisplus.mapper.UserMapper;
import io.whysff.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/06/05
 */
@SpringBootTest
public class MyBatisPlusTest {
    @Resource
    private UserMapper userMapper;

    /**
     * 测试查询所有数据
     */
    @Test
    void testSelectList(){
        //通过条件构造器查询一个list集合，若没有条件，则可以设置null为参数
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    /**
     * 测试插入一条数据
     * MyBatis-Plus在实现插入数据时，会默认基于雪花算法的策略生成id
     */
    @Test
    public void testInsert(){
        User user = new User();
        user.setName("Vz");
        user.setAge(21);
        user.setEmail("vz@oz6.cn");
        int result = userMapper.insert(user);
        System.out.println(result > 0 ? "添加成功！" : "添加失败！");
        System.out.println("受影响的行数为：" + result);
        //1533256924999553025（当前 id 为雪花算法自动生成的id）
        System.out.println("id自动获取" + user.getId());
    }
}
