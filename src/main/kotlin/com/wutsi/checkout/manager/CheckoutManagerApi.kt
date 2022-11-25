package com.wutsi.checkout.manager

import com.wutsi.checkout.manager.dto.AddPaymentMethodRequest
import com.wutsi.checkout.manager.dto.AddPaymentMethodResponse
import com.wutsi.checkout.manager.dto.GetPaymentMethodResponse
import com.wutsi.checkout.manager.dto.SearchPaymentMethodRequest
import com.wutsi.checkout.manager.dto.SearchPaymentMethodResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.String

public interface CheckoutManagerApi {
  @RequestLine("POST /v1/payment-methods")
  @Headers(value=["Content-Type: application/json"])
  public fun addPaymentMethod(request: AddPaymentMethodRequest): AddPaymentMethodResponse

  @RequestLine("POST /v1/payment-methods/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchPaymentMethod(request: SearchPaymentMethodRequest): SearchPaymentMethodResponse

  @RequestLine("GET /v1/payment-methods/{token}")
  @Headers(value=["Content-Type: application/json"])
  public fun getPaymentMethod(@Param("token") token: String): GetPaymentMethodResponse
}
