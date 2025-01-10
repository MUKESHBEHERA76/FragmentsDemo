package com.harmonigate.fragmentsdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.harmonigate.fragmentsdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fragmentBtn1.setOnClickListener(){
            replacefragment(fragment1())
        }
        binding.fragmentBtn2  .setOnClickListener(){
            replacefragment(fragment2())
        }
    }
    private fun replacefragment(fragment :Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container_view,fragment)
        fragmentTransaction.commit()

    }
}