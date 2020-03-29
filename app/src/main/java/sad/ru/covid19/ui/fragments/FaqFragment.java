package sad.ru.covid19.ui.fragments;

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
import sad.ru.covid19.R;
import sad.ru.covid19.helpers.LocaleHelper;

import static sad.ru.covid19.helpers.TextViewHelper.initTv;

public class FaqFragment extends Fragment {

    @BindView(R.id.mainBlock)
    LinearLayout mainBlock;

    public FaqFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void initLocale(Context ctx) {
        Resources res = ctx.getResources();
        Configuration conf = res.getConfiguration();
        conf.setLocale(new Locale(LocaleHelper.getLanguage(mainBlock.getContext())));
        res.updateConfiguration(conf, res.getDisplayMetrics());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faq, container, false);
        ButterKnife.bind(this, view);
        initLocale(view.getContext());

        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_1)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_2)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_3)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_4)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_5)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_6)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_7)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_8)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_9)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_10)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_11)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_12)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_13)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_14)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_15)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_16)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_17)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_18)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_19)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_20)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_21)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_22)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_23)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_24)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_25)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_26)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_27)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_28)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_29)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_30)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_31)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_32)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_33)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_34)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_35)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_36)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_37)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.faq_38)));

        return view;
    }
}
