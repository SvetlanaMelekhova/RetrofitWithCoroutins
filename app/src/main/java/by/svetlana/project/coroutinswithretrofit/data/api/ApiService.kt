package by.svetlana.project.coroutinswithretrofit.data.api

import by.svetlana.project.coroutinswithretrofit.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}