package designpatterndemo.facade;

public class Main {
	public static void main(String[] args) throws Exception
    {
		//replace number to check company
		String number = "9511722732";
        OperatorCapturingFacade numberCapturingFacade = new OperatorCapturingFacade();

        numberCapturingFacade.captureNumber(number);
         
    }

}
