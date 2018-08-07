package ua.com.codefire._08_classes_adv;

import ua.com.codefire._08_classes_adv.enums.Colors;

public class Main {

    public static void main(String[] args) {

        Engine.Type engineType = Engine.Type.GAS;
        Engine engine = new Engine("V8", 2.0, engineType);
        Car car = new FamilyCar("Ford", "Fusion", engine, true);

        // EngineType type = EngineType.GAS.DIESEL.METAN.PROPAN.DIESEL;

        Colors color = Colors.GREEN;
        System.out.println(color); // color.toString()
        System.out.println(color.getCode());
    }
}
