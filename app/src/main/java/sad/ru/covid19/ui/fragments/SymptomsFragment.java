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

public class SymptomsFragment extends Fragment {

    @BindView(R.id.mainBlock)
    LinearLayout mainBlock;

    public SymptomsFragment() {
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
        View view = inflater.inflate(R.layout.fragment_syms, container, false);
        ButterKnife.bind(this, view);
        initLocale(view.getContext());

        mainBlock.removeAllViews();
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.syms_1)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.syms_2)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.syms_3)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.syms_4)));

        return view;
    }
}
