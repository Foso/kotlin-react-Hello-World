import app.app
import kotlinext.js.*
import react.dom.h1
import react.dom.render
import kotlin.browser.document
import kotlin.browser.window


fun main(args: Array<String>) {
   // kotlinext.js.require("bootstrap/dist/css/bootstrap.min.css")
    requireAll(require.context("kotlin", true, js("/\\.css$/")))
    window.onload = {

        render(document.getElementById("root")!!) {
            h1 { +"Hello World!" }
            app()
        }
    }
}
