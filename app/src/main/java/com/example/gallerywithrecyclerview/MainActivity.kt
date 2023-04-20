package com.example.gallerywithrecyclerview


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Images
import com.example.gallerywithrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var imageList = listOf<Image>(

        Image("Selective Focus Photography of Red Poppy Flower\n",
            "https://images.pexels.com/photos/1463524/pexels-photo-1463524.jpeg"),
        Image("Blossoming flower with gentle petals on blue background\n",
            "https://images.pexels.com/photos/3880526/pexels-photo-3880526.jpeg"),
        Image("Bright blooming flower with spiky leaves in summer in garden\n",
            "https://images.pexels.com/photos/4166519/pexels-photo-4166519.jpeg"),
        Image("Person Holding Yellow Sunflower\n",
            "https://images.pexels.com/photos/1624076/pexels-photo-1624076.jpeg"),
        Image("Selective Focus Photography of Red Poppy Flower\n",
            "https://images.pexels.com/photos/1463524/pexels-photo-1463524.jpeg"),
        Image("Blossoming flower with gentle petals on blue background\n",
            "https://images.pexels.com/photos/3880526/pexels-photo-3880526.jpeg"),
        Image("Bright blooming flower with spiky leaves in summer in garden\n",
            "https://images.pexels.com/photos/4166519/pexels-photo-4166519.jpeg"),
        Image("Person Holding Yellow Sunflower\n",
            "https://images.pexels.com/photos/1624076/pexels-photo-1624076.jpeg")

    )

    lateinit var adapter : ImageAdapter




    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = ImageAdapter()

        adapter.submitList(imageList)


        binding.recyclerView.adapter = adapter

    }
}