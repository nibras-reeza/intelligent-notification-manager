package lk.apiit.isei2014.nns.inm.ui.schedule;

import lk.apiit.isei2014.nns.inm.datastore.Days;
import lk.apiit.isei2014.nns.inm.datastore.Days.Day;
import android.content.Context;
import android.widget.ArrayAdapter;

public class DaysAdapter extends ArrayAdapter<Day>
{
	
	public DaysAdapter(Context context)
	{
		super(context, android.R.layout.simple_list_item_activated_1,
				android.R.id.text1, Days.ITEMS);
		
	}
	
}
