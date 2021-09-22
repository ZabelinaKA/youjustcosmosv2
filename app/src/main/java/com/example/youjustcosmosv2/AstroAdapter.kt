package com.example.youjustcosmosv2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youjustcosmosv2.databinding.AstronautItemBinding

class AstroAdapter (var astronauts: List<Astronaut>)
    :RecyclerView.Adapter<AstroAdapter.AstronautViewHolder>(){

    var clickListener: AstroClickListener? = null

    interface AstroClickListener{
        fun onAstroClick(Id: Int)
    }
    override fun getItemCount(): Int {
        return astronauts.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AstronautViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AstronautItemBinding.inflate(
            inflater,
            parent,
            false
        )
        return AstronautViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: AstronautViewHolder, position: Int) {
        holder.bind(astronauts[position])
    }

    class AstronautViewHolder(
        private val binding: AstronautItemBinding,
        private val listener: AstroClickListener?):
        RecyclerView.ViewHolder(binding.root) {
        fun bind (astronaut: Astronaut){
            with(binding) {
                name.text = astronaut.Name
                date.text = astronaut.date
                country.text = astronaut.Country
                duration.text = astronaut.Duration
                spacecraft.text = astronaut.Spacecraft
                AstroCard.setOnClickListener {
                    listener?.onAstroClick(astronaut.Id)
                }
            }
        }
    }
}
