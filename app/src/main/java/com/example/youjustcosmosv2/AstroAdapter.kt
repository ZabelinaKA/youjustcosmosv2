package com.example.youjustcosmosv2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youjustcosmosv2.databinding.AstronautItemBinding

class AstoAdapter (var astronauts: List<Astronaut>) : RecyclerView.Adapter<AstoAdapter.AstronautViewHolder>(){

    var clickListener: AstroClickListener? = null

    interface AstroClickListener{
        fun onAstroClick(id: Int)
    }

    class AstronautViewHolder(
        private val binding: AstronautItemBinding,
        private val listener: AstroClickListener?):
        RecyclerView.ViewHolder(binding.root) {
        Astronaut){
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AstronautViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.astronaut_item,parent,false)
        return AstronautViewHolder(view)
    }

    override fun onBindViewHolder(holder: AstronautViewHolder, position: Int) {
        holder.bind(astronauts[position])
    }

    override fun getItemCount(): Int {
        return astronauts.size
    }
}
