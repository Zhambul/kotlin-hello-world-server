import io.vertx.core.Vertx

/**
 * Created by zhambyl on 23/11/2016.
 */

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        print("starting server")
        val server =  Vertx.vertx().createHttpServer()

        server.requestHandler {
            val resp = it.response()
            resp.putHeader("content-type", "text/plain");
            resp.end("Hello, World!")
        }

        server.listen(8081)
    }
}