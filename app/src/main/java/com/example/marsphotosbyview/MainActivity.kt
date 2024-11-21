package com.example.marsphotosbyview

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.simplegrid.adapter.ImageAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var imageAdapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }


//        // ImageViewを取得
//        val imageView: ImageView = findViewById(R.id.imageView)
//
//        // Glideを使用して画像をロード
//        val imageUrl = "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg"
//        Glide.with(this).load(imageUrl).into(imageView)

//         URLリストを作成
        val imageUrls = listOf(
            "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg",
            "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg",
            "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg",
            "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg",
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2列のグリッド
        recyclerView.adapter = ImageAdapter(imageUrls)

//        recyclerView = findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = GridLayoutManager(this, 2)
//        imageAdapter = ImageAdapter(imageUrls)
//        recyclerView.adapter = imageAdapter
    }
}