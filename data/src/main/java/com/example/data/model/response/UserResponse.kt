package com.example.data.model.response

import com.example.domain.model.UserDomainModel
import kotlinx.serialization.Serializable


@Serializable
data class UserResponse(
    val id: Int?,
    val email: String,
    val username: String,
    val name: String
) {
    fun toDomainModel() = UserDomainModel(
        id = id,
        email = email,
        username = username,
        name = name
    )
}
