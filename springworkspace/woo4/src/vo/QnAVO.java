package vo;

public class QnAVO {
	// ref�� ���ۿ����� �亯�۵��� �����ϱ� ���� �ĺ����� �׷��ȣ
	// seq�� �亯���� ����
	// lvl�� �亯���� ���° �亯������ �亯���� ������ ǥ��
	String qtitle, qcontent, qdate;
	int qnum, ref, seq, lvl, qhit, num;

	public String getQtitle() {
		return qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public String getQdate() {
		return qdate;
	}

	public void setQdate(String qdate) {
		this.qdate = qdate;
	}

	public int getQnum() {
		return qnum;
	}

	public void setQnum(int qnum) {
		this.qnum = qnum;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getQhit() {
		return qhit;
	}

	public void setQhit(int qhit) {
		this.qhit = qhit;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
