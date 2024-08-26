package com.example.trybevirtualmenu.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.domain.Item
import com.example.trybevirtualmenu.interfaces.ItemListener

class ItemAdapter(val items: List<Item>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private var itemListener: ItemListener? = null

    fun setItemListener(listener: ItemListener) {
        this.itemListener = listener
    }

    class ItemViewHolder(view: View, itemListener: ItemListener?) : ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.item_menu_name)
        val image: ImageView = view.findViewById(R.id.item_menu_image)

        init {
            view.setOnClickListener {
                itemListener?.onItemClick(view, bindingAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_layout, parent, false)
        return ItemViewHolder(view, itemListener)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.name.text = items[position].name
        holder.image.setImageResource(items[position].image)
    }
}
