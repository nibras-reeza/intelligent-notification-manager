package lk.apiit.isei2014.nns.inm.ui.schedule;

import lk.apiit.isei2014.nns.inm.R;
import lk.apiit.isei2014.nns.inm.ui.contacts.ContactListActivity;
import lk.apiit.isei2014.nns.inm.ui.rules.RuleDetailActivity;
import lk.apiit.isei2014.nns.inm.ui.rules.RuleListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * An activity representing a list of Days. This activity has different
 * presentations for handset and tablet-size devices. On handsets, the activity
 * presents a list of items, which when touched, lead to a
 * {@link DayDetailActivity} representing item details. On tablets, the activity
 * presents the list of items and item details side-by-side using two vertical
 * panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link DayListFragment} and the item details (if present) is a
 * {@link DayDetailFragment}.
 * <p>
 * This activity also implements the required {@link DayListFragment.Callbacks}
 * interface to listen for item selections.
 */
public class DayListActivity extends FragmentActivity implements
		DayListFragment.Callbacks, HourListFragment.Callbacks

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
	
	/**
	 * Whether or not the activity is in two-pane mode, i.e. running on a tablet
	 * device.
	 */
	private boolean	mTwoPane;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_day_list);
		
		if (findViewById(R.id.day_detail_container) != null)
		{
			// The detail container view will be present only in the
			// large-screen layouts (res/values-large and
			// res/values-sw600dp). If this view is present, then the
			// activity should be in two-pane mode.
			mTwoPane = true;
			
			// In two-pane mode, list items should be given the
			// 'activated' state when touched.
			((DayListFragment) getSupportFragmentManager().findFragmentById(
					R.id.day_list)).setActivateOnItemClick(true);
		}
		
		// TODO: If exposing deep links into your app, handle intents here.
	}
	
	/**
	 * Callback method from {@link DayListFragment.Callbacks} indicating that
	 * the item with the given ID was selected.
	 */
	@Override
	public void onDaySelect(String id)
	{
		if (mTwoPane)
		{
			HourListFragment fragment = new HourListFragment();
			
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.day_detail_container, fragment).commit();
			
		}
		else
		{
			// In single-pane mode, simply start the detail activity
			// for the selected item ID.
			Intent detailIntent = new Intent(this, HourListActivity.class);
			detailIntent.putExtra(HourListActivity.ARG_ITEM_ID, id);
			startActivity(detailIntent);
		}
	}
	
	@Override
	public void onHourSelect(String id)
	{
		// TODO Auto-generated method stub
		
	}
}
