package dao;

import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User selectUser(int id);

    int insertUser(User user);

    int addUser(Map map);

    List<User> selectUserLike(String name);

    int updateUser(User user);

    int deleteUser(int id);
}
