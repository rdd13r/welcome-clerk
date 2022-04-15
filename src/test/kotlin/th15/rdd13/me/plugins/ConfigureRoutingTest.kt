package th15.rdd13.me.plugins

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ConfigureRoutingTest {

    @Test
    fun testGet() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Hello, I'm a 'Welcome' clerk, and my name is Välkommen!", bodyAsText())
        }
    }
}