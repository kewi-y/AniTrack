package ru.kewiapps.anitrack.domain.model.auth

data class AuthData(val accessToken: String, val refreshToken: String, val userId: String) {

}