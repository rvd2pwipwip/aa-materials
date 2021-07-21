package com.hdesrosiers.listmaker.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hdesrosiers.listmaker.MainActivity
import com.hdesrosiers.listmaker.R
import com.hdesrosiers.listmaker.TaskList
import com.hdesrosiers.listmaker.ui.detail.ui.detail.ListDetailFragment

class ListDetailActivity : AppCompatActivity() {

    lateinit var list: TaskList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_detail_activity)

        list = intent.getParcelableExtra(MainActivity.INTENT_LIST_KEY)!!
        title = list.name

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListDetailFragment.newInstance())
                .commitNow()
        }
    }
}