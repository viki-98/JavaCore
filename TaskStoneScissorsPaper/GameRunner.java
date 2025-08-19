package TaskStoneScissorsPaper;

public class GameRunner {
    public static void main(String[] args) {
        IGameLogic game = new GameLogicBasic();
        game.startGame();
    }
}
