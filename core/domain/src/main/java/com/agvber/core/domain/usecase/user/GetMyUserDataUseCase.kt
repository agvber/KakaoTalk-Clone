package com.agvber.core.domain.usecase.user

import com.agvber.core.domain.fake.FAKE_IMAGE_URL
import com.agvber.core.domain.model.User
import java.time.LocalDateTime
import javax.inject.Inject

class GetMyUserDataUseCase @Inject constructor() {

    operator fun invoke(): User {
        return User(
            uid = "999",
            name = "Admin",
            stateMessage = "Feeling Happy",
            profileImageUrl = FAKE_IMAGE_URL,
            music = null,
            birthdate = LocalDateTime.of(1990, 1, 1, 0, 0),
            profileUpdatedAt = LocalDateTime.now().minusDays(1),
            isRead = true
        )
    }

}