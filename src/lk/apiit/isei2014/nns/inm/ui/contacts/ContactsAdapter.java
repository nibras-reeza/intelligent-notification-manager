package lk.apiit.isei2014.nns.inm.ui.contacts;

import lk.apiit.isei2014.nns.inm.datastore.ContactList;
import android.content.Context;
import android.widget.ArrayAdapter;

public class ContactsAdapter extends ArrayAdapter<ContactList.Contact>
{
	
	public ContactsAdapter(Context context)
	{
		super(context, android.R.layout.simple_list_item_activated_1,
				android.R.id.text1, ContactList.ITEMS);
		// TODO Auto-generated constructor stub
	}
}
