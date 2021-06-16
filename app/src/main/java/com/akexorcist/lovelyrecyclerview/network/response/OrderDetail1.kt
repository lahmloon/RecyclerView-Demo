package com.akexorcist.lovelyrecyclerview.network.response

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
//import kotlinx.parcelize.Parcelize

@Keep
//@Parcelize
data class OrderDetail1(
    @SerializedName("food_list")
    val foodList: MutableList<Food>?,
    @SerializedName("book_list")
    val bookList: MutableList<Book>?,
    @SerializedName("music_list")
    val musicList: MutableList<Music>?,
)
