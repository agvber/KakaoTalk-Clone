package com.agvber.core.domain.fake

import com.agvber.core.domain.model.User
import java.time.LocalDateTime

class UserFakeModel : FakeModel<List<User>>() {
    override fun build(): List<User> {
        return listOf(
            User(
                uid = "1",
                name = "Alice",
                stateMessage = "Feeling Happy",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Happy Song",
                    url = "https://example.com/music/happy_song.mp3"
                ),
                birthdate = LocalDateTime.of(1990, 1, 1, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(1),
                isRead = true
            ),
            User(
                uid = "2",
                name = "Bob",
                stateMessage = "Excited for the weekend!",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Weekend Vibes",
                    url = "https://example.com/music/weekend_vibes.mp3"
                ),
                birthdate = LocalDateTime.of(1992, 2, 2, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(2),
                isRead = false
            ),
            User(
                uid = "3",
                name = "Charlie",
                stateMessage = "Enjoying the moment",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Relaxing Beats",
                    url = "https://example.com/music/relaxing_beats.mp3"
                ),
                birthdate = LocalDateTime.of(1993, 3, 3, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(3),
                isRead = true
            ),
            User(
                uid = "4",
                name = "Dave",
                stateMessage = "Grateful for today",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Gratitude Playlist",
                    url = "https://example.com/music/gratitude_playlist.mp3"
                ),
                birthdate = LocalDateTime.of(1994, 4, 4, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(4),
                isRead = false
            ),
            User(
                uid = "5",
                name = "Eve",
                stateMessage = "Feeling Inspired",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Inspirational Tunes",
                    url = "https://example.com/music/inspirational_tunes.mp3"
                ),
                birthdate = LocalDateTime.of(1995, 5, 5, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(5),
                isRead = true
            ),
            User(
                uid = "6",
                name = "Frank",
                stateMessage = "Motivated!",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Motivation Mix",
                    url = "https://example.com/music/motivation_mix.mp3"
                ),
                birthdate = LocalDateTime.of(1996, 6, 6, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(6),
                isRead = false
            ),
            User(
                uid = "7",
                name = "Grace",
                stateMessage = "Having a great time",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Good Times",
                    url = "https://example.com/music/good_times.mp3"
                ),
                birthdate = LocalDateTime.of(1997, 7, 7, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(7),
                isRead = true
            ),
            User(
                uid = "8",
                name = "Hank",
                stateMessage = "Just chilling",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Chill Beats",
                    url = "https://example.com/music/chill_beats.mp3"
                ),
                birthdate = LocalDateTime.of(1998, 8, 8, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(8),
                isRead = false
            ),
            User(
                uid = "9",
                name = "Ivy",
                stateMessage = "Missing you",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Melancholic Melodies",
                    url = "https://example.com/music/melancholic_melodies.mp3"
                ),
                birthdate = LocalDateTime.of(1999, 9, 9, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(9),
                isRead = true
            ),
            User(
                uid = "10",
                name = "Jack",
                stateMessage = "Living life to the fullest",
                profileImageUrl = FAKE_IMAGE_URL,
                music = User.Music(
                    title = "Life's Anthem",
                    url = "https://example.com/music/lifes_anthem.mp3"
                ),
                birthdate = LocalDateTime.of(2000, 10, 10, 0, 0),
                profileUpdatedAt = LocalDateTime.now().minusDays(10),
                isRead = false
            )
        )
    }
}