package vo;

import java.io.Serializable;

public class PageVO implements Serializable{

	private int currentPage, currentBlock, rowsPerPage, pagesPerBlock,
			totalRows, totalPages, totalBlocks, startRow, endRow;

	// ������������ȣ, ������Ϲ�ȣ, �����̴� ������ ��ϼ�, �Ѻ��ϴ� ������ ��������
	// ��ü��ϼ� , ��ü������ �� , ��ü ���ϼ�, ���۸�Ϲ�ȣ, ��������Ϲ�ȣ

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getCurrentBlock() {
		return currentBlock;
	}

	public void setCurrentBlock(int currentBlock) {
		this.currentBlock = currentBlock;
	}

	public int getRowsPerPage() {
		return rowsPerPage;
	}

	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}

	public int getPagesPerBlock() {
		return pagesPerBlock;
	}

	public void setPagesPerBlock(int pagesPerBlock) {
		this.pagesPerBlock = pagesPerBlock;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalBlocks() {
		return totalBlocks;
	}

	public void setTotalBlocks(int totalBlocks) {
		this.totalBlocks = totalBlocks;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

}