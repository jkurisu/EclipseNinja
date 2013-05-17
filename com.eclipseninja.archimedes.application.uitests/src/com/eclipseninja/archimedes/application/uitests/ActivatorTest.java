package com.eclipseninja.archimedes.application.uitests;

import static org.junit.Assert.*;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class ActivatorTest {
	
	private static SWTBot bot;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		bot.sleep(2000);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		bot.menu("Archimedes").menu("Quit Archimedes").click();
	}

}
