package com.example.actioncontextualcab;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	// private ActionBarCallBack acb;
	private Button myBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myBtn = (Button) findViewById(R.id.button1);
		myBtn.setOnLongClickListener(new View.OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {

				MainActivity.this.startActionMode(new ActionBarCallBack(
						getApplicationContext()));
				return true;

			}
		});

	}

}

