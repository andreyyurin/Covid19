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

import static sad.ru.covid19.helpers.ImageViewHelper.initImg;
import static sad.ru.covid19.helpers.TextViewHelper.initTv;

public class ProfilaktikaFragment extends Fragment {

    @BindView(R.id.mainBlock)
    LinearLayout mainBlock;

    public ProfilaktikaFragment() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profi, container, false);
        ButterKnife.bind(this, view);


        mainBlock.removeAllViews();

        mainBlock.addView(initTv(getResources().getString(R.string.profi_1)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_2)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_3)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_4)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_5)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_6)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_7)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_8)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_9)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_10)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_11)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_12)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_13)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_14)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_15)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_16)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_17)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_18)));
        mainBlock.addView(initTv(getResources().getString(R.string.profi_19)));

        //TODO: ПРОВЕРИТЬ ПИКЧИ НА ЛОКАЛИ
        mainBlock.addView(initImg(R.drawable.ic_profi_1_ru));
        mainBlock.addView(initImg(R.drawable.ic_profi_2_ru));
        mainBlock.addView(initImg(R.drawable.ic_profi_3_ru));
        mainBlock.addView(initImg(R.drawable.ic_profi_4_ru));
        mainBlock.addView(initImg(R.drawable.ic_profi_5_ru));
        mainBlock.addView(initImg(R.drawable.ic_profi_6_ru));
        mainBlock.addView(initImg(R.drawable.ic_profi_7_ru));


        return view;
    }
}
