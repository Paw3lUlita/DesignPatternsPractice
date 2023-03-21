package pl.ulita.singleton_pattern;

public class GuessGame {

    private static GuessGame instance;
    public int score;

    public static GuessGame getInstance() {
        if(instance == null) {
            synchronized (GuessGame.class){
                if(instance == null) {
                    instance = new GuessGame();
                }

            }
        }
        return instance;
    }

    public void play() {
        this.score=3;
    }

    public int getScore() {
        return score;
    }
}
