package me.uaua

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

data class Bode(val hello: String)
@Controller("/uauaBackend")
class UauaBackendController {

    @Get("/")
    fun index() = Bode("world")
}