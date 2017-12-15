package org.spaceinvaders.app;

import org.junit.Assert;
import org.junit.Test;
import org.spaceinvaders.app.Sprite;
import org.spaceinvaders.app.SpriteStore;

public class SpriteStoreTest {

	SpriteStore underTest;
	
	@Test
	public void test() {
		underTest = SpriteStore.get();
		
		Sprite sprite = underTest.getSprite("alien.gif");
		Assert.assertEquals(43, sprite.getWidth());
		Assert.assertEquals(29, sprite.getHeight());
	}

}

