package th15.rdd13.me

import io.ktor.server.testing.*
import th15.rdd13.me.plugins.configureRouting
import kotlin.test.Test

class ApplicationTest {

    @Test
    fun testRouteSet() = testApplication {
        application {
            configureRouting()
        }
    }
}