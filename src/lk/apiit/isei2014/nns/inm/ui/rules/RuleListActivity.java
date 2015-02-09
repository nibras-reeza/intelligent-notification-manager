package lk.apiit.isei2014.nns.inm.ui.rules;

import lk.apiit.isei2014.nns.inm.R;
import lk.apiit.isei2014.nns.inm.ui.contacts.ContactListActivity;
import lk.apiit.isei2014.nns.inm.ui.schedule.DayListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * An activity representing a list of Rules. This activity has different
 * presentations for handset and tablet-size devices. On handsets, the activity
 * presents a list of items, which when touched, lead to a
 * {@link RuleDetailActivity} representing item details. On tablets, the
 * activity presents the list of items and item details side-by-side using two
 * vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link RuleListFragment} and the item details (if present) is a
 * {@link RuleDetailFragment}.
 * <p>
 * This activity also implements the required {@link RuleListFragment.Callbacks}
 * interface to listen for item selections.
 */
public class RuleListActivity extends FragmentActivity implements
		RuleListFragment.Callbacks
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
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rule_list);
		
		// TODO: If exposing deep links into your app, handle intents here.
	}
	
	/**
	 * Callback method from {@link RuleListFragment.Callbacks} indicating that
	 * the item with the given ID was selected.
	 */
	@Override
	public void onItemSelected(String id)
	{
		
		// In single-pane mode, simply start the detail activity
		// for the selected item ID.
		Intent detailIntent = new Intent(this, RuleDetailActivity.class);
		detailIntent.putExtra(RuleDetailFragment.ARG_ITEM_ID, id);
		startActivity(detailIntent);
		
	}
}
