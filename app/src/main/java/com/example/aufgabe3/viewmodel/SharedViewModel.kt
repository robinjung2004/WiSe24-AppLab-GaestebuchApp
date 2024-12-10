package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aufgabe3.model.BookingEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class SharedViewModel: ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    fun addBookingEntry(bookingEntry: BookingEntry){
        val currentBookingsEntries = _bookingsEntries.value.orEmpty()
        _bookingsEntries.update { currentBookingsEntries ->
            currentBookingsEntries + bookingEntry
        }
    }

    fun deleteBookingEntry(bookingEntry: BookingEntry){
        val currentBookingsEntries = _bookingsEntries.value.orEmpty()
        _bookingsEntries.update { currentBookingsEntries ->
            currentBookingsEntries - bookingEntry
        }
    }
}