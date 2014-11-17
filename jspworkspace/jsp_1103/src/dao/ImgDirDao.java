package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.ConnUtil;
import vo.ImgDirVo;

public class ImgDirDao {
	// ���� ImgDirDao��ü�� �������̳� JSP���� Model1������� ���� �Ǿ���.

	// �����尡 ������ �ڿ��̱� ������ ����ȭ ó���� �Ǿ�� �Ѱ�,

	// �ڿ��� ������ connection�� �޾Ƽ� ����ؾ� �ϱ� ������ �̱��� ������ ������ ����ؼ�
	// ó���� ������ ����ƽ ������ �ϳ��� �������ѳ��� �� �Ŀ� �̹� ������ �ּҷ� ����ϵ��� �Ѵ�.
	// �ȵ���̵忡�� �׸�����϶�.. �̹� �������� �̱����� ������ �־�� ��

	private static ImgDirDao dao;

	public synchronized static ImgDirDao getDao() {
		if (dao == null)
			dao = new ImgDirDao();
		return dao;
	}

	// ���뿡 �԰��� SQL���� �����ϴ� �޼��带 ������.
	// insert
	public void addImg(ImgDirVo vo) {

		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("insert into imgdir values(imgdir_seq.nextVal,?,?,0,?, sysdate)");
		try {
			con = ConnUtil.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getImgpath());
			pstmt.setString(3, vo.getReip());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	public ArrayList<ImgDirVo> getList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<ImgDirVo> ar = new ArrayList<ImgDirVo>();
		StringBuffer sql = new StringBuffer();
		sql.append("select num, writer, imgpath, hit, edate from imgdir order by");

		try {
			con = ConnUtil.getDs();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				//�ϳ��� row�� ������ vo��ü
				ImgDirVo v = new ImgDirVo();
				v.setNum(rs.getInt("num"));
				v.setWriter(rs.getString("writer"));
				v.setImgpath(rs.getString("imgpath"));
				v.setHit(rs.getInt("hit"));
				v.setEdate(rs.getString("edate"));
				//ArrayList�� ������ �����͸� ������ vo�� �ּҸ� ����Ų��.
				ar.add(v);
			}

			rs.close();
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {

		}
		return ar;
	}
}