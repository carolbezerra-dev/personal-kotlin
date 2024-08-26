package com.example.trybevirtualmenu.views

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.models.ItemDataBase

class MenuItemDetailActivity : AppCompatActivity() {
    private val name: TextView by lazy { findViewById(R.id.detail_name) }
    private val image: ImageView by lazy { findViewById(R.id.detail_image) }
    private val description: TextView by lazy { findViewById(R.id.detail_description) }
    private val price: TextView by lazy { findViewById(R.id.detail_price) }
    private val back: Button by lazy { findViewById(R.id.detail_back) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        back.setOnClickListener {
            finish()
        }

        val itemId = intent.getIntExtra("item_id", 0)
        val item = ItemDataBase.getItemBy(itemId)

        item?.image?.let { image.setImageResource(it) }
        item?.name?.let { name.text = it }
        item?.description?.let { description.text = it }
        item?.price?.let { price.text = it }
    }
}
