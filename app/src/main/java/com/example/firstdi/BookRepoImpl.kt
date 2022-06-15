package com.example.firstdi

class BookRepoImpl : BooksRepo {
    override fun getAllBooks(): List<Books> {
        return listOf(
            Books(1,"Aaaaaaa"),
            Books(2,"Baaaaaa"),
            Books(3,"Caaaaaa"),
            Books(4,"Daaaaaa"),
            Books(5,"Eaaaaa")
        )
    }
}

//1. Dependency ( project level, module level)
//2. Create a app class that inherits Application
//3. Add the class to the manifest file

//1. Model
//2. Interface
//3. Repo



