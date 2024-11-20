package com.agvber.core.domain.model

import java.time.LocalDateTime

data class User(
    val uid: String,
    val name: String,
    val stateMessage: String,
    val profileImageUrl: String?,
    val music: Music?,
    val birthdate: LocalDateTime,
    val profileUpdatedAt: LocalDateTime,
    val isRead: Boolean
) {

    data class Music(
        val title: String,
        val url: String
    )
}
