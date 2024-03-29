package dp.ws.popcorntime.controller;

import dp.ws.popcorntime.R;
import dp.ws.popcorntime.database.tables.Favorites;
import dp.ws.popcorntime.model.videoinfo.VideoInfo;
import dp.ws.popcorntime.ui.locale.LocalePopupMenu;
import android.app.Activity;
import android.database.Cursor;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class FavoritesListener implements OnLongClickListener {

	private Activity activity;
	private VideoInfo info;

	public FavoritesListener(Activity activity, VideoInfo info) {
		this.activity = activity;
		this.info = info;
	}

	@Override
	public boolean onLongClick(View v) {
		LocalePopupMenu popup = new LocalePopupMenu(activity, v);
		popup.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				switch (item.getItemId()) {
				case R.id.popup_favorites_remove:
					Favorites.delete(activity, info);
					return true;
				case R.id.popup_favorites_add:
					Favorites.insert(activity, info);
					return true;
				default:
					return false;
				}
			}
		});

		Cursor cursor = activity.getContentResolver().query(Favorites.CONTENT_URI, null, Favorites._IMDB + "=\"" + info.imdb + "\"", null, null);
		if (cursor != null && cursor.getCount() > 0) {
			popup.inflate(R.menu.popup_favorites_yes);
		} else {
			popup.inflate(R.menu.popup_favorites_no);
		}
		cursor.close();

		popup.show();

		return true;
	}

}