package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import vo.MjoinVO;
import conn.ConnUtil;


public class JoinDao {
	// ���� ImgDirDao��ü�� �����̳� JSP���� Model1������� ���� �Ǿ���.

	// �����尡 ������ �ڿ��̱� ������ ����ȭ ó���� �Ǿ�� �Ѱ�,

	// �ڿ��� ������ connection�� �޾Ƽ� ����ؾ� �ϱ� ������ �̱��� ������ ������ ����ؼ�
	// ó���� ������ ����ƽ ������ �ϳ��� �������ѳ��� �� �Ŀ� �̹� ������ �ּҷ� ����ϵ��� �Ѵ�.
	// �ȵ���̵忡�� �׸�����϶�.. �̹� �������� �̱����� ������ �־�� ��

	private static JoinDao dao;

	public synchronized static JoinDao getDao() {
		if (dao == null)
			dao = new JoinDao();
		return dao;
	}

	// ���뿡 �԰��� SQL���� �����ϴ� �޼��带 ������.
	// insert
	public boolean addJoin(MjoinVO vo) {

		Connection con = null;
		PreparedStatement pstmt = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into mjoin values(mjoin_seq.nextVal,?,?,?,?, sysdate)");
		try {
			con = ConnUtil.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getInfo());
			pstmt.executeUpdate();
			return true; //���������� �Է¿Ϸ� true
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false; //������������ �Է� false
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

public int login(Map<String, String> info){
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int cnt=0;
		StringBuffer sql = new StringBuffer();
		sql.append("select count(*) cnt from mjoin where id=? and pwd=?");
		try {
			con = ConnUtil.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, info.get("id"));
			pstmt.setString(2, info.get("pwd"));
			rs = pstmt.executeQuery();
			  if (rs.next()) {
		             cnt=1;
		        }
			rs.close();
			pstmt.close();
			con.close();		
		} catch (SQLException e) {
		}
		return cnt;
}
}
