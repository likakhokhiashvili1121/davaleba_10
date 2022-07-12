package com.example.davaleba_10
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.davaleba_10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val productsAdapter: ProductAdapter by lazy {
        ProductAdapter()
    }

    private val categoryAdapter: ItemAdapter by lazy {
        ItemAdapter()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }

    private fun init() {
        Recycler()
        Onlisteners()
    }

    private fun Recycler() {
        binding.categories.adapter = categoryAdapter
        binding.items.adapter = productsAdapter
        selectedItmes.addAll(productList)
        ItemAdapter.notifyDataSetChanged()
    }

    private fun Onlisteners() {
        categoryAdapter.onCategoryClick = { category ->
            clickCategory(category)
        }
    }

    private fun clickCategory(category: Category) {
        selectedItmes.clear()
        productList.forEach {
            if (it.category.contains(category)) {
                selectedItmes.add(it)
            }
        }

        ItemAdapter.notifyDataSetChanged()

    }


}