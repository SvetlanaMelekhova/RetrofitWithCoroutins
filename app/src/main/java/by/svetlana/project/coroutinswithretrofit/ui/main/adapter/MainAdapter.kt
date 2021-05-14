package by.svetlana.project.coroutinswithretrofit.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import by.svetlana.project.coroutinswithretrofit.R
import by.svetlana.project.coroutinswithretrofit.data.model.User
import com.bumptech.glide.Glide


class MainAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textViewUserEmail = itemView.findViewById<TextView>(R.id.textViewUserEmail)
        private val textViewUserName = itemView.findViewById<TextView>(R.id.textViewUserName)
        private val imageViewAvatar = itemView.findViewById<ImageView>(R.id.imageViewAvatar)

        fun bind(user: User) {
            itemView.apply {
                textViewUserName.text = user.userName
                textViewUserEmail.text = user.userEmail
                Glide.with(itemView.context)
                    .load(user.image)
                    .into(imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    fun addUsers(users: List<User>) {
        this.users.apply {
            clear()
            addAll(users)
        }

    }
}