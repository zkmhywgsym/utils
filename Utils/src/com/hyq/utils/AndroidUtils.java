package com.hyq.utils;

import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.TextView;

public class AndroidUtils {
	public int getTextLenght(TextView textTV) {
		String textString = textTV.getText().toString();
		Rect bounds = new Rect();
		Paint textPaint = textTV.getPaint();
		textPaint.getTextBounds(textString, 0, textString.length(), bounds);
		return bounds.width();
	}
}
