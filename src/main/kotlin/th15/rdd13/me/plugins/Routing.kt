package th15.rdd13.me.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Hello, I'm a 'Welcome' clerk, and my name is Välkommen!")
        }
    }
    routing {
    }
}
