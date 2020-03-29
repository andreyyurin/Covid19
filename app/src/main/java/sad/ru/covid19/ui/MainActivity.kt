package sad.ru.covid19.ui

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import sad.ru.covid19.R
import sad.ru.covid19.helpers.LocaleHelper
import sad.ru.covid19.ui.fragments.*


class MainActivity : AppCompatActivity() {

    private lateinit var fm: FragmentManager
    private lateinit var active: Fragment

    private var infoFragment: InfoFragment? = null
    private var symsFragment: SymptomsFragment? = null
    private var profilaktikaFragment: ProfilaktikaFragment? = null
    private var faqFragment: FaqFragment? = null
    private var moreFragment: MoreFragment? = null
    private lateinit var customHandler: Handler

    private lateinit var mInterstitialAd: InterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        initMainLang()

        initLang()
        initBottomView()
        initSpinnerSelect()
        init()
        initAdMob()
        initHandler()
        //       initTimerAdvise()
    }

    private fun initMainLang() {
        LocaleHelper.setLocale(
            this,
            LocaleHelper.getLanguage(this)
        )
        Handler().postDelayed({
            //doSomethingHere()
        }, 100)
    }

    private fun initHandler() {
        customHandler = Handler()
        customHandler.postDelayed(updateTimerThread, 0)
    }

    private fun initTimerAdvise() {
        if (mInterstitialAd.isLoaded) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.loadAd(AdRequest.Builder().addTestDevice("91CF873F530C958EBBC647EB3C5679F1").build())
    }

    private val updateTimerThread: Runnable = object : Runnable {
        override fun run() { //write here whaterver you want to repeat
            runOnUiThread {
                initTimerAdvise()
                customHandler.postDelayed(this, 60000)
            }
        }
    }

    private fun initAdMob() {
        MobileAds.initialize(this, "ca-app-pub-8154277548860310~8115959590")

        RequestConfiguration.Builder().setTestDeviceIds(
            listOf("91CF873F530C958EBBC647EB3C5679F1")
        ).build()

        val adRequest: AdRequest =
            AdRequest.Builder().addTestDevice("91CF873F530C958EBBC647EB3C5679F1").build()
        adView.loadAd(adRequest)

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-8154277548860310/5577426164"
        mInterstitialAd.loadAd(AdRequest.Builder().addTestDevice("91CF873F530C958EBBC647EB3C5679F1").build())
    }

    private fun initBottomView() {
        fm = supportFragmentManager
        fm.beginTransaction().replace(R.id.frame, getInfoFragment()!!, "2").commit()
    }

    private fun initView() {
        setContentView(R.layout.activity_main)
    }

    private fun getInfoFragment(): InfoFragment? {
        if (infoFragment == null) infoFragment = InfoFragment()

        titleTv!!.text = getString(R.string.info_title)
        return infoFragment
    }

    private fun getSymsFragment(): SymptomsFragment? {
        if (symsFragment == null) symsFragment = SymptomsFragment()

        titleTv!!.text = getString(R.string.syms_title)
        return symsFragment
    }

    private fun getProfiFragment(): ProfilaktikaFragment? {
        if (profilaktikaFragment == null) profilaktikaFragment = ProfilaktikaFragment()

        titleTv!!.text = getString(R.string.profi_title)
        return profilaktikaFragment
    }

    private fun getFaqFragment(): FaqFragment? {
        if (faqFragment == null) faqFragment = FaqFragment()

        titleTv!!.text = getString(R.string.faq_title)

        return faqFragment
    }

    private fun getMoreFragment(): MoreFragment? {
        if (moreFragment == null) moreFragment = MoreFragment()

        titleTv!!.text = ""

        return moreFragment
    }

    private fun init() {
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.faq -> {
                    fm.beginTransaction().replace(R.id.frame, getFaqFragment()!!, "1").commit()
                }
                R.id.info -> {
                    fm.beginTransaction().replace(R.id.frame, getInfoFragment()!!, "2").commit()
                }
                R.id.profi -> {
                    fm.beginTransaction().replace(R.id.frame, getProfiFragment()!!, "3").commit()
                }
                R.id.syms -> {
                    fm.beginTransaction().replace(R.id.frame, getSymsFragment()!!, "4").commit()
                }
                R.id.more -> {
                    fm.beginTransaction().replace(R.id.frame, getMoreFragment()!!, "5").commit()
                }
                else -> fm.beginTransaction().replace(R.id.frame, getInfoFragment()!!, "2").commit()
            }

            true
        }
    }

    private fun initLang() {

        val adapter =
            ArrayAdapter.createFromResource(
                this,
                R.array.lang_list,
                R.layout.spinner_item
            )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner_lang.adapter = adapter
        titleTv!!.invalidate()
        frame.invalidate()
    }

    private fun initSpinnerSelect() {
        spinner_lang.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val chooseIds = resources.getStringArray(R.array.lang_list_ids)
                if (LocaleHelper.getLanguage(spinner_lang.context) != chooseIds[p3.toInt()] && chooseIds[p3.toInt()] != "0") {
                    LocaleHelper.setLocale(spinner_lang.context, chooseIds[p3.toInt()])
                    recreate()
                }
            }
        }
    }
}
