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
public class Days
{
	
	/**
	 * An array of sample (dummy) items.
	 */
	public static List<Day>			ITEMS		= new ArrayList<Day>();
	
	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Day>	ITEM_MAP	= new HashMap<String, Day>();
	
	static
	{
		// Add 3 sample items.
		addItem(new Day("1", "Monday"));
		addItem(new Day("2", "Tuesday"));
		addItem(new Day("3", "Wednesday"));
		addItem(new Day("4", "Thursday"));
		addItem(new Day("5", "Friday"));
		addItem(new Day("6", "Saturday"));
		addItem(new Day("7", "Sunday"));
	}
	
	private static void addItem(Day item)
	{
		ITEMS.add(item);
		ITEM_MAP.put(item.number, item);
	}
	
	/**
	 * A dummy item representing a piece of content.
	 */
	public static class Day
	{
		public String	number;
		public String	name;
		
		public Day(String id, String content)
		{
			this.number = id;
			this.name = content;
		}
		
		@Override
		public String toString()
		{
			return name;
		}
	}
}
