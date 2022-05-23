package com.codecademy.newsapp.mvvm.db

import androidx.room.TypeConverter
import com.codecademy.newsapp.mvvm.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source) : String{
        return source.name
    }
    @TypeConverter
    fun toSource(name : String) : Source {
        return Source(name,name)
    }
}