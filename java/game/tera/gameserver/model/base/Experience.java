package tera.gameserver.model.base;

import tera.Config;

/**
 * Таблица левел - экспа
 * 
 * @author Ronn Mod Evestu
 */
public abstract class Experience {

	// вбито для теры всё точно кто изменит данные убью
	public final static int LEVEL[] = {
		-1, // level 0 (не используется)
		0,
		840,
		1846,
		3048,
		4470,
		6145,
		8113,
		10410,
		13088,
		16197,
		17795,
		18952,
		20270,
		22820,
		25748,
		28633,
		31859,
		43702,
		52077,
		66490,
		94955,
		106448,
		129397,
		153355,
		164682,
		176358,
		251223,
		283342,
		350584,
		450475,
		592831,
		700643,
		840159,
		900823,
		1056869,
		1210194,
		1420956,
		1750218,
		2250220,
		2742201,
		3104154,
		3560755,
		4524245,
		6424027,
		8942319,
		10815896,
		14351495,
		16135907,
		18594712,
		22440436,
		25893136,
		27707107,
		30765345,
		34158159,
		37921882,
		42096768,
		46727412,
		51863218,
		151558828,
		264049598,
		449513049,
	};

	public static int getMaxLevel() {
		return Config.WORLD_PLAYER_MAX_LEVEL;
	}

	public static int getNextExperience(int currentLevel) {
		return LEVEL[currentLevel + 1];
	}
}