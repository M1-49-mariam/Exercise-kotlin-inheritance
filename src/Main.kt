import Library.*


fun main() {
    var book1 = FictionBook("fiction", "author of book",
        12323, "Horror")
    var book2 = NonFictionBook("non fiction", "author of book",
        123, "history")
    book1.displayInfo()
    book1.getGenre()

    book2.displayInfo()
    book2.getSubject()

}