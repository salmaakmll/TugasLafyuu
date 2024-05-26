package com.example.projekterbaru1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val productList: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productName = itemView.findViewById<TextView>(R.id.productName)
        private val productPrice = itemView.findViewById<TextView>(R.id.productPrice)
        private val productImage = itemView.findViewById<ImageView>(R.id.productImage)

        fun bind(product: Product) {
            productName.text = product.name
            productPrice.text = product.price
            productImage.setImageResource(product.imageResId)
        }
    }
}
