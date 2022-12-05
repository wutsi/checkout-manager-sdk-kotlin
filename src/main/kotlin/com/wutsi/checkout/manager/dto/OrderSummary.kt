package com.wutsi.checkout.manager.dto

import java.time.OffsetDateTime
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class OrderSummary(
  public val id: String = "",
  public val shortId: String = "",
  public val businessId: Long = 0,
  public val status: String = "",
  public val totalPrice: Long = 0,
  public val balance: Long = 0,
  public val currency: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val customerId: Long? = null,
  public val customerName: String = "",
  public val customerEmail: String = "",
  public val itemCount: Int = 0,
)
