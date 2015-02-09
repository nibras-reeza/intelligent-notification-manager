package lk.apiit.isei2014.nns.inm.ui.rules;

import lk.apiit.isei2014.nns.inm.R;
import lk.apiit.isei2014.nns.inm.datastore.Rules;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

/**
 * A fragment representing a single Rule detail screen. This fragment is either
 * contained in a {@link RuleListActivity} in two-pane mode (on tablets) or a
 * {@link RuleDetailActivity} on handsets.
 */
public class RuleDetailFragment extends Fragment
{
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String	ARG_ITEM_ID	= "item_id";
	
	/**
	 * The dummy content this fragment is presenting.
	 */
	private Rules.Rule			mItem;
	
	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public RuleDetailFragment()
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
			mItem = Rules.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
		}
	}
	
	Spinner	business;
	Spinner	from;
	Spinner	action;
	Spinner	importance;
	Spinner	medium;
	Spinner	place;
	Button	ok;
	Button	cancel;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		View rootView = inflater.inflate(R.layout.fragment_rule_detail,
				container, false);
		
		business = ((Spinner) rootView.findViewById(R.id.rules_busy));
		from = ((Spinner) rootView.findViewById(R.id.from));
		action = ((Spinner) rootView.findViewById(R.id.action));
		importance = ((Spinner) rootView.findViewById(R.id.importance_level));
		medium = ((Spinner) rootView.findViewById(R.id.media));
		place = ((Spinner) rootView.findViewById(R.id.rules_place));
		ok = (Button) rootView.findViewById(R.id.button1);
		cancel = (Button) rootView.findViewById(R.id.button2);
		// Show the dummy content as text in a TextView.
		if (mItem != null)
		{
			ok.setText("Update!");
			ok.setOnClickListener(new View.OnClickListener()
			{
				
				@Override
				public void onClick(View v)
				{
					Intent intent = new Intent(getActivity().getBaseContext(),
							RuleListActivity.class);
					startActivity(intent);
					
				}
			});
			
			cancel.setOnClickListener(new View.OnClickListener()
			{
				
				@Override
				public void onClick(View v)
				{
					Intent intent = new Intent(getActivity().getBaseContext(),
							RuleListActivity.class);
					startActivity(intent);
					
				}
			});
		}
		
		return rootView;
	}
}
