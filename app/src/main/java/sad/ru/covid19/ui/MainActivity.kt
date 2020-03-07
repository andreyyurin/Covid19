package sad.ru.covid19.ui

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import sad.ru.covid19.R
import sad.ru.covid19.helpers.LocaleHelper
import sad.ru.covid19.ui.fragments.*


class MainActivity : AppCompatActivity() {

    private lateinit var fm: FragmentManager
    private lateinit var active: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBottomView()
        initView()
        initLang()
        initSpinnerSelect()
        init()
    }

    private fun initBottomView() {
        fm = supportFragmentManager
    }

    private fun initView() {
        setContentView(R.layout.activity_main)
    }

    private fun init() {
        bottom_navigation.setOnNavigationItemSelectedListener(object :
            BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.faq -> {
                        fm.beginTransaction().replace(R.id.frame, FaqFragment(), "1")
                    }
                    R.id.info -> {
                        fm.beginTransaction().replace(R.id.frame, InfoFragment(), "1")
                    }
                    R.id.profi -> {
                        fm.beginTransaction().replace(R.id.frame, ProfilaktikaFragment(), "1")
                    }
                    R.id.syms -> {
                        fm.beginTransaction().replace(R.id.frame, SymptomsFragment(), "1")
                    }
                    R.id.more -> {
                        fm.beginTransaction().replace(R.id.frame, MoreFragment(), "1")
                    }
                    else -> fm.beginTransaction().replace(R.id.frame, InfoFragment(), "1")
                }


                return true
            }

        }
        )
    }

    private fun initLang() {
        LocaleHelper.setLocale(
            toolbar.context,
            LocaleHelper.getLanguage(toolbar.context)
        )


        val adapter =
            ArrayAdapter.createFromResource(
                this,
                R.array.lang_list,
                R.layout.spinner_item
            )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner_lang.adapter = adapter
    }

    private fun initSpinnerSelect() {


        spinner_lang.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

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
