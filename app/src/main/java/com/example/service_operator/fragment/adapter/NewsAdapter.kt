package com.example.service_operator.fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.service_operator.databinding.ItemLargeNewBinding
import com.example.service_operator.room.Entity.LargeNews

class NewsAdapter(
    private val largeNewsList: List<LargeNews>
) : RecyclerView.Adapter<NewsAdapter.LargeNewsViewHolder>() {

    class LargeNewsViewHolder(
        private val binding: ItemLargeNewBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(largeNews: LargeNews) {
            binding.largeNews = largeNews
        }
    }

    private lateinit var binding: ItemLargeNewBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LargeNewsViewHolder {
        binding = ItemLargeNewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LargeNewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LargeNewsViewHolder, position: Int) {
        val largeNews = largeNewsList[position]
        holder.bind(largeNews)
    }

    override fun getItemCount(): Int = largeNewsList.size

}