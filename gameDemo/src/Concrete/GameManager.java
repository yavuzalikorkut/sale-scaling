package Concrete;

import Abstract.BaseGameManager;
import Entity.Game;

public class GameManager extends BaseGameManager{
    @Override
    public void save(Game game) {
        super.save(game);
    }

    @Override
    public void update(Game game) {
        super.update(game);
    }

    @Override
    public void delete(Game game) {
        super.delete(game);
    }

    @Override
    public void addMultiple(Game[] games) {
        super.addMultiple(games);
    }
}
