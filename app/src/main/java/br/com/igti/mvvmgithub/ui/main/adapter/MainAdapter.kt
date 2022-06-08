package br.com.igti.mvvmgithub.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import br.com.igti.mvvmgithub.R
import br.com.igti.mvvmgithub.data.model.User
import com.bumptech.glide.Glide

class MainAdapter(private val users: ArrayList<User>) :
    RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            val textViewUserName = itemView.findViewById<AppCompatTextView>(R.id.textViewUserName)
            textViewUserName.text = user.login

            val textViewUserEmail = itemView.findViewById<AppCompatTextView>(R.id.textViewUserEmail)
            textViewUserEmail.text = user.url

            val imageViewAvatar = itemView.findViewById<ImageView>(R.id.imageViewAvatar)
            Glide.with(imageViewAvatar.context)
                .load(user.avatar)
                .into(imageViewAvatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}