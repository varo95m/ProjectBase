package com.rmygym.domain.model.request

import es.babel.easymvvm.core.constants.STRING_EMPTY

data class RequestRegisterModel(
    val email: String = STRING_EMPTY,
    val password: String = STRING_EMPTY,
    val name: String = STRING_EMPTY,
    val firstSurname: String = STRING_EMPTY,
    val secondSurname: String = STRING_EMPTY,
    val username: String = STRING_EMPTY,
    val age: String = STRING_EMPTY,
    val height: String = STRING_EMPTY,
    val weight: String = STRING_EMPTY,
    override val onSuccess: ((Any?) -> Unit)?,
    override val onError: ((Exception) -> Unit)?,
) : BaseRequest
