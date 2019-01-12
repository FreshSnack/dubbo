package dubbo.provider.service;

import dubbo.api.model.User;
import dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author dingmx
 * @date 2019/1/12 16:25
 */
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User getUserById(Integer id) {
        String sql = "select id, name, age, phone, address from user where id = ?";
        User rtUser = jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getInt(1));
            user.setName(rs.getString(2));
            user.setAge(rs.getInt(3));
            user.setPhone(rs.getString(4));
            user.setAddress(rs.getString(5));
            return user;
        });
        return rtUser;
    }

    @Override
    public List<User> listUser() {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }
}
