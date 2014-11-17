package service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService1 {
	// sqlMapConfig.xml �� ȯ�漳���� �����ؼ� ����� (SqlClient)�鿡��
	// ���޼��带 �������ְ�, �������� ���޵� ���� ���ΰ�ü�� ���ؼ� ���� �����ִ� ��
	// �ϰ����� �۾��� �����Ҽ� �ֵ���
	// SqlSession ��ü�� �����ϴ� SqlSessionFactory��ü�� �̱������� �����صд�.
	private static SqlSessionFactory factory1;
	static {
		// config/sqlMapConfig.xml �� ������ �о�´�.
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("config/sqlMapConfig.xml");

			factory1 = new SqlSessionFactoryBuilder().build(reader);
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

	// Ŭ���̾�Ʈ�� ����� SqlSessionFactory�� �����ϴ� �޼��� ����
	public static SqlSessionFactory getFactory() {
		return factory1;
	}

}