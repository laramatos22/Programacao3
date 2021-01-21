package aula13.ex2.plugins;

import aula13.ex2.IPlugin;

public class Plugin1 implements IPlugin {
	
	@Override
	public void fazQualQuerCoisa() {
		System.out.println("Plugin1");
	}

}
