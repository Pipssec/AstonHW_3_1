package com.example.homework2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.databinding.ActivityMainBinding
import com.example.homework2.model.Flag


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var rvFlags: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        rvFlags = binding.rvFlags
        rvFlags.adapter = FlagsAdapter(createList())
    }


    fun createList(): List<Flag> {
        return listOf(
            Flag("https://www.megaflag.ru/sites/default/files/images/shop/products/flag_avstriya_enl.jpg", "Austria"),
            Flag("https://www.megaflag.ru/sites/default/files/images/directory_names/flag_polsha_enl.jpg", "Poland"),
            Flag("https://www.megaflag.ru/sites/default/files/images/directory_names/flag_italija_enl.jpg", "Italy"),
            Flag("https://www.megaflag.ru/sites/default/files/images/shop/products/flag_kolumbiya_new.jpg", "Colombia"),
            Flag("https://www.megaflag.ru/sites/default/files/images/shop/products/flag_madagaskar_new.jpg", "Madagascar"),
            Flag("https://www.megaflag.ru/sites/default/files/images/shop/products/flag_tailand_new.jpg", "Thailand"),
            Flag("https://www.megaflag.ru/sites/default/files/images/directory_names/flag_danija_enl.jpg", "Denmark"),
            Flag("https://www.megaflag.ru/sites/default/files/images/shop/products/flag_shvejtsarija_new.jpg", "Switzerland"),
        )
    }
}