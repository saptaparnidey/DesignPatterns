package designpatterns.factory.components;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportedPlatform platform){
        return switch (platform){
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
        };
    }
}
