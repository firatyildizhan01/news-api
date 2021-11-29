package com.myproject.mynewsapp.db

import androidx.room.TypeConverter
import javax.xml.transform.Source
import javax.xml.transform.SourceLocator

class Conventers {

    @TypeConverter
    fun fromSource(source: com.myproject.mynewsapp.models.Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): com.myproject.mynewsapp.models.Source {
        return com.myproject.mynewsapp.models.Source(name, name)
    }
}