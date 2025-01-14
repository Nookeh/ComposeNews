package ir.kaaveh.localdatasource.dto

import androidx.room.Entity

@Entity(tableName = "news", primaryKeys = ["title", "source"])
data class LocalNewsDto(
    val title: String,
    val author: String,
    val description: String,
    val publishedAt: String,
    val source: String,
    val url: String,
    val urlToImage: String,
    val isFavorite: Boolean
)