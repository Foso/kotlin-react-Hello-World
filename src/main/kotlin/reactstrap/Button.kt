package reactstrap

import org.w3c.dom.events.Event
import kotlin.js.*
import react.*


@JsModule("reactstrap/lib/Button")
external val ButtonImport: dynamic

class ButtonColor(){
   companion object {
       val Primary = "primary"
       val Danger = "danger"
       val Succes = "success"
       val Info = "info"
       val Secondary="secondary"
       val Link = "link"
       val Warning = "warning"
   }
}

var Button: RClass<ButtonProps> = ButtonImport.default


external interface ButtonProps : RProps {
    var color: String? get() = definedExternally; set(value) = definedExternally
    var onClick : (Event) -> Unit




}


