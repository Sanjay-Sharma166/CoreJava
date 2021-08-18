package com.oops;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class DocumentStringQone
{
	
	private String title;
	private String filepath;

	//Getter
	public String getTitle() {
		return title;
	}

	public String getFilepath() {
		return filepath;
	}

	//Setter
	public String setTitle(String t) {
		return this.title = t;
	}

	public String setFilepath(String ph) {
		return this.filepath = ph;
	}
	
	public void showDocumentInformation(String title, String filepath) {
		System.out.println(title);
		System.out.println(filepath);	
	}
	
	public static void main(String[] args) 
	{
		String x,y;
		
		DocumentStringQone d1 = new DocumentStringQone();
		x = d1.setTitle("this is a java program");
		y = d1.setFilepath("c://title:java basics, \r\n" + "filepath:c:/document/corejava/basics/introduction.pdf");
		d1.showDocumentInformation(x,y);
		
	}

}