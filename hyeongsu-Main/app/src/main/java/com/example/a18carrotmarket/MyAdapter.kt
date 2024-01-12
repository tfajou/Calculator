package com.example.a18carrotmarket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a18carrotmarket.databinding.ItemRecycleviewBinding

class MyAdapter(val mItems: MutableList<MyItem>): RecyclerView.Adapter<MyAdapter.Holder>() {

    interface ItemClick {
        fun onClick(view : View, position : Int)
    }

    interface ItemLongClick {
        fun onLongClick(view : View, position : Int)
    }

    var itemClick : ItemClick? = null
    var itemLongClick : ItemLongClick? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val binding = ItemRecycleviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener{
            itemClick?.onClick(it,position)
        }
        holder.iconImageView.setImageResource(mItems[position].Picture)
        holder.title.text = mItems[position].Name
        holder.price.text = mItems[position].Price.toString()
        holder.commentNum.text = mItems[position].Commet.toString()
        holder.heartNum.text = mItems[position].Heart.toString()
        holder.locate.text = mItems[position].Locate.toString()
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    inner class Holder(val binding: ItemRecycleviewBinding) : RecyclerView.ViewHolder(binding.root){
        val iconImageView = binding.iconitem1
        val title = binding.tvItemname
        val locate = binding.tvItemlocate
        val price = binding.tvPrice
        val commentNum = binding.commentNum
        val heartNum = binding.heartNum
    }
}

