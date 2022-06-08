package br.com.igti.mvvmgithub.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.igti.mvvmgithub.data.api.ApiHelper
import br.com.igti.mvvmgithub.data.repository.MainRepository
import br.com.igti.mvvmgithub.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("não encontrado essa classe")
    }
}