package TaskStoneScissorsPaper;

public class GameLogic{
    public String result;
    Field field = new Field();

    public void startGame(){
        String userValue = field.getValue();

        if(userValue == null) {
            System.out.println("Попробуйте сново!");
            return;
        } else {
            String randomValue = field.getRandomValue();
            System.out.println("значение соперника: " + randomValue);
            checkResult(userValue, randomValue);

        }

    }

    public void checkResult(String userValue, String opponentValue) {
        if (userValue.equals(opponentValue)) {
            result = "Ничья";
            System.out.println("Результат: " + result);
        } else if ((userValue.equals("камень") && opponentValue.equals("ножницы"))
                || (userValue.equals("ножницы") && opponentValue.equals("бумага"))
                || (userValue.equals("бумага") && opponentValue.equals("камень"))) {
            result = "Победа";
            System.out.println("Результат: " + result);
        } else {
            result = "Поражение";
            System.out.println("Результат: " + result);
        }
    }


}
