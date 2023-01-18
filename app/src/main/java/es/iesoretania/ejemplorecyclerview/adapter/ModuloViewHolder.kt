package es.iesoretania.ejemplorecyclerview.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import es.iesoretania.ejemplorecyclerview.R
import es.iesoretania.ejemplorecyclerview.databinding.ItemModuloBinding
import es.iesoretania.ejemplorecyclerview.datos.Modulo
import es.iesoretania.ejemplorecyclerview.datos.ModuloDatos

class ModuloViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val binding = ItemModuloBinding.bind(view)

    fun render(modulo: Modulo){
        binding.textViewNombre.text = modulo.nombre
        binding.textViewCurso.text = modulo.curso
        binding.textViewCiclo.text = modulo.ciclo
        Glide.with(binding.imageViewModulo.context).load(modulo.urlImagen).into(binding.imageViewModulo)
    }
}