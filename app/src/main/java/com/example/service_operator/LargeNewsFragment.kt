package com.example.service_operator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.service_operator.databinding.ItemLargeNewBinding.inflate
import com.example.service_operator.databinding.LargeNewsFragmentBinding

class LargeNewsFragment : Fragment() {
    private lateinit var binding: LargeNewsFragmentBinding
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var user: List<LargeNews>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = LargeNewsFragmentBinding.inflate(layoutInflater)

        userList()

        binding.rvNews.layoutManager = LinearLayoutManager(context)
        newsAdapter = NewsAdapter(user)
        binding.rvNews.adapter = newsAdapter

        return binding.root
    }

    private fun userList(){
        user = listOf(
            LargeNews("Harshita"),
            LargeNews("minu"),
            LargeNews("ram"),
            LargeNews("sham"),
        )
    }
}