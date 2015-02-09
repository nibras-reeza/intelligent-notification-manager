package lk.apiit.isei2014.nns.inm.datastore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Rules
{
	
	/**
	 * An array of sample (dummy) items.
	 */
	public static List<Rule>		ITEMS		= new ArrayList<Rule>();
	
	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Rule>	ITEM_MAP	= new HashMap<String, Rule>();
	
	static
	{
		addItem(new Rule("Busy", "Work", "Important", "Calls", "Work", "Ring"));
		addItem(new Rule("Free", "Home", "Unimportant", "Calls", "Friends",
				"Ring"));
		addItem(new Rule("Busy", "Work", "Nuisance", "Calls", "Work", "Mute"));
	}
	
	public static void addItem(Rule item)
	{
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}
	
	/**
	 * A dummy item representing a piece of content.
	 */
	public static class Rule
	{
		private static int	idn	= 0;
		public String		id;
		public String		business;
		public String		place;
		public String		importance;
		public String		medium;
		public String		from;
		public String		action;
		
		private Rule(String business, String place, String importance,
				String medium, String from, String action)
		{
			super();
			idn++;
			this.id = Integer.toString(idn);
			this.business = business;
			this.place = place;
			this.importance = importance;
			this.medium = medium;
			this.from = from;
			this.action = action;
		}
		
		@Override
		public String toString()
		{
			return "If I'm " + business + " at " + place + " and an "
					+ importance + " contact from " + from + " " + medium
					+ " then, " + action;
		}
	}
}
