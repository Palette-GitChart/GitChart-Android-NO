package com.yongjincompany.data.util

import com.yongjincompany.domain.exception.basic.*
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class HttpHandler<T> {

    private lateinit var httpRequest: suspend () -> T
    private var onBadRequest: (message: String) -> Throwable = { BadRequestException() }
    private var onOtherHttpStatusCode: (code: Int, message: String) -> Throwable = { _, _ -> UnknownException() }

    fun httpRequest(httpRequest: suspend () -> T) =
        this.apply { this.httpRequest = httpRequest }

    fun onBadRequest(onBadRequest: (message: String) -> Throwable) =
        this.apply { this.onBadRequest = onBadRequest }

    fun onOtherHttpStatusCode(onOtherHttpStatusCode: (code: Int, message: String) -> Throwable) =
        this.apply { this.onOtherHttpStatusCode = onOtherHttpStatusCode }

    suspend fun sendRequest(): T =
        try {
            httpRequest()
        } catch (e: HttpException) {
            val code = e.code()
            val message = e.message()
            throw when (code) {
                400 -> onBadRequest(message)
                else -> onOtherHttpStatusCode(code, message)
            }
        } catch (e: UnknownHostException) {
            throw NoInternetException()
        } catch (e: SocketTimeoutException) {
            throw TimeoutException()
        } catch (e: Throwable) {
            throw UnknownException()
        }
}