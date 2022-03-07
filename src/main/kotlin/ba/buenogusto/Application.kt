package ba.buenogusto

import ba.buenogusto.model.UserSession
import ba.buenogusto.plugins.configureRouting
import ba.buenogusto.plugins.configureSerialization
import freemarker.cache.ClassTemplateLoader
import freemarker.core.HTMLOutputFormat
import io.ktor.application.*
import io.ktor.freemarker.*
import io.ktor.http.content.*
import io.ktor.routing.*
import io.ktor.sessions.*

/*fun main() {
    embeddedServer(Netty, port = 8080, host = "http://localhost") {
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}*/

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {

    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "files")
        outputFormat = HTMLOutputFormat.INSTANCE
    }

    install(Sessions) {
        cookie<UserSession>("user_session")
    }

    routing {

        static("/static") {
            resources("files")
        }

        static("/") {
            resources("files")
        }

        configureRouting()
        configureSerialization()
    }
}
