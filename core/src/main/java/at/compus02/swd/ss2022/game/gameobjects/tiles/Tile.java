package at.compus02.swd.ss2022.game.gameobjects.tiles;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Tile implements GameObject {
    protected Texture image;
    protected Sprite sprite;
    protected int width;
    protected int height;

    public Tile(String imageName, int width, int height) {
        this.image = new Texture(imageName);
        this.sprite = new Sprite(image);
        this.width = width;
        this.height = height;
    }
    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
