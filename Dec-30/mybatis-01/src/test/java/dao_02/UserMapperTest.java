package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void test(){
//        获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//       方式一：getMapper 执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.getUserList();
//        for (User user: userList) {
//            System.out.println(user);
//        }
       // mapper.insertUser(new User(3, "test","123333"));
        mapper.insertUser(new User(17, "test02","322111"));

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public  void  testAddUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 6);
        map.put("userName","伯愚");
        map.put("userPwd", "4163");
        mapper.addUser(map);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getUserLike(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    List<User> userList=userMapper.selectUserLike("伯");
    for (User user : userList) {
            System.out.println(user);
        }
    sqlSession.commit();
    sqlSession.close();
    }

}
