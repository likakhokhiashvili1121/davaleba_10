package com.example.davaleba_10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.davaleba_10.databinding.ItemLayoutBinding

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){

    inner class ProductViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return  ProductViewHolder(
            ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
       val item = productList[position]
        holder.binding.apply {
            title.text = item.title
            price.text = item.price.toString() + "EUR"
            imige.setImageResource(item.image)
        }
    }

    override fun getItemCount(): Int = productList.size
    }
