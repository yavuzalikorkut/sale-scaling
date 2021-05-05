package Abstract;

import Entity.Game;

public interface GameService {
    void save(Game game);
    void update(Game game);
    void delete(Game game);
    void addMultiple(Game[] games);
}
