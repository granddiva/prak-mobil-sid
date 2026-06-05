package com.example.granddiva_aps.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.granddiva_aps.data.model.PhotoModel
import com.example.granddiva_aps.databinding.ItemPhotoBinding

class PhotoAdapter(private val photos: List<PhotoModel>) :
    RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder>() {

    class PhotoViewHolder(val binding: ItemPhotoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhotoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val photo = photos[position]
        holder.binding.tvAuthor.text = photo.author
        Glide.with(holder.itemView.context)
            .load(photo.download_url)
            .into(holder.binding.imgPhoto)
    }

    override fun getItemCount(): Int = photos.size
}
