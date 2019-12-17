package designpatterndemo.facade;

public class Company {
	private CompanyData data;
	private CompanyReport report;
	
    public CompanyData getData() {
		return data;
	}
	public void setData(CompanyData data) {
		 System.out.println("Setting number data");
		this.data = data;
	}
	public CompanyReport getReport() {
		return report;
	}
	public void setReport(CompanyReport report) {
		 System.out.println("Setting number report");
		this.report = report;
	}
}
