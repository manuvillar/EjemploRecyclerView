package es.iesoretania.ejemplorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import es.iesoretania.ejemplorecyclerview.adapter.ModuloAdapter
import es.iesoretania.ejemplorecyclerview.databinding.ActivityMainBinding
import es.iesoretania.ejemplorecyclerview.datos.ModuloDatos

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerViewid.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewid.adapter = ModuloAdapter(ModuloDatos.ListaModulos)
    }
}