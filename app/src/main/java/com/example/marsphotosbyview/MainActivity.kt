package com.example.marsphotosbyview

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.simplegrid.adapter.ImageAdapter
import com.example.simplegrid.viewmodel.ImageViewModel
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var imageAdapter: ImageAdapter
    private val viewModel: ImageViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val topAppBar: MaterialToolbar = findViewById(R.id.topAppBar)
        topAppBar.setNavigationOnClickListener {
            // 戻るボタンやナビゲーションのアクションを設定
            onBackPressedDispatcher.onBackPressed()
        }

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        imageAdapter = ImageAdapter(emptyList())
        recyclerView.adapter = imageAdapter

        viewModel.images.observe(this, Observer { images ->
            imageAdapter.updateImages(images.map { it.url }) // URLリストを渡す
        })

        viewModel.fetchImages() // Retrofitを使用して画像を取得

    }
}