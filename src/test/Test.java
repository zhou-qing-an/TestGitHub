package test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Test {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/redissql?serverTimezone=CST&characterEncoding=UTF-8";
    private static final String name = "root";
    private static final String password = "w123";


    public static void test(){
        //  声明存储过程 SQL
        String sql = "{call new_procedure(?,?)}";

        //  声明连接对象
        Connection conn = null;
        CallableStatement call = null;

        try {
            //  加载驱动
            Class.forName(driver);
            //  获取连接
            conn = DriverManager.getConnection(url,name,password);
            call = conn.prepareCall(sql);
            //  传入id
            call.setInt(1,3);
            //  传入值类型
            call.registerOutParameter(2, Types.VARCHAR);
            //  执行存储过程
            call.execute();

            //  获取结果
            String name = call.getString(2);

            System.out.println(name);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
       test();
    }

}
