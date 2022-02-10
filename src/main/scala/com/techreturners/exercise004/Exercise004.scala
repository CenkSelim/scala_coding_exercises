package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime}

class Exercise004(var dateTime: LocalDateTime) {

  def this(date: LocalDate) = this(date.atStartOfDay())

  def getDateTimeWithGigaSecond: LocalDateTime = this.dateTime.plusSeconds(1000000000)
}
