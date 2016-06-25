package print;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public enum Control {
INSTANCE;
	private class BtnPrintEventHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent evnt) {
			 String data = Print.INSTANCE.getTextMsg();
             System.out.println(data);
             Print.INSTANCE.messageBar.setText("Data printed to console");
		}
		
	}
	
	public EventHandler<ActionEvent> getBtnPrintEventHandler()
	{
		return new BtnPrintEventHandler();
	}
	
	private class BtnClearEventHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent evnt) {
			Print.INSTANCE.clearFields();
			Print.INSTANCE.messageBar.setText("Data cleared");
		}
		
	}
	
	public EventHandler<ActionEvent> getBtnClearEventHandler()
	{
		return new BtnClearEventHandler();
	}
}
