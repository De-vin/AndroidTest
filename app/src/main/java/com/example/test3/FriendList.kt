package com.example.test3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_friend_list.*

class FriendList : AppCompatActivity() {

    private val userList = ArrayList<User>()
    private val content: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend_list)
        supportActionBar?.hide()

        initUsers()
        val layoutManager = LinearLayoutManager(this)
        friendRecycleView.layoutManager = layoutManager
        val adapter = UserAdapter(userList)
        friendRecycleView.adapter = adapter

        adapter.setMyOnClickListener(object : UserAdapter.MyOnClickListener{
            override fun clickListener(position: Int) {
                Toast.makeText(content, "You click ${userList[position].Name}.",
                    Toast.LENGTH_SHORT).show()
                val intent = Intent(content,Message::class.java)
                startActivity(intent)
            }
        })
    }


    private fun initUsers() {
        userList.add(User("鹏","19215120435", R.drawable.img_1))
        userList.add(User("杰","19215120436", R.drawable.img_2))
        userList.add(User("帅","19215120437", R.drawable.img_3))
        userList.add(User("多","19215120438", R.drawable.img_4))
        userList.add(User("friend","19215120439", R.drawable.img_5))
        userList.add(User("friend","19215120440", R.drawable.img_6))
        userList.add(User("friend","19215120441", R.drawable.img_7))
        userList.add(User("friend","19215120442", R.drawable.img_8))
        userList.add(User("friend","19215120443", R.drawable.img_9))
        userList.add(User("friend","19215120444", R.drawable.img_10))
        userList.add(User("friend","19215120445", R.drawable.img_11))
        userList.add(User("friend","19215120446", R.drawable.img_12))
        userList.add(User("friend","19215120447", R.drawable.img_13))
        userList.add(User("friend","19215120448", R.drawable.img_14))
        userList.add(User("friend","19215120449", R.drawable.img_15))
        userList.add(User("friend","19215120450", R.drawable.img_16))
        userList.add(User("friend","19215120451", R.drawable.img_17))
        userList.add(User("friend","19215120452", R.drawable.img_18))
        userList.add(User("friend","19215120453", R.drawable.img_19))
        userList.add(User("friend","19215120454", R.drawable.img_20))
        userList.add(User("friend","19215120455", R.drawable.img_21))
        userList.add(User("friend","19215120456", R.drawable.img_22))
        userList.add(User("friend","19215120457", R.drawable.img_23))
        userList.add(User("friend","19215120458", R.drawable.img_24))
        userList.add(User("friend","19215120459", R.drawable.img_25))
        userList.add(User("friend","19215120460", R.drawable.img_26))
        userList.add(User("friend","19215120461", R.drawable.img_27))
        userList.add(User("friend","19215120462", R.drawable.img_28))
        userList.add(User("friend","19215120463", R.drawable.img_29))
        userList.add(User("friend","19215120464", R.drawable.img_30))
    }
}