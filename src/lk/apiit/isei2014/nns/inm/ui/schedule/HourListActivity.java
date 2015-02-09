package lk.apiit.isei2014.nns.inm.ui.schedule;

import lk.apiit.isei2014.nns.inm.R;
import lk.apiit.isei2014.nns.inm.R.id;
import lk.apiit.isei2014.nns.inm.datastore.Days;
import lk.apiit.isei2014.nns.inm.ui.contacts.ContactListActivity;
import lk.apiit.isei2014.nns.inm.ui.rules.RuleDetailActivity;
import lk.apiit.isei2014.nns.inm.ui.rules.RuleListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class HourListActivity extends FragmentActivity implements
		HourListFragment.Callbacks
{
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		Intent i;
		// Handle item selection
		switch (item.getItemId())
		{
			case R.id.Add_Rule:
				i = new Intent(getBaseContext(), RuleDetailActivity.class);
				startActivity(i);
				return true;
			case R.id.help:
				
				return true;
				
			case R.id.Contacts:
				i = new Intent(getBaseContext(), ContactListActivity.class);
				startActivity(i);
				return true;
			case R.id.Schedule:
				i = new Intent(getBaseContext(), DayListActivity.class);
				startActivity(i);
				return true;
			case R.id.Rules:
				i = new Intent(getBaseContext(), RuleListActivity.class);
				startActivity(i);
				return true;
				
			default:
				return super.onOptionsItemSelected(item);
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}
	
	public static final String	ARG_ITEM_ID	= "item_id";
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hour_list);
		
		if (getIntent().getStringExtra(ARG_ITEM_ID) != null)
		{
			((TextView) findViewById(id.DayOfWeek)).setText(Days.ITEM_MAP
					.get(getIntent().getStringExtra(ARG_ITEM_ID)).name);
		}
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	public void onHourSelect(String id)
	{
		Business b = new Business();
		
		b.show(getSupportFragmentManager(), getLocalClassName());
		
	}
	
	/**
	 * A placeholder fragment containing a simple view.
	 */
	
}
