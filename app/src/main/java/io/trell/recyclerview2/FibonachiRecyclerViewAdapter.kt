package io.trell.recyclerview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonachiRecyclerViewAdapter(var numbersList:List<Int>):
RecyclerView.Adapter<FibonachiViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonachiViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.number_lists_item,parent,false)
        return FibonachiViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FibonachiViewHolder, position: Int) {
        holder.tvNumbers.text=numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }
}
class FibonachiViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumbers  =itemView.findViewById<TextView>(R.id.tvNumbers)
}