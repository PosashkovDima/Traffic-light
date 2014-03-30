package com.example.example4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	public TextView tvInfo;
	public RelativeLayout relativeLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	public void buttonRedClick(View view) {

		relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
		tvInfo = (TextView) findViewById(R.id.textViewColor);

		tvInfo.setText(R.string.red);
		relativeLayout.setBackgroundResource(R.color.redColor);
	}

	public void buttonYellowClick(View v) {

		relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
		tvInfo = (TextView) findViewById(R.id.textViewColor);

		tvInfo.setText(R.string.yellow);
		relativeLayout.setBackgroundResource(R.color.yellowColor);
	}

	public void buttonGreenClick(View v) {

		relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
		tvInfo = (TextView) findViewById(R.id.textViewColor);

		tvInfo.setText(R.string.green);
		relativeLayout.setBackgroundResource(R.color.greenColor);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
