package com.example.jokegenerator

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request

class JokeService {
    private val client = OkHttpClient()
    private val gson = Gson()

    fun getRandomJoke(): Joke? {
        return try {
            val request = Request.Builder()
                .url("https://official-joke-api.appspot.com/random_joke")
                .build()

            val response = client.newCall(request).execute()
            if (response.isSuccessful) {
                val jsonBody = response.body?.string()
                if (!jsonBody.isNullOrEmpty()) {
                    gson.fromJson(jsonBody, Joke::class.java)
                } else {
                    null
                }
            } else {
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
