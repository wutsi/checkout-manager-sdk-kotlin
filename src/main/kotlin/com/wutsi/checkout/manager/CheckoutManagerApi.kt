package com.wutsi.checkout.manager

import com.wutsi.checkout.manager.dto.AddPaymentMethodRequest
import com.wutsi.checkout.manager.dto.AddPaymentMethodResponse
import com.wutsi.checkout.manager.dto.CreateChargeRequest
import com.wutsi.checkout.manager.dto.CreateChargeResponse
import com.wutsi.checkout.manager.dto.CreateOrderRequest
import com.wutsi.checkout.manager.dto.CreateOrderResponse
import com.wutsi.checkout.manager.dto.GetBusinessResponse
import com.wutsi.checkout.manager.dto.GetOrderResponse
import com.wutsi.checkout.manager.dto.GetPaymentMethodResponse
import com.wutsi.checkout.manager.dto.GetTransactionResponse
import com.wutsi.checkout.manager.dto.SearchOrderRequest
import com.wutsi.checkout.manager.dto.SearchOrderResponse
import com.wutsi.checkout.manager.dto.SearchPaymentMethodRequest
import com.wutsi.checkout.manager.dto.SearchPaymentMethodResponse
import com.wutsi.checkout.manager.dto.SearchPaymentProviderRequest
import com.wutsi.checkout.manager.dto.SearchPaymentProviderResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Boolean
import kotlin.Long
import kotlin.String

public interface CheckoutManagerApi {
  @RequestLine("POST /v1/payment-providers/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchPaymentProvider(request: SearchPaymentProviderRequest):
      SearchPaymentProviderResponse

  @RequestLine("POST /v1/payment-methods")
  @Headers(value=["Content-Type: application/json"])
  public fun addPaymentMethod(request: AddPaymentMethodRequest): AddPaymentMethodResponse

  @RequestLine("POST /v1/payment-methods/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchPaymentMethod(request: SearchPaymentMethodRequest): SearchPaymentMethodResponse

  @RequestLine("GET /v1/payment-methods/{token}")
  @Headers(value=["Content-Type: application/json"])
  public fun getPaymentMethod(@Param("token") token: String): GetPaymentMethodResponse

  @RequestLine("GET /v1/businesses/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getBusiness(@Param("id") id: Long): GetBusinessResponse

  @RequestLine("POST /v1/orders")
  @Headers(value=["Content-Type: application/json"])
  public fun createOrder(request: CreateOrderRequest): CreateOrderResponse

  @RequestLine("GET /v1/orders/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getOrder(@Param("id") id: String): GetOrderResponse

  @RequestLine("POST /v1/orders/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchOrder(request: SearchOrderRequest): SearchOrderResponse

  @RequestLine("POST /v1/transactions/charge")
  @Headers(value=["Content-Type: application/json"])
  public fun createCharge(request: CreateChargeRequest): CreateChargeResponse

  @RequestLine("GET /v1/transactions/{id}?sync={sync}")
  @Headers(value=["Content-Type: application/json"])
  public fun getTransaction(@Param("id") id: String, @Param("sync") sync: Boolean? = null):
      GetTransactionResponse
}
