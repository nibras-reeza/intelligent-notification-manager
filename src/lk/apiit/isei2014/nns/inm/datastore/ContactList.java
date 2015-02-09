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
public class ContactList
{
	
	/**
	 * An array of sample (dummy) items.
	 */
	public static List<Contact>			ITEMS		= new ArrayList<Contact>();
	
	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Contact>	ITEM_MAP	= new HashMap<String, Contact>();
	
	static
	{
		// Add 3 sample items.
		addItem(new Contact("Nibras", "0779966375", "Important", "Personal"));
		addItem(new Contact("Nuzal", "123", "Neutral", "Friends"));
		addItem(new Contact("Senal", "456", "Unimportant", "Work"));
	}
	
	private static void addItem(Contact item)
	{
		ITEMS.add(item);
		ITEM_MAP.put(item.name, item);
	}
	
	/**
	 * A dummy item representing a piece of content.
	 */
	public static class Contact
	{
		public String	name;
		public String	number;
		public String	priority;
		public String	category;
		
		private Contact(String name, String number, String priority,
				String category)
		{
			super();
			this.name = name;
			this.number = number;
			this.priority = priority;
			this.category = category;
		}
		
		@Override
		public String toString()
		{
			return name;
		}
	}
}
