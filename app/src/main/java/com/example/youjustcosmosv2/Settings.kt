package com.example.youjustcosmosv2

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.youjustcosmosv2.databinding.FragmentSettingsBinding
import com.example.youjustcosmosv2.databinding.FragmentSettingsBinding.*

class Settings : Fragment(R.layout.fragment_settings), AstroAdapter.AstroClickListener {
    private lateinit var binding: FragmentSettingsBinding

    override fun onAstroClick(id: Int) {
//        val action = FragmentSettingsBinding.toDetails(Id)
//        findNavController().navigate(action)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflate(inflater, container, false)
        return binding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val switch1 = binding.swSet1
//        val switch2 = binding.swSet2
//        val switch3 = binding.swSet3
//        val offSet: Int = 200
//
//        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (isChecked) {
//                val textOn = "Welcome to the dark side "
//                val toast1 = Toast.makeText(context, textOn, Toast.LENGTH_LONG)
//                toast1.setGravity(Gravity.CENTER, 0, offSet)
//                toast1.show()
//            } else {
//                val textOff = "Welcome to the dark side"
//                val toast1 = Toast.makeText(context, textOff, Toast.LENGTH_LONG)
//                toast1.setGravity(Gravity.CENTER, 0, offSet)
//                toast1.show()
//            }
//        }
//        switch2.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (isChecked) {
//                val textOn = "Вы перешли в режим для слабовидящих"
//                val toast1 = Toast.makeText(context, textOn, Toast.LENGTH_LONG)
//                toast1.setGravity(Gravity.CENTER, 0, offSet)
//                toast1.show()
//            } else {
//                val textOff = "Вы перешли в обычный режим"
//                val toast1 = Toast.makeText(context, textOff, Toast.LENGTH_LONG)
//                toast1.setGravity(Gravity.CENTER, 0, offSet)
//                toast1.show()
//            }
//        }
//        switch3.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (isChecked) {
//                val textOn = "Ваш язык успешно изменен"
//                val toast1 = Toast.makeText(context, textOn, Toast.LENGTH_LONG)
//                toast1.setGravity(Gravity.CENTER, 0, offSet)
//                toast1.show()
//            } else {
//                val textOff = "Ваш язык успешно изменен"
//                val toast1 = Toast.makeText(context, textOff, Toast.LENGTH_LONG)
//                toast1.setGravity(Gravity.CENTER, 0, offSet)
//                toast1.show()
//            }
//        }
//
//    }

}