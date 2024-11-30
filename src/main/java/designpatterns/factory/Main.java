package designpatterns.factory;

import designpatterns.factory.components.button.Button;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        UIFactory uiFactory = UIFactoryFactory.getUIFactory(SupportedPlatform.IOS);
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
    }
}
