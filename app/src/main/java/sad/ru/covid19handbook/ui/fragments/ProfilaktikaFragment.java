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

import java.util.ArrayList;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import sad.ru.covid19handbook.R;
import sad.ru.covid19handbook.helpers.LocaleHelper;

import static sad.ru.covid19handbook.helpers.ImageViewHelper.initImg;
import static sad.ru.covid19handbook.helpers.TextViewHelper.initTv;

public class ProfilaktikaFragment extends Fragment {

    @BindView(R.id.mainBlock)
    LinearLayout mainBlock;

    public ProfilaktikaFragment() {
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
        View view = inflater.inflate(R.layout.fragment_profi, container, false);
        ButterKnife.bind(this, view);

        initLocale(view.getContext());

        mainBlock.removeAllViews();

        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_1)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_2)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_3)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_4)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_5)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_6)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_7)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_8)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_9)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_10)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_11)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_12)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_13)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_14)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_15)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_16)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_17)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_18)));
        mainBlock.addView(initTv(view.getContext().getResources().getString(R.string.profi_19)));

        //TODO: ПРОВЕРИТЬ ПИКЧИ НА ЛОКАЛИ

        ArrayList<View> arrayList = new ArrayList<>();
        switch (LocaleHelper.getLanguage(mainBlock.getContext())) {
            case "ru":
                arrayList.add(initImg(R.drawable.ic_profi_1_ru));
                arrayList.add(initImg(R.drawable.ic_profi_2_ru));
                arrayList.add(initImg(R.drawable.ic_profi_3_ru));
                arrayList.add(initImg(R.drawable.ic_profi_4_ru));
                arrayList.add(initImg(R.drawable.ic_profi_5_ru));
                arrayList.add(initImg(R.drawable.ic_profi_6_ru));
                arrayList.add(initImg(R.drawable.ic_profi_7_ru));
                break;
            case "en":
                arrayList.add(initImg(R.drawable.ic_profi_1_en));
                arrayList.add(initImg(R.drawable.ic_profi_2_en));
                arrayList.add(initImg(R.drawable.ic_profi_3_en));
                arrayList.add(initImg(R.drawable.ic_profi_4_en));
                arrayList.add(initImg(R.drawable.ic_profi_5_en));
                arrayList.add(initImg(R.drawable.ic_profi_6_en));
                arrayList.add(initImg(R.drawable.ic_profi_7_en));
                arrayList.add(initImg(R.drawable.ic_profi_8_en));
                arrayList.add(initImg(R.drawable.ic_profi_9_en));
                break;
            case "zh":
                arrayList.add(initImg(R.drawable.ic_profi_1_zh));
                arrayList.add(initImg(R.drawable.ic_profi_2_zh));
                arrayList.add(initImg(R.drawable.ic_profi_3_zh));
                arrayList.add(initImg(R.drawable.ic_profi_4_zh));
                arrayList.add(initImg(R.drawable.ic_profi_5_zh));
                arrayList.add(initImg(R.drawable.ic_profi_6_zh));
                arrayList.add(initImg(R.drawable.ic_profi_7_zh));
                break;
            default:
                arrayList.add(initImg(R.drawable.ic_profi_1_ru));
                arrayList.add(initImg(R.drawable.ic_profi_2_ru));
                arrayList.add(initImg(R.drawable.ic_profi_3_ru));
                arrayList.add(initImg(R.drawable.ic_profi_4_ru));
                arrayList.add(initImg(R.drawable.ic_profi_5_ru));
                arrayList.add(initImg(R.drawable.ic_profi_6_ru));
                arrayList.add(initImg(R.drawable.ic_profi_7_ru));
                break;
        }
        switch (LocaleHelper.getLanguage(mainBlock.getContext())) {
            case "ru":
                mainBlock.addView(arrayList.get(0));
                mainBlock.addView(arrayList.get(1));
                mainBlock.addView(arrayList.get(2));
                mainBlock.addView(arrayList.get(3));
                mainBlock.addView(arrayList.get(4));
                mainBlock.addView(arrayList.get(5));
                mainBlock.addView(arrayList.get(6));
                break;
            case "en":
                mainBlock.addView(arrayList.get(0));
                mainBlock.addView(arrayList.get(1));
                mainBlock.addView(arrayList.get(2));
                mainBlock.addView(arrayList.get(3));
                mainBlock.addView(arrayList.get(4));
                mainBlock.addView(arrayList.get(5));
                mainBlock.addView(arrayList.get(6));
                mainBlock.addView(arrayList.get(7));
                mainBlock.addView(arrayList.get(8));
                break;
            case "zh":
                mainBlock.addView(arrayList.get(0));
                mainBlock.addView(arrayList.get(1));
                mainBlock.addView(arrayList.get(2));
                mainBlock.addView(arrayList.get(3));
                mainBlock.addView(arrayList.get(4));
                mainBlock.addView(arrayList.get(5));
                mainBlock.addView(arrayList.get(6));
                break;
            default:
                mainBlock.addView(arrayList.get(0));
                mainBlock.addView(arrayList.get(1));
                mainBlock.addView(arrayList.get(2));
                mainBlock.addView(arrayList.get(3));
                mainBlock.addView(arrayList.get(4));
                mainBlock.addView(arrayList.get(5));
                mainBlock.addView(arrayList.get(6));
                break;
        }
        return view;
    }
}
