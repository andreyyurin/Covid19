package sad.ru.covid19handbook.helpers;

import android.text.Html;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import sad.ru.covid19handbook.R;

import static sad.ru.covid19handbook.App.getContext;

/**
 * @author Velkonost
 */
public class TextViewHelper {

    public static TextView initTv(String text) {
        TextView tv = new TextView(getContext());
        tv.setTextSize(16);
        tv.setTextColor(ContextCompat.getColor(getContext(), R.color.colorBlack));
        tv.setText(Html.fromHtml(text));

        return tv;
    }
}
