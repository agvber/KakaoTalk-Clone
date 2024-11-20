package com.agvber.core.domain.usecase.friends

import com.agvber.core.domain.fake.UserFakeModel
import com.agvber.core.domain.model.User
import javax.inject.Inject

class GetFriendsUseCase @Inject constructor() {

    operator fun invoke(): List<User> {
        return UserFakeModel().get()
    }
}