package sad.ru.covid19.ui

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import sad.ru.covid19.R
import sad.ru.covid19.helpers.LocaleHelper

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        initLang()
        initSpinnerSelect()
        init()
    }

    private fun initView() {
        setContentView(R.layout.activity_main)
    }

    private fun init() {
        menu_right.setOnClickListener {
            if (drawer_layout.isDrawerOpen(GravityCompat.END)) {
                drawer_layout.closeDrawer(GravityCompat.END)
            } else {
                drawer_layout.openDrawer(GravityCompat.END)
            }
        }

        nav_view.setNavigationItemSelectedListener(this)
    }

    private fun initLang() {
        LocaleHelper.setLocale(
            drawer_layout.context,
            LocaleHelper.getLanguage(drawer_layout.context)
        )

        nav_view.menu.clear()
        nav_view.inflateMenu(R.menu.navigation_menu)

        val adapter =
            ArrayAdapter.createFromResource(
                this,
                R.array.lang_list,
                android.R.layout.simple_spinner_item
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

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.account -> {
                Toast.makeText(this, "1", Toast.LENGTH_LONG).show()
            }
            R.id.settings -> {
                Toast.makeText(this, "2", Toast.LENGTH_LONG).show()
            }
            R.id.mycart -> {
                Toast.makeText(this, "3", Toast.LENGTH_LONG).show()
            }
        }

        if (drawer_layout.isDrawerOpen(GravityCompat.END)) {
            drawer_layout.closeDrawer(GravityCompat.END)
        }

        return true
    }
}
