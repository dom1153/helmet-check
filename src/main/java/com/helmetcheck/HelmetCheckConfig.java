package com.helmetcheck;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface HelmetCheckConfig extends Config
{
	@ConfigItem(
		keyName = "helmetssss",
		name = "Helmet Checkr",
		description = "Checks if you have a freakin' helmet"
	)
	default String greeting()
	{
		return "Hello";
	}
}
