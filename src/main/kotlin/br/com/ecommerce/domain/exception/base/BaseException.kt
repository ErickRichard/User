package br.com.ecommerce.domain.exception.base

open class BaseException(
    message: String?,
    cause: Throwable? = null,
    val paramsError: Map<String, Any> = emptyMap(),
    open val status: Int = 500
) : RuntimeException(message, cause)