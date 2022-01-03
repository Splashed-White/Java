import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-21
 * Time: 23:26
 */
public class TestJDBC {
    public static void main(String[] args) {
        //1. 先创建一个 DataSource 实例 [DataSource就是JDBC提供的类]
        // DataSource 就描述了数据的来源 [从哪个数据库来的，就需要在DataSource中设置数据库的地址]
        DataSource dataSource = new MysqlDataSource(); //向上转型
        //通过这个代码告知程序据库服务器在哪，通过一个URL来描述服务器的地址.
        ((MysqlDataSource)dataSource).setUrl();
        //通过这个代码告知程序访问数据库的用户名
        ((MysqlDataSource)dataSource).setUser();
        //通过这个代码告知程序访问数据库的密码
        ((MysqlDataSource)dataSource).setPassword();

        //2. 需要和数据库建立连接
        //通过网络和数据库进行连接操作，同时就会验证用户名和密码
        Connection connection = dataSource.getConnection();

    }
}
