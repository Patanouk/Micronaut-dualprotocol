package com.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Status;

import static io.micronaut.http.HttpStatus.OK;

@Controller("/hello")
public class HelloWorldController {

    @Get()
    @Status(OK)
    String helloWorld() {
        return "Hello World";
    }

    @Post()
    @Status(OK)
    String postHelloWorld(@Body final String body) {
        return body;
    }

}
