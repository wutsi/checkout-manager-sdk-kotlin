package com.wutsi.checkout.manager.dto

import java.time.OffsetDateTime
import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class Order(
  public val id: String = "",
  public val shortId: String = "",
  public val deviceId: String? = null,
  public val deviceType: String? = null,
  public val channelType: String? = null,
  public val businessId: Long = 0,
  public val status: String = "",
  public val subTotalPrice: Long = 0,
  public val totalDiscount: Long = 0,
  public val totalPrice: Long = 0,
  public val totalPaid: Long = 0,
  public val balance: Long = 0,
  public val currency: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val cancelled: OffsetDateTime? = null,
  public val cancellationReason: String? = null,
  public val closed: OffsetDateTime? = null,
  public val notes: String? = null,
  public val customerId: Long? = null,
  public val customerName: String = "",
  public val customerEmail: String = "",
  public val items: List<OrderItem> = emptyList(),
  public val discounts: List<Discount> = emptyList(),
)