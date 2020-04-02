package sad.ru.covid19handbook.helpers;

import android.util.DisplayMetrics;
import android.util.TypedValue;

import static sad.ru.covid19handbook.App.getContext;

/**
 * @author Velkonost
 */
public class Converter {

    public static float convertDipToPixels(float dips) {
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dips, metrics);
    }
}
