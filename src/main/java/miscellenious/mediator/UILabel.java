package miscellenious.mediator;

import javafx.scene.control.Label;

public class UILabel extends Label implements UIControl{

    public UILabel(UIMediator uiMediator) {
        uiMediator.registor(this);
    }

    @Override
    public String getValue() {
        return getText();
    }

    @Override
    public void controlChanged(UIControl uiControl) {
        setText(uiControl.getValue());
    }
}
