package designpatterns.factory.components;

import designpatterns.factory.components.button.AndroidButton;
import designpatterns.factory.components.button.Button;
import designpatterns.factory.components.button.IosButton;
import designpatterns.factory.components.dropdown.AndroidDropDown;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.dropdown.IosDropDown;
import designpatterns.factory.components.menu.AndroidMenu;
import designpatterns.factory.components.menu.IosMenu;
import designpatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
