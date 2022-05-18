package com.example.wildberriesweekthree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wildberriesweekthree.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){

            btnFacebookConstrLay.setOnClickListener {
                openFragment(FaceBookConstrLayFragment.newInstance(), R.id.fragment)
            }

            btnCalcConstrLay.setOnClickListener {
                openFragment(CalcConstrLayFragment.newInstance(), R.id.fragment)
            }

            btnTelegramConstrLay.setOnClickListener {
                openFragment(TelegramConstrLayFragment.newInstance(), R.id.fragment)
            }

            btnPlayerConstrLay.setOnClickListener {
                openFragment(PlayerConstrLayFragment.newInstance(), R.id.fragment)
            }

            btnFacebookNoConstrLay.setOnClickListener {
                openFragment(FacebookNoConstrLayFragment.newInstance(), R.id.fragment)
            }

            btnCalcNoConstrLay.setOnClickListener {
                openFragment(CalcNoConstrLayFragment.newInstance(), R.id.fragment)
            }

            btnTelegramNoConstrLay.setOnClickListener {
                openFragment(TelegramNoConstrLayFragment.newInstance(), R.id.fragment)
            }

            btnPlayerNoConstrLay.setOnClickListener {
                openFragment(PlayerNoConstrLayFragment.newInstance(), R.id.fragment)
            }

        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }

    private fun openFragment(fragment: Fragment, idHolder: Int) {
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(idHolder, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
    }

}