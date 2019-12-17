package designpatterndemo.facade;

public class OperatorCapturingFacade {
	public static void captureNumber(String number) 
	{
		String firstTwoChars = number.substring(0,2);
		//Enter number related data in DB
		Company company = new Company();
		company.setData(new CompanyData());
		company.setReport(new CompanyReport());

		//Write report
		OperatorWriter writer = new OperatorWriter();
		switch(firstTwoChars) 
		{
			case "95":
				writer.numberJio();
				break;
	
			case "99":
				writer.numberAirte();
				break;
			case "88":
				writer.numberIdea();
				break;
			default:
				writer.numberVodafone();
				break;
		}
	}

}
