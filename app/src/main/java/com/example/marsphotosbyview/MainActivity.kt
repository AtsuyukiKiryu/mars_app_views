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
//        val imageView: ImageView = findViewById(R.id.imageView2)
//
//        // Glideを使用して画像をロード
        val imageUrl = "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg"
//        Glide.with(this).load(imageUrl).into(imageView)


//
//        val testImageView = findViewById<ImageView>(R.id.testImageView)
//        Glide.with(this)
//            .load(imageUrl) // テスト用の画像URL
//            .into(testImageView)


// テキストデータのリストを作成
//        val items = List(20) { "Item #$it" } // "Item #0", "Item #1", ...
//
//        recyclerView = findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = GridLayoutManager(this, 2)
//        recyclerView.adapter = TextAdapter(items)


//         URLリストを作成
        val imageUrls = listOf(
            "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg",
            "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg",
            "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg",
            "https://ccsrpcml.carsensor.net/CSphoto/ml/026/842/UZ0047026842/UZ0047026842_13_001.jpg",
        )

//        val recyclerView: RecyclerView =
        recyclerView =    findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2列のグリッド
        recyclerView.adapter = ImageAdapter(imageUrls)

    }
}