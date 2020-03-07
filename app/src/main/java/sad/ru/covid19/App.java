package sad.ru.covid19;

import android.app.Application;
import android.content.Context;

/**
 * @author Velkonost
 */
public class App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
