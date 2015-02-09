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
public class Hours
{
	
	/**
	 * An array of sample (dummy) items.
	 */
	public static List<Hour>		ITEMS		= new ArrayList<Hour>();
	
	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Hour>	ITEM_MAP	= new HashMap<String, Hour>();
	
	static
	{
		for (int i = 0; i < 24; i++)
			addItem(new Hour(i + ":00 to " + (i + 1) + ":00"));
	}
	
	private static void addItem(Hour item)
	{
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}
	
	/**
	 * A dummy item representing a piece of content.
	 */
	public static class Hour
	{
		public String	id;
		
		public Hour(String id)
		{
			this.id = id;
			
		}
		
		@Override
		public String toString()
		{
			return id;
		}
	}
}
