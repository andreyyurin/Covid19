package sad.ru.covid19.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.makeramen.roundedimageview.RoundedImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import sad.ru.covid19.R;

import static sad.ru.covid19.helpers.TextViewHelper.initTv;

public class InfoFragment extends Fragment {

    @BindView(R.id.mainBlock)
    LinearLayout mainBlock;

    public InfoFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        ButterKnife.bind(this, view);

        mainBlock.removeAllViews();

        RoundedImageView img1 = new RoundedImageView(getContext());
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        img1.setLayoutParams(params);
        img1.setAdjustViewBounds(true);
        img1.setScaleType(ImageView.ScaleType.FIT_XY);
        img1.setCornerRadius(18);
        img1.setImageResource(R.drawable.ic_info_1);

        mainBlock.addView(img1);
        mainBlock.addView(initTv(getResources().getString(R.string.info_1)));
        mainBlock.addView(initTv(getResources().getString(R.string.info_2)));
        mainBlock.addView(initTv(getResources().getString(R.string.info_3)));
        mainBlock.addView(initTv(getResources().getString(R.string.info_4)));
        mainBlock.addView(initTv(getResources().getString(R.string.info_5)));

        return view;
    }
}
