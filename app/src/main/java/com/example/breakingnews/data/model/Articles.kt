package com.example.breakingnews.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(
    tableName = "articles"
)
data class Articles(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val source: Source?,
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?
): Serializable