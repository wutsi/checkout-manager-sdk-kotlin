package com.wutsi.checkout.manager.dto

import kotlin.Int
import kotlin.Long
import kotlin.String

public data class CheckoutRequest(
  public val deviceType: String? = null,
  public val channelType: String? = null,
  public val businessId: Long = 0,
  public val customerId: Long? = null,
  public val customerName: String = "",
  public val customerEmail: String = "",
  public val paymentMethodToken: String? = null,
  public val paymentMethodType: String? = null,
  public val paymentProviderId: Long? = null,
  public val paymenMethodNumber: String? = null,
  public val productId: Long = 0,
  public val quantity: Int = 0,
  public val notes: String? = null,
  public val idempotencyKey: String = "",
)
