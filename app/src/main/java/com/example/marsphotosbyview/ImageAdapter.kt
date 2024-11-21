package com.example.simplegrid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marsphotosbyview.R
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class ImageAdapter(private var imageUrls: List<String>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageUrl = imageUrls[position]
//        Glide.with(holder.imageView.context).load(imageUrl).into(holder.imageView)
        Glide.with(holder.imageView.context)
            .load(imageUrl)
            .transform(RoundedCornersTransformation(16, 0)) // 半径16dpで角を丸める
            .into(holder.imageView)
    }

    fun updateImages(newImageUrls: List<String>) {
        imageUrls = newImageUrls
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = imageUrls.size
}


