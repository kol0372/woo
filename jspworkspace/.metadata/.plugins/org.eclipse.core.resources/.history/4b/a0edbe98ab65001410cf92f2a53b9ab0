package service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	// sqlMapConfig.xml 의 환경설정을 접근해서 사용자 (SqlClient)들에게
	// 사용메서드를 제공해주고, 쿼리에게 전달될 값을 매핑객체를 통해서 매핑 시켜주는 등
	// 일괄적인 작업을 수행할수 있도록
	// SqlSession 객체를 관리하는 SqlSessionFactory객체를 싱글톤으로 생성해둔다.
	private static SqlSessionFactory factory;
	static {
		// config/sqlMapConfig.xml 의 파일을 읽어온다.
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("config/sqlMapConfig.xml");
			
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	// 클라이언트가 사용할 SqlSessionFactory를 제공하는 메서드 정의
	public static SqlSessionFactory getFactory() {
		return factory;
	}

	
}