package dp.ws.popcorntime.ui.locale;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import dp.ws.popcorntime.PopcornApplication;

public abstract class LocaleFragmentActivity extends FragmentActivity implements LocaleListener {

	protected LocaleHelper mLocaleHelper;

	@Override
	protected void onCreate(Bundle arg0) {
		mLocaleHelper = new LocaleHelper((PopcornApplication) getApplication(), LocaleFragmentActivity.this);
		super.onCreate(arg0);
	}

	@Override
	protected void onResume() {
		super.onResume();
		mLocaleHelper.checkLanguage();
	}

	@Override
	public void updateLocaleText() {

	}
}