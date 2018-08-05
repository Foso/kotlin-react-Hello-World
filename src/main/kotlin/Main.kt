import react.dom.h1
import react.dom.render
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    window.onload = {
        render(document.getElementById("root")!!) {
            h1 { +"Hello World!" }
        }
    }
}
