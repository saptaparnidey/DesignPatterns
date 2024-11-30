package designpatterns.factory;

import designpatterns.factory.components.button.Button;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
