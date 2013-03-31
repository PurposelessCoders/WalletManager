package com.purposelesscoders.walletmanager;

import java.io.IOException;

import android.accounts.*;
import android.os.Bundle;
import android.util.Log;;

public class OnTokenAcquired implements AccountManagerCallback<Bundle> {
    @Override
    public void run(AccountManagerFuture<Bundle> result) {
		try {
			Bundle bundle = result.getResult();
	        String token = bundle.getString(AccountManager.KEY_AUTHTOKEN);
	        Log.d("On token acquired", "key:" + token);
		} catch (OperationCanceledException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AuthenticatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
