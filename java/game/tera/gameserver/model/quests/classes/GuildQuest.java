package tera.gameserver.model.quests.classes;

import org.w3c.dom.Node;

import tera.gameserver.model.quests.QuestType;


/**
 * @author Ronn Mod Evestu
 */
public class GuildQuest extends AbstractQuest
{
	public GuildQuest(QuestType type, Node node)
	{
		super(type, node);
	}
}
