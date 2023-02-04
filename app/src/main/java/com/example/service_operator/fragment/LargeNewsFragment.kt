package com.example.service_operator.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.service_operator.viewmodel.LargeNewsViewModel
import com.example.service_operator.fragment.adapter.NewsAdapter
import com.example.service_operator.databinding.LargeNewsFragmentBinding
import com.example.service_operator.room.Entity.LargeNews

class LargeNewsFragment : Fragment() {
    private lateinit var binding: LargeNewsFragmentBinding
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var user: List<LargeNews>

    private lateinit var largeNewsViewModel: LargeNewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = LargeNewsFragmentBinding.inflate(layoutInflater)

        largeNewsViewModel = ViewModelProvider(this).get(LargeNewsViewModel::class.java)

        val largeNews = LargeNews(0, "dsafd")

        largeNewsViewModel.addUser(largeNews)

        largeNewsViewModel.readAllData.observe(viewLifecycleOwner, Observer { largeNews ->
            binding.rvNews.layoutManager = LinearLayoutManager(context)
            newsAdapter = NewsAdapter(largeNews)
            binding.rvNews.adapter = newsAdapter
        })


        return binding.root
    }
}