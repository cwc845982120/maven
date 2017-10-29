import cn.springmvc.dao.UserDao;
import cn.springmvc.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author caowencheng
 * @version 1.0.0
 * @description
 * @date 2017-10-29 15:02
 **/

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryUser(){

        int id = 1;

        User user = userDao.queryUserById(id);

        System.out.println(user);
    }

}