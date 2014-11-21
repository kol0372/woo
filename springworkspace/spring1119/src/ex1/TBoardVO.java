package ex1;

import org.springframework.web.multipart.MultipartFile;

public class TBoardVO {
	private String sub, writer, content, pwd, mfile2;
	private MultipartFile mfile;
	
	
	
	public String getMfile2() {
		return mfile2;
	}

	public void setMfile2(String mfile2) {
		this.mfile2 = mfile2;
	}

	
	
	

	public MultipartFile getMfile() {
		return mfile;
	}

	public void setMfile(MultipartFile mfile) {
		this.mfile = mfile;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
