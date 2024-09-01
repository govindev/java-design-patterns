package miscellenious.mediator;

import java.util.List;

public class UIMediator {
    List<UIControl> uiControlList;
    public void registor(UIControl uiControl) {
        uiControlList.add(uiControl);
    }

    public void onValueChanged(UIControl uiControl) {
        uiControlList.stream()
                .filter(uiControl1 -> uiControl1 != uiControl)
                .forEach(uiControl1 -> uiControl1.controlChanged(uiControl));
    }
}
