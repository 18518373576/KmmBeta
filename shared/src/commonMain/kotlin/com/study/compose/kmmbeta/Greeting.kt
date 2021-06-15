package com.study.compose.kmmbeta

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}