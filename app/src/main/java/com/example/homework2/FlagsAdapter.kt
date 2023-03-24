package com.example.homework2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.databinding.FlagItemBinding
import com.example.homework2.model.Flag
import com.squareup.picasso.Picasso

class FlagsAdapter (private val list: List<Flag>): RecyclerView.Adapter<FlagsAdapter.ViewHolder>(){
    class ViewHolder(binding: FlagItemBinding): RecyclerView.ViewHolder(binding.root) {
        val pictureFlag = binding.ivRvFlag
        val nameFlag = binding.tvCountryName

        fun bind(flag: Flag, holder: ViewHolder) {
            nameFlag.text = flag.name
            Picasso.with(holder.itemView.context)
                .load(flag.picture)
                .fit()
                .error(R.drawable.baseline_error_24)
                .into(pictureFlag)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FlagItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position], holder)
    }

    override fun getItemCount(): Int = list.size
}