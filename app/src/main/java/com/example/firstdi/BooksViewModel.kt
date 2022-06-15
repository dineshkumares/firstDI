package com.example.firstdi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BooksViewModel @Inject constructor(var repo: BooksRepo) : ViewModel() {
//    var booksList = MutableLiveData<List<Books>>()
    var booksList = MutableLiveData<List<Books>>()

    init {
//        booksList = MutableLiveData<List<Books>>()
        getBooks()
    }

    fun getBooks() {
        booksList.value = repo.getAllBooks()
    }
}