package com.dusek.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dusek.game.main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = main.WIDTH;
		config.height = main.HEIGHT;
		config.title = main.TITLE;
		new LwjglApplication(new main(), config);
	}
}
