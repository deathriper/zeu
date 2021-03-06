package org.zeu.controller;

import java.util.Date;

import android.content.Context;
import android.widget.Toast;

public class Util {

	public static void toast(Context context, String text) {
		Toast.makeText(context, text, Toast.LENGTH_LONG).show();
	}

	public static void isConnected(ZeuControllerActivity zeu, Network net) {
		toast(zeu, "connected: " + net.isConnected());
	}
	
	public static long timestamp() {
		Date date= new Date();
		return date.getTime();
	}
}
