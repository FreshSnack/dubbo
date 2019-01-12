package dubbo.provider.service;

import dubbo.api.model.User;
import dubbo.api.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author dingmx
 * @date 2019/1/12 16:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void test() {
        Assert.assertNotNull(userService);
        System.out.println(userService);
    }

    @Test
    public void testGetUser() {
        User user = userService.getUserById(1);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAddress());
    }
}
