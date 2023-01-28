package com.example.service_operator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.service_operator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var user: List<LargeNews>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//
//        val recyclerViewNews = binding.rvNews
//        val largeNews = DummyData.getDummyData(this)
//        val newsAdapter = NewsAdapter(largeNews)
//
//        recyclerViewNews.adapter = newsAdapter
//        recyclerViewNews.layoutManager = LinearLayoutManager(this)
//        recyclerViewNews.setHasFixedSize(true)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        userList()
        binding.rvNews.layoutManager = LinearLayoutManager(this)
        newsAdapter = NewsAdapter(user)
        binding.rvNews.adapter = newsAdapter
    }

    private fun userList(){
        user = listOf(
            LargeNews("Harshita"),
            LargeNews("minu"),
            LargeNews("ram"),
            LargeNews("sham"),
            LargeNews("raja"),
            LargeNews("harsh"),
            LargeNews("harshu"),
            LargeNews("xyz"),
            LargeNews("abc"),
            LargeNews("pqr")
        )
    }
}