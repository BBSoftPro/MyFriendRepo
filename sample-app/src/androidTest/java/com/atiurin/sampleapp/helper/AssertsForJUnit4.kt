package com.atiurin.sampleapp.helper

fun assertAll(vararg assertions: () -> Unit) {
    val errors = mutableListOf<Throwable>()
    for (assertion in assertions) {
        try {
            assertion.invoke()
        } catch (error: Throwable) {
            errors.add(error)
        }
    }
    if (errors.isNotEmpty()) {
        val errorMessage = buildString {
            append("Multiple assertions failed:\n")
            errors.forEachIndexed { index, error ->
                append("${index + 1}: ")
                append(error.message)
                append("\n")
            }
        }
        throw AssertionError(errorMessage)
    }
}