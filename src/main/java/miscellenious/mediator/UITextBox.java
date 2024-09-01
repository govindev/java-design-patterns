package miscellenious.mediator;

import javafx.scene.control.TextField;

public class UITextBox extends TextField implements UIControl {
    private final UIMediator uiMediator;
    private boolean isMediatedUpdate;

    public UITextBox(UIMediator mediator) {
        this.uiMediator = mediator;
        this.uiMediator.registor(this);
        this.setText("TextBox");

        this.textProperty().addListener((observableValue, s, t1) -> {
            if (!isMediatedUpdate)
                this.uiMediator.onValueChanged(this);
        });
    }

    @Override
    public void controlChanged(UIControl uiControl) {
        this.isMediatedUpdate = true;
        setText(uiControl.getValue());
        this.isMediatedUpdate = false;
    }

    @Override
    public String getValue() {
        return getText();
    }
}
