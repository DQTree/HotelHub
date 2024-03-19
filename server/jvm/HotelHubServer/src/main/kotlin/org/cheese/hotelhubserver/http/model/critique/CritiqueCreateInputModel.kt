package org.cheese.hotelhubserver.http.model.critique

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class CritiqueCreateInputModel(
    @field:Min(1, message = "Must be between 1-5")
    @field:Max(5, message = "Must be between 1-5")
    val stars: Int,
    @field:Min(1, message = "Must be at least 1")
    val hotelId: Int,
    @field:NotBlank(message = "Must not be empty")
    @field:Size(max = 512, message = "Must be between 1-512 characters")
    val description: String
)