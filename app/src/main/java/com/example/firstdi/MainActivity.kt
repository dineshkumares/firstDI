package com.example.firstdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val vm: BooksViewModel by viewModels()

//    val retro = ApiInterface.create()
//    val dao = AppDatabase.getInstance(this)?.userDao()!!
//    val mrepo = MainRepository(retro, dao)
//    vm = MainViewModel(mrepo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observeBooks()
    }

    fun observeBooks() {
        vm.booksList.observe(this){
            println(it)
        }
    }
}

//1. Bring in the dep

//    [Dagger/MissingBinding] com.example.firstdi.BooksRepo
//    cannot be provided without an @Provides-annotated method.
//    com.example.firstdi.BooksRepo is injected at
//    com.example.firstdi.BooksViewModel(repo)
//    com.example.firstdi.BooksViewModel is injected at
//    com.example.firstdi.BooksViewModel_HiltModules.BindsModule.binds(vm)
//    @dagger.hilt.android.internal.lifecycle.HiltViewModelMap
//    java.util.Map<java.lang.String,javax.inject.Provider<androidx.lifecycle.ViewModel>>
//    is requested at
//    dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint.getHiltViewModelMap()
//    [com.example.firstdi.HiltApp_HiltComponents.SingletonC → com.example.firstdi.HiltApp_HiltComponents.ActivityRetainedC → com.example.firstdi.HiltApp_HiltComponents.ViewModelC]
