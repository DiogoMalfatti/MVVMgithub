package br.com.igti.mvvmgithub.data.api

import br.com.igti.mvvmgithub.data.model.User
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single

class ApiServiceImplement : ApiService {
    override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get("https://api.github.com/users/DiogoMalfatti/followers?page=1per_page=1000")
            .build()
            .getObjectListSingle(User::class.java)
    }
}