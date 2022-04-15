package th15.rdd13.me

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import th15.rdd13.me.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
