/**
 * References
 **/

fun main() {
    val ref = """
        https://www.jetbrains.com/help/education/learner-start-guide.html?section=Kotlin%20Koans
        https://play.kotlinlang.org/?_ga=2.145298160.573850434.1563772964-1086510553.1553138630#eyJ2ZXJzaW9uIjoiMS4zLVJDIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJmb2xkZWRCdXR0b24iOnRydWUsInJlYWRPbmx5IjpmYWxzZSwiY29kZSI6ImZ1biBtYWluKCkge1xuXHR2YWwgdGV4dDEgPSBcIlwiXCJcbiAgICAgICAgSSBkbyBteSB0aGluZyBhbmQgeW91IGRvIHlvdXIgdGhpbmcuXG4gICAgICAgIEkgYW0gbm90IGluIHRoaXMgd29ybGQgdG8gbGl2ZSB1cCB0byB5b3VyIGV4cGVjdGF0aW9ucyxcbiAgICAgICAgQW5kIHlvdSBhcmUgbm90IGluIHRoaXMgd29ybGQgdG8gbGl2ZSB1cCB0byBtaW5lLlxuICAgICAgICBZb3UgYXJlIHlvdSwgYW5kIEkgYW0gSSxcbiAgICAgICAgYW5kIGlmIGJ5IGNoYW5jZSB3ZSBmaW5kIGVhY2ggb3RoZXIsIGl0J3MgYmVhdXRpZnVsLiBcbiAgICAgICAgSWYgbm90LCBpdCBjYW4ndCBiZSBoZWxwZWQuXG4gICAgXCJcIlwiLnRyaW1JbmRlbnQoKVxuICAgIHZhbCB0ZXh0MiA9IFwiXCJcIlxuICAgIFx0fEkgZG8gbXkgdGhpbmcgYW5kIHlvdSBkbyB5b3VyIHRoaW5nLlxuXHRcdHxJIGFtIG5vdCBpbiB0aGlzIHdvcmxkIHRvIGxpdmUgdXAgdG8geW91ciBleHBlY3RhdGlvbnMsXG5cdFx0fEFuZCB5b3UgYXJlIG5vdCBpbiB0aGlzIHdvcmxkIHRvIGxpdmUgdXAgdG8gbWluZS5cblx0XHR8WW91IGFyZSB5b3UsIGFuZCBJIGFtIEksXG5cdFx0fGFuZCBpZiBieSBjaGFuY2Ugd2UgZmluZCBlYWNoIG90aGVyLCBpdCdzIGJlYXV0aWZ1bC4gXG5cdFx0fElmIG5vdCwgaXQgY2FuJ3QgYmUgaGVscGVkLlxuICAgIFwiXCJcIi50cmltTWFyZ2luKCkgXG4gICAgcHJpbnRsbih0ZXh0MSA9PSB0ZXh0MilcbiAgICBwcmludGxuKHRleHQxKVxufSJ9
        https://play.kotlinlang.org/?_ga=2.145298160.573850434.1563772964-1086510553.1553138630#eyJ2ZXJzaW9uIjoiMS4zLVJDIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJmb2xkZWRCdXR0b24iOnRydWUsInJlYWRPbmx5IjpmYWxzZSwiY29kZSI6ImZ1biBtYWluKCkge1xuXHR2YWwgdGV4dDEgPSBcIlwiXCJcbiAgICAgICAgSSBkbyBteSB0aGluZyBhbmQgeW91IGRvIHlvdXIgdGhpbmcuXG4gICAgICAgIEkgYW0gbm90IGluIHRoaXMgd29ybGQgdG8gbGl2ZSB1cCB0byB5b3VyIGV4cGVjdGF0aW9ucyxcbiAgICAgICAgQW5kIHlvdSBhcmUgbm90IGluIHRoaXMgd29ybGQgdG8gbGl2ZSB1cCB0byBtaW5lLlxuICAgICAgICBZb3UgYXJlIHlvdSwgYW5kIEkgYW0gSSxcbiAgICAgICAgYW5kIGlmIGJ5IGNoYW5jZSB3ZSBmaW5kIGVhY2ggb3RoZXIsIGl0J3MgYmVhdXRpZnVsLiBcbiAgICAgICAgSWYgbm90LCBpdCBjYW4ndCBiZSBoZWxwZWQuXG4gICAgXCJcIlwiLnRyaW1JbmRlbnQoKVxuICAgIHZhbCB0ZXh0MiA9IFwiXCJcIlxuICAgIFx0fEkgZG8gbXkgdGhpbmcgYW5kIHlvdSBkbyB5b3VyIHRoaW5nLlxuXHRcdHxJIGFtIG5vdCBpbiB0aGlzIHdvcmxkIHRvIGxpdmUgdXAgdG8geW91ciBleHBlY3RhdGlvbnMsXG5cdFx0fEFuZCB5b3UgYXJlIG5vdCBpbiB0aGlzIHdvcmxkIHRvIGxpdmUgdXAgdG8gbWluZS5cblx0XHR8WW91IGFyZSB5b3UsIGFuZCBJIGFtIEksXG5cdFx0fGFuZCBpZiBieSBjaGFuY2Ugd2UgZmluZCBlYWNoIG90aGVyLCBpdCdzIGJlYXV0aWZ1bC4gXG5cdFx0fElmIG5vdCwgaXQgY2FuJ3QgYmUgaGVscGVkLlxuICAgIFwiXCJcIi50cmltTWFyZ2luKCkgXG4gICAgcHJpbnRsbih0ZXh0MSA9PSB0ZXh0MilcbiAgICBwcmludGxuKHRleHQxKVxufSJ9
        https://play.kotlinlang.org/koans/overview
        https://kotlinlang.org/docs/reference/
        
        
    """.trimIndent()

    println("Reference:\n$ref")

    val podcasts = """
        http://talkingkotlin.com/
        
    """.trimIndent()

    println("Podcasts:\n$podcasts")

    val books = """
        https://www.atomickotlin.com/atomickotlin/
        https://leanpub.com/kotlin-for-android-developers
        https://www.manning.com/books/kotlin-in-action
        
    """.trimIndent()

    println("Books:\n$books")


    val slackChannel = """
        https://kotlinlang.slack.com/
    """.trimIndent()

    println("Slack Channel:\n$slackChannel")
}
