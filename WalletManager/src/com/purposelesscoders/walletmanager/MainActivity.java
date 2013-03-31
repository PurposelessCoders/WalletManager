package com.purposelesscoders.walletmanager;

import android.os.Bundle;
import android.os.Handler;
import android.accounts.*;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		AccountManager am = AccountManager.get(this);
		Account[] accounts = am.getAccountsByType("com.google");
		Account acc = null;
		
		//Il faudrait vérifier aussi s'il n'y a pas plusieurs comptes.
		//Dans ce cas las il faut demander à l'utilisateurs de choisir le compte à utiliser.
		if (accounts.length == 0)
		{
			Log.e("Google connect", "Accounts array is empty, there is probably no google account.");
			finish();
		}
		else 
		{
			acc = accounts[0];
			Log.d("Google connect", acc.name);
		}
		Bundle options = new Bundle();

		am.getAuthToken(acc, "Manage your wallets", options, this, new OnTokenAcquired(), new Handler(new OnError()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
