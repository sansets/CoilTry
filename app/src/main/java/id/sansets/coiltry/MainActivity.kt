package id.sansets.coiltry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import id.sansets.coiltry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MainAdapter

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        initObserver()
    }

    private fun initRecyclerView() {
        adapter = MainAdapter()
        binding.rvMovie.adapter = adapter
    }

    private fun initObserver() {
        viewModel.movies.observe(this, Observer(adapter::submitList))
    }
}
