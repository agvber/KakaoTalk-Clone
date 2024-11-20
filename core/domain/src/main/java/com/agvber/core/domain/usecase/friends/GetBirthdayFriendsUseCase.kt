package com.agvber.core.domain.usecase.friends

import com.agvber.core.domain.fake.UserFakeModel
import com.agvber.core.domain.model.User
import java.time.LocalDateTime
import javax.inject.Inject

class GetBirthdayFriendsUseCase @Inject constructor() {

    operator fun invoke(): List<User> {
        val now = LocalDateTime.now()

        return UserFakeModel()
            .get()
            .filter {
                it.birthdate.monthValue == now.monthValue &&
                        it.birthdate.dayOfMonth == now.dayOfMonth
            }

    }
}