package dao_02;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.List;

public class UserMapperTest {
@Test
    public void testAddUser() {
    SqlSession sqlSession= MybatisUtils.getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

   // mapper.addUser(new User(8,"元旦","egweoorg"));
    List<User> user = mapper.getUserList();
    for (User use: user) {
        System.out.println(use);
    }
    System.out.println("---------");
    User user11 = mapper.getUserById(8);
    System.out.println(user11);
    sqlSession.commit();
    sqlSession.close();
}
}
