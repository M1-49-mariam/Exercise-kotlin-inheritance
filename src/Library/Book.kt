package Library

open class Book(val title: String, val author: String, val iSBN: Int) {

    fun displayInfo(){
        println("Title: $title, Author: $author, ISBN: $iSBN")
    }
}