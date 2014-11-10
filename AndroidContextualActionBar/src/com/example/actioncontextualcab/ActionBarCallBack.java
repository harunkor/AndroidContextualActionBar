package com.example.actioncontextualcab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

@SuppressLint("NewApi")
public class ActionBarCallBack implements Callback {

	private Context c;

	public ActionBarCallBack(Context context) {
		c = context;
	}

	@Override
	public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.item_delete:
			Toast.makeText(c, "Delete Button Click !", Toast.LENGTH_LONG)
					.show();
			mode.finish();
			return true;
		case R.id.item_copy:
			Toast.makeText(c, "Copy Button Click !", Toast.LENGTH_LONG).show();
			mode.finish();
			return true;
		case R.id.item_info:
			Toast.makeText(c, "Info Button Click !", Toast.LENGTH_LONG).show();
			mode.finish();
			return true;
		case R.id.item_share:
			Toast.makeText(c, "Share Button Click !", Toast.LENGTH_LONG).show();
			mode.finish();
			return true;
		default:

			return false;
		}

	}

	@Override
	public boolean onCreateActionMode(ActionMode mode, Menu menu) {
		// TODO Auto-generated method stub
		mode.getMenuInflater().inflate(R.menu.contextual_menu, menu);
		return true;
	}

	@Override
	public void onDestroyActionMode(ActionMode arg0) {
		// TODO Auto-generated method stub
		// OK action bar
		Toast.makeText(c, " ActionMode Status Finish !", Toast.LENGTH_LONG)
				.show();
	}

	@Override
	public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
		// TODO Auto-generated method stub
		mode.setTitle("1");
		return false;
	}

}
