package com.example.kotlinchangedisplaytest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinchangedisplaytest.databinding.FragmentThreeBinding

class ThreeFragment : Fragment() {

    private var _binding : FragmentThreeBinding?= null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentThreeBinding.inflate(inflater, container, false)
        val rootView = binding.root

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mActivity = activity as MainActivity
        val changeB = _binding!!.threeButton
        changeB.setOnClickListener {
            mActivity.changeFragment(3)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}