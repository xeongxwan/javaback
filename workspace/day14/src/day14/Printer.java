package day14;

public class Printer {
	public String onepage;
	public String twopage;

	
	
	
	
	public Printer(String onepage,String twopage) {
		this.onepage = onepage;
		this.twopage = twopage;
		
	}




	public String getOnepage() {
		return onepage;
	}




	public void setOnepage(String onepage) {
		this.onepage = onepage;
	}




	public String getTwopage() {
		return twopage;
	}




	public void setTwopage(String twopage) {
		this.twopage = twopage;
	}




	public int getPageNum() {
		return pageNum;
	}




	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}




}
