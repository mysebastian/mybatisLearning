package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

//利用SqlSessionFactoryBuilder获取sqlSessionFactory  并用得到的SqlSessionFactory获取SqlSession对象
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
//            使用Mybatis的第一步：获取SqlSessionFactory对象
            String resource = "Mybatis-config.xml";
          //  URL resource1 = MybatisUtils.class.getClassLoader().getResource("Mybatis-config.xml");
            InputStream inputStream = Resources.getResourceAsStream(resource);
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*既然有了 SqlSessionFactory，顾名思义，我们就可以从中获得 SqlSession 的实例了。
 org.apache.ibatis.session.SqlSession 完全包含了面向数据库执行 org.apache.ibatis.jdbc.SQL 命令所需的所有方法。
你可以通过 SqlSession 实例来直接执行已映射的 SQL 语句*/
public static SqlSession getSqlSession(){
    return sqlSessionFactory.openSession();
}
}
