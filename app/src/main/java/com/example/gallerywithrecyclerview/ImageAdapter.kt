package com.example.gallerywithrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import coil.load
import com.example.gallerywithrecyclerview.databinding.ImageItemBinding

class ImageAdapter:ListAdapter<Image, ImageViewHolder>(comparator) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(ImageItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {


        getItem(position).let {
            holder.binding.dummyTV.text = it.imageName
            holder.binding.dummyImage.load(it.imageURL)
        }

    }

   companion object {
       var comparator = object : DiffUtil.ItemCallback<Image>(){
           override fun areItemsTheSame(oldItem: Image, newItem: Image): Boolean {
               return oldItem.imageURL == newItem.imageURL
           }

           override fun areContentsTheSame(oldItem: Image, newItem: Image): Boolean {
              return oldItem == newItem
           }

       }
   }
}