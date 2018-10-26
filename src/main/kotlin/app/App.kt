package app

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import reactstrap.Button
import reactstrap.ButtonColor


class App : RComponent<RProps, RState>() {


    override fun RBuilder.render() {
+"Hhh"
        Button{
            +"HHd"
            attrs {
                color= ButtonColor.Warning
            }
        }



    }
}

fun RBuilder.app() = child(App::class) {}


