package es.iesoretania.ejemplorecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.iesoretania.ejemplorecyclerview.R
import es.iesoretania.ejemplorecyclerview.datos.Modulo

class ModuloAdapter(val modulosLista: List<Modulo>) : RecyclerView.Adapter<ModuloViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuloViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ModuloViewHolder(layoutInflater.inflate(R.layout.item_modulo,parent))
    }

    override fun onBindViewHolder(holder: ModuloViewHolder, position: Int) {
        val item = modulosLista[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = modulosLista.size
}