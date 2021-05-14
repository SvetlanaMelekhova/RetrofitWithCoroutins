package by.svetlana.project.coroutinswithretrofit.data.repository

import by.svetlana.project.coroutinswithretrofit.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}