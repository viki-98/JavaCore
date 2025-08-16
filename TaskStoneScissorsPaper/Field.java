package TaskStoneScissorsPaper;

import java.util.Scanner;

public class Field {
    public static final String[] availableValues = {"камень", "ножницы", "бумага"};
    private String value;
    private String randomValue;

    Scanner scanner = new Scanner(System.in);

    public String getValue() {
        System.out.print("Введите значение (камень/ножницы/бумага): ");
        String val = scanner.nextLine();

        if (val != null) {
            val = val.trim().toLowerCase();
        }

        if(validateValue(val)) {
            this.value = val;
            System.out.println("Ваше значение: " + value);
            return value;
        } else {
            System.out.println("ваше значение не верно!");
            return null;
        }

    }

    public String getRandomValue() {
        int random = (int) (Math.random() * availableValues.length);
        randomValue = availableValues[random];
        return randomValue;
    }

    public Boolean validateValue(String val) {
        for(String str : availableValues) {
            if(str.equals(val)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
