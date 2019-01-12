package dubbo.api.service;

import dubbo.api.model.User;
import java.util.List;

public interface UserService {

    /**
     * 获取用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> listUser();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);
}
