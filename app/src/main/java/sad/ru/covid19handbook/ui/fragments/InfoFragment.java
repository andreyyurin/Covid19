package sad.ru.covid19handbook.ui.fragments;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import sad.ru.covid19handbook.R;
import sad.ru.covid19handbook.helpers.LocaleHelper;

import static sad.ru.covid19handbook.helpers.ImageViewHelper.initImg;
import static sad.ru.covid19handbook.helpers.TextViewHelper.initTv;

public class InfoFragment extends Fragment {

    @BindView(R.id.mainBlock)
    LinearLayout mainBlock;

    public InfoFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void initLocale(Context ctx){
        Resources res = ctx.getResources();
        Configuration conf = res.getConfiguration();
        conf.setLocale(new Locale(LocaleHelper.getLanguage(mainBlock.getContext())));
        res.updateConfiguration(conf, res.getDisplayMetrics());
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        ButterKnife.bind(this, view);

        initLocale(view.getContext());
        mainBlock.removeAllViews();

        mainBlock.addView(initImg(R.drawable.ic_info_1));

        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.info_1)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.info_2)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.info_3)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.info_4)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.info_5)));

        return view;
    }
}
