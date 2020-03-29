package sad.ru.covid19.helpers;

import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.makeramen.roundedimageview.RoundedImageView;

import static sad.ru.covid19.App.getContext;

/**
 * @author Velkonost
 */
public class ImageViewHelper {

    public static RoundedImageView initImg(int resId) {
        RoundedImageView img1 = new RoundedImageView(getContext());
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        params.bottomMargin = (int) Converter.convertDipToPixels(10);
        img1.setLayoutParams(params);
        img1.setAdjustViewBounds(true);
        img1.setScaleType(ImageView.ScaleType.FIT_XY);
        img1.setCornerRadius(18);
        img1.setImageResource(resId);

        return img1;
    }
}
