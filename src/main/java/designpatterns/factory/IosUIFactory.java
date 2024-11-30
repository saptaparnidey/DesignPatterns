package designpatterns.factory;

import designpatterns.factory.components.button.Button;
import designpatterns.factory.components.button.IosButton;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.dropdown.IosDropDown;
import designpatterns.factory.components.menu.IosMenu;
import designpatterns.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
