package lk.apiit.isei2014.nns.inm.ui.schedule;

import lk.apiit.isei2014.nns.inm.datastore.Hours;
import lk.apiit.isei2014.nns.inm.datastore.Hours.Hour;
import android.content.Context;
import android.widget.ArrayAdapter;

public class HoursAdapter extends ArrayAdapter<Hour>
{
	
	public HoursAdapter(Context context)
	{
		super(context, android.R.layout.simple_list_item_activated_1,
				android.R.id.text1, Hours.ITEMS);
		// TODO Auto-generated constructor stub
	}
}
