package br.com.igti.mvvmgithub.data.api

import br.com.igti.mvvmgithub.data.model.User
import io.reactivex.Single


interface ApiService {
    fun getUsers(): Single<List<User>>
}