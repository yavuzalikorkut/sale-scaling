package Abstract;

import Entity.Game;

public abstract class BaseGameManager implements GameService{

	@Override
	public void save(Game game) {
		System.out.println(game.getName()+" oyunu eklendi.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" oyununu güncellendi.");	
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" oyunu silindi.");
		
	}

	@Override
	public void addMultiple(Game[] games) {
		for (Game game : games) {
			save(game);
		}
	}

}
