package TaskStoneScissorsPaper;

import java.util.Scanner;

public class Field {
    private String value;
    private String randomValue;


    public String getValue() {
        return value;
    }

    public String getRandomValue() {
        return randomValue;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setRandomValue(String randomValue) {
        this.randomValue = randomValue;
    }

    public String printField() {
        return "Твой выбор: " + this.value + " ,выбор соперника: " + this.randomValue;
    }
}
