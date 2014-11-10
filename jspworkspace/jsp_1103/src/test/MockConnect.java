package test;

import java.sql.Connection;
import java.sql.SQLException;

import conn.ConnUtil;

public class MockConnect {
 public static void main(String[] args) {
	try {
		Connection con = ConnUtil.getDs();
		System.out.println("test:" + con);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
}
