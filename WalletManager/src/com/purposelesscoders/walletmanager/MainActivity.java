package com.purposelesscoders.walletmanager;

import android.os.Bundle;
import android.accounts.*;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		AccountManager am = AccountManager.get(getApplicationContext());
		Account[] acs = am.getAccounts();
		for (Account account : acs) {
			Log.d("banane", "type : " + account.type + "\nName : " + account.name);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
