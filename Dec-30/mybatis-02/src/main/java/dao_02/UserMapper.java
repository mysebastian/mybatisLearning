package dao_02;

import pojo.User;

import java.util.List;

public interface UserMapper {
    //查找全部用户
    List<User> getUserList();

    //    根据Id查找用户
    User getUserById(int id);

    //  添加用户
    int addUser(User user);

    //更新用户
    int updateUser(User user);

    //    删除用户
    int deleteUser(int id);
}
