package lk.apiit.isei2014.nns.inm.ui.schedule;

import lk.apiit.isei2014.nns.inm.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;

public class Business extends DialogFragment
{
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState)
	{
		// Use the Builder class for convenient dialog construction
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		
		LayoutInflater li = getActivity().getLayoutInflater();
		
		builder.setView(li.inflate(R.layout.business_dialog, null))
				.setTitle("Edit Schedule")
				.setPositiveButton("Ok!", new DialogInterface.OnClickListener()
				{
					
					@Override
					public void onClick(DialogInterface dialog, int which)
					{
						dialog.dismiss();
						
					}
				})
				.setNegativeButton("Cancel?",
						new DialogInterface.OnClickListener()
						{
							
							@Override
							public void onClick(DialogInterface dialog,
									int which)
							{
								dialog.dismiss();
								
							}
						});
		Log.d(getTag(), getActivity().getLocalClassName());
		return builder.create();
	}
}
