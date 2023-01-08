package mediator.begin;

//Abstract colleague
public interface UIControl {
	
	void controlChanged(UIControl control);
	
	String getControlValue();
	
	String getControlName();
}
