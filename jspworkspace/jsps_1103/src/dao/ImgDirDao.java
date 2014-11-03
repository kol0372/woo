package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.ConnUtil;
import vo.ImgDriVO;

public class ImgDirDao {
	// ���� ImgDirDao��ü�� �����̳� JSP���� Model1������� ���� �Ǿ���.
	// Thread�� ������ �ڿ��̱� ������ ����ȭ(synchronized) ó���� �Ǿ�� �ϰ�
	// �ڿ��� ������ Connection�� �޾Ƽ� ����ؾ� �ϱ� ������ �̱��� ������ ������ ����ؼ�
	// ó���� ������ static������ �ϳ��� �������ѳ��� �� �Ŀ��� �̹� ������ �ּҷ� ����ϵ��� �Ѵ�.
	// �ȵ���̵忡�� GridView�� �� �̹� �������� �̱����� ������ �־�� �˰���? 
	private static ImgDirDao dao;

	public synchronized static ImgDirDao getDao() {
		if(dao == null) dao = new ImgDirDao();
		return dao;
	}
	// ���뼺�� �԰��� SQL���� �����ϴ� �޼��带 ����� ����.
	// add
	public void addImg(ImgDriVO vo){
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
	    	sql.append("insert into imgdir values(imgdir_seq.nextVal,");
	    	sql.append("?,?,0,?,sysdate)");
		try {
			con = ConnUtil.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getImgpath());
			pstmt.setString(3, vo.getReip());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	// list
	public ArrayList<ImgDriVO> getList() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// ������ ������VO�� �ּҸ� ����ų �÷��� ����
		ArrayList<ImgDriVO> ar = new ArrayList<ImgDriVO>();
		StringBuffer sql = new StringBuffer();
		sql.append("select num,writer,imgpath,hit,edate from imgdir order by 1 desc");
		
		con = ConnUtil.getDs();
		pstmt = con.prepareStatement(sql.toString());
		rs = pstmt.executeQuery();
		while (rs.next()) {
			// �ϳ��� row�� ������ VO��ü 
			ImgDriVO v = new ImgDriVO();
			v.setNum(rs.getInt("num"));
			v.setWriter(rs.getString("writer"));
			v.setImgpath(rs.getString("imgpath"));
			v.setHit(rs.getInt("hit"));
			v.setEdate(rs.getString("edate"));
			// ArrayList�� ������ �����͸� ������ vo�� �ּҸ� ����Ų��.
			ar.add(v);
		}
		rs.close();
		pstmt.close();
		con.close();
		return ar; // �� �ּҸ� ��ȯ�Ѵ�.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
