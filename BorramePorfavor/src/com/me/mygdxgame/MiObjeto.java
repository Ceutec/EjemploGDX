package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MiObjeto extends Image
{
	public MiObjeto() {
		super(new Texture("enemigo.png"));
	}
	@Override
	public void act(float delta)
	{
		setX(getX()-1);
		
		if(getX()<=128+MyGdxGame.verde.getX())
			System.exit(0);
	}
}
