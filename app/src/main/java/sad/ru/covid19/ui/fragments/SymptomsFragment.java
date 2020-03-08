package sad.ru.covid19.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import sad.ru.covid19.R;

import static sad.ru.covid19.helpers.TextViewHelper.initTv;

public class SymptomsFragment extends Fragment {

    @BindView(R.id.mainBlock)
    LinearLayout mainBlock;

    public SymptomsFragment() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_syms, container, false);
        ButterKnife.bind(this, view);

        mainBlock.removeAllViews();
        mainBlock.addView(initTv(getResources().getString(R.string.syms_1)));
        mainBlock.addView(initTv(getResources().getString(R.string.syms_2)));
        mainBlock.addView(initTv(getResources().getString(R.string.syms_3)));
        mainBlock.addView(initTv(getResources().getString(R.string.syms_4)));

        return view;
    }
}
