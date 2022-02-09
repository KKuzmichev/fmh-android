package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Patient(
    val id: Int? = null,
    val firstName: String,
    val lastName: String,
    val middleName: String,
    val birthDate: Long,
    val currentAdmissionId: Int? = null
): Parcelable {
    enum class Status {
        ACTIVE,
        EXPECTED,
        DISCHARGED
    }
}
