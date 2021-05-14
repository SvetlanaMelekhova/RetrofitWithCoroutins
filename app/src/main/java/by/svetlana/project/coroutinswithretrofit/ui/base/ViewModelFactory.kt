package by.svetlana.project.coroutinswithretrofit.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import by.svetlana.project.coroutinswithretrofit.data.api.ApiHelper
import by.svetlana.project.coroutinswithretrofit.data.repository.MainRepository
import by.svetlana.project.coroutinswithretrofit.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}