package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGdxGame implements ApplicationListener {
	Stage stage;
	static Image verde;
	
	@Override
	public void create() {
		stage = new Stage();
		
		verde = new Image(new Texture("imagen.png"));
		stage.addActor(verde);
		verde.setX(0);
		
		MiObjeto o = new MiObjeto();
		stage.addActor(o);
		
		o.setX(400);
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {		
		stage.draw();
		stage.act();
		verde.setX(verde.getX()+2);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
