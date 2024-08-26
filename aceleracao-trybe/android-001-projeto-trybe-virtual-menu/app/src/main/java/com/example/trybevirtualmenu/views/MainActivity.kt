package com.example.trybevirtualmenu.views

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.adapters.ItemAdapter
import com.example.trybevirtualmenu.interfaces.ItemListener
import com.example.trybevirtualmenu.models.ItemDataBase

class MainActivity : AppCompatActivity(), ItemListener {
    private val itemList: RecyclerView by lazy { findViewById(R.id.main_menu) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ItemDataBase.getItems()
        val adapter = ItemAdapter(items)
        adapter.setItemListener(this)

        itemList.layoutManager = LinearLayoutManager(baseContext)
        itemList.adapter = adapter
    }

    override fun onItemClick(view: View, position: Int) {
        val it = Intent(baseContext, MenuItemDetailActivity::class.java)
        it.putExtra("item_id", position)
        startActivity(it)
    }
}
