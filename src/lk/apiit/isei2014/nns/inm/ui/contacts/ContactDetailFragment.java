package lk.apiit.isei2014.nns.inm.ui.contacts;

import lk.apiit.isei2014.nns.inm.R;
import lk.apiit.isei2014.nns.inm.R.id;
import lk.apiit.isei2014.nns.inm.R.layout;
import lk.apiit.isei2014.nns.inm.datastore.ContactList;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * A fragment representing a single Contact detail screen. This fragment is
 * either contained in a {@link ContactListActivity} in two-pane mode (on
 * tablets) or a {@link ContactDetailActivity} on handsets.
 */
public class ContactDetailFragment extends Fragment
{
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String	ARG_ITEM_ID	= "item_id";
	
	/**
	 * The dummy content this fragment is presenting.
	 */
	private ContactList.Contact	mItem;
	
	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public ContactDetailFragment()
	{
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		if (getArguments().containsKey(ARG_ITEM_ID))
		{
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = ContactList.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		View rootView = inflater.inflate(R.layout.fragment_contact_detail,
				container, false);
		
		// Show the dummy content as text in a TextView.
		if (mItem != null)
		{
			
			((TextView) rootView.findViewById(R.id.ContactName))
					.setText(mItem.name);
			((TextView) rootView.findViewById(R.id.contactNumber))
					.setText(mItem.number);
			
			Spinner s = (Spinner) rootView.findViewById(R.id.category);
			switch (mItem.category.charAt(1))
			{
				case 'a':
					s.setSelection(0);
					break;
				case 'r':
					s.setSelection(1);
					break;
				case 'o':
					s.setSelection(2);
					break;
				case 'e':
					s.setSelection(3);
					break;
				case 'c':
					s.setSelection(4);
					break;
			}
			
		}
		
		return rootView;
	}
}
