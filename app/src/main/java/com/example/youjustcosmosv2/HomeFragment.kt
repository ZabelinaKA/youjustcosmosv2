package com.example.youjustcosmosv2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.youjustcosmosv2.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home), AstoAdapter.AstroClickListener {
    private lateinit var binding: FragmentHomeBinding

    override fun onAstroClick(id: Int) {
        val action = HomeFragmentDirection.toDetails(Id)
        findNavController().navigate(action)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = AstoAdapter(listOfAstro)
        val recyclerView: RecyclerView = binding.recycler
        recyclerView.layoutManager = LinearLayoutManager(requireContext(),
            RecyclerView.VERTICAL,false)
        recyclerView.adapter = adapter
        binding.btnMap.setOnClickListener {
            val action = HomeFragmentDirections.toDetails(Id)
            findNavController().navigate(action)
        }
    }
}