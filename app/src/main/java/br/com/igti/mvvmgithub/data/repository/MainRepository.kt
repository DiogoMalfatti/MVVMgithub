package br.com.igti.mvvmgithub.data.repository

import br.com.igti.mvvmgithub.data.api.ApiHelper
import br.com.igti.mvvmgithub.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}