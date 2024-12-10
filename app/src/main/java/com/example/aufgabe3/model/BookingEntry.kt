package com.example.aufgabe3.model

import java.time.LocalDate

// TODO Customise the data structure for a book entry according to the requirements
data class BookingEntry(
    val arrivalDate: LocalDate,
    val departureDate: LocalDate,
    val name: String
    )
