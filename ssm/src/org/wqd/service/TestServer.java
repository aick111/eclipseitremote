/**
* @Title: TestServer.java
* @Package org.wqd.service
* @Description: TODO		描述该文件做什么
* @author wqdeng
* @date 2019年10月23日
* @version V1.0
*/
package org.wqd.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Description: TODO 数据库链接测试
 * @author wqdeng
 * @date 2019年10月23日 下午2:16:10
 *
 */
public class TestServer {
	// Mysql：
	// 驱动：com.mysql.jdbc.driver
	// url： jdbc:mysql://localhost:3306/数据库名

	// SQL Server:
	// 驱动：com.microsoft.sqlserver.jdbc.SQLServerDriver
	// url：jdbc:sqlserver://localhost:1433; DatabaseName=数据库名

	// Oracle:
	// 驱动：oracle.jdbc.driver.OracleDriver
	// url：jdbc:oracle:thin:@localhost:1521:数据库名
	public static void main(String[] args) {
//		mysqlJDBCTest();
		sqlServerJDBCTest();
	}

	/**
	 * 
	 * @Description: TODO 直接替换 驱动与url 地址 sqlServerJDBCTest
	 */
	public static void sqlServerJDBCTest() {
		// 创建数据库连接对象、预编译的statement对象和结果
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// 加载数据库驱动(因为可能出现异常，所以使用try/catch)
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// 配置数据库相关信息:url,用户名，密码
			String url = "jdbc:sqlserver://localhost:1433; DatabaseName=school";
			String username = "sa";
			String password = "123456";
			// 获取数据库连接
			connection = DriverManager.getConnection(url, username, password);
			// 编写sql语句
			String sqlStr = "select * from student";
			// 预编译sql语句
			preparedStatement = connection.prepareStatement(sqlStr);
			// 执行sql语句，并获取返回的结果
			resultSet = preparedStatement.executeQuery();
			// 获取并遍历结果集
			while (resultSet.next()) {
				// 获取数据，注意与数据库对应
				String studentNo = resultSet.getString("studentNo");
				int loginPwd = resultSet.getInt("loginPwd");
				String studentName = resultSet.getString("studentName");
				System.out
						.println("studentNo : " + studentNo + ",loginPwd " + loginPwd + ",studentName " + studentName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @Description: TODO 直接替换 驱动与url 地址 mysqlJDBCTest
	 */
	public static void mysqlJDBCTest() {
		// 创建数据库连接对象、预编译的statement对象和结果
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// 加载数据库驱动(因为可能出现异常，所以使用try/catch)
			Class.forName("com.mysql.jdbc.Driver");
			// 配置数据库相关信息:url,用户名，密码
			String url = "jdbc:mysql://localhost:3306/xuexi";
			String username = "root";
			String password = "123456";
			// 获取数据库连接
			connection = DriverManager.getConnection(url, username, password);
			// 编写sql语句
			String sqlStr = "select * from biao";
			// 预编译sql语句
			preparedStatement = connection.prepareStatement(sqlStr);
			// 执行sql语句，并获取返回的结果
			resultSet = preparedStatement.executeQuery();
			// 获取并遍历结果集
			while (resultSet.next()) {
				// 获取数据，注意与数据库对应
				String u_name = resultSet.getString("name");
				int u_age = resultSet.getInt("age");
				String u_salary = resultSet.getString("email");
				System.out.println("name : " + u_name + ",age " + u_age + ",salary " + u_salary);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
