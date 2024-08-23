package com.griffinkingofants

import com.griffinkingofants.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureAdministration()
    configureSockets()
    configureSerialization()
    configureDatabases()
    configureTemplating()
    configureHTTP()
    configureRouting()
}
