package designpatterndemo.demo;

public class Main {

	public static void main(String[] args) {

		//Enter number which will come to queue.
		String incomingNO = "9511722732";
		String firstTwoChars = incomingNO.substring(0,2);
		System.out.println(firstTwoChars);
		Operator number;

		//As an example I have given created pairs for numbers and related company.
		// 95=Jio, 99=Airtel, 88=Idea, any other=Vodapone.
		
		if(firstTwoChars.equals("95"))
		{
			number = new Jio();
		}
		else if(firstTwoChars.equals("99"))
		{
			number = new Airtel();
		}
		else if(firstTwoChars.equals("88"))
		{
			number = new Idea();
		}
		else
		{
			number = new Vodafone();
		}
		number.call();
	}
}
