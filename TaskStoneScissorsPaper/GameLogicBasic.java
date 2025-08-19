package TaskStoneScissorsPaper;

import java.util.Scanner;

public class GameLogicBasic implements IGameLogic{
    private String result;
    private final Field field = new Field();
    private Scanner scanner = new Scanner(System.in);

    public static final String[] availableValues = {"камень", "ножницы", "бумага"};


    public void startGame(){
        String userMove = getUserMove();
        String pcMove = getPCMove();
        field.setValue(userMove);
        field.setRandomValue(pcMove);
        checkResult();
        printResult();
    }

    private void printResult(){
        System.out.println(field.printField());
        System.out.println("Результат: " + result);

    }

    public String getUserMove() {
        while (true) {
            System.out.print("Введите значение (камень/ножницы/бумага): ");
            String val = scanner.nextLine();

            if (val != null) {
                val = val.trim().toLowerCase();
            }

            if (isValid(val)) {
                return val;
            }

            System.out.println("ваше значение не верно! Введите значение (камень/ножницы/бумага): ");
        }

    }

    public String getPCMove() {
        int random = (int) (Math.random() * availableValues.length);
        String randomVal = availableValues[random];
        return randomVal;
    }

    private boolean isValid(String val) {
        if (val == null) return false;
        for (String s : availableValues) {
            if (s.equals(val)) {
                return true;
            }
        }
        return false;
    }

    public void checkResult() {
        String userValue = field.getValue();
        String opponentValue = field.getRandomValue();

        if (userValue.equals(opponentValue)) {
            result = "Ничья";
        } else if ((userValue.equals("камень") && opponentValue.equals("ножницы"))
                || (userValue.equals("ножницы") && opponentValue.equals("бумага"))
                || (userValue.equals("бумага") && opponentValue.equals("камень"))) {
            result = "Победа";
        } else {
            result = "Поражение";
        }
    }

}
