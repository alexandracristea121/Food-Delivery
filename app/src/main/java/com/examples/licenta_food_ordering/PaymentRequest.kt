package com.examples.licenta_food_ordering

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

data class PaymentRequest(val amount: Long, val currency: String = "usd")

data class PaymentIntentResponse(val clientSecret: String)

interface ApiService {
    @POST("create-payment-intent")
    suspend fun createPaymentIntent(@Body request: PaymentRequest): Response<PaymentIntentResponse>
}