package htnk128.kotlin.ddd.sample.address.domain.exception

import htnk128.kotlin.ddd.sample.address.domain.model.account.Account
import htnk128.kotlin.ddd.sample.shared.domain.exception.InvalidRequestException

/**
 * アカウント([Account])のコンテキストマッピングへの変換に失敗した場合に発生する例外。
 */
class AccountInvalidRequestException(
    message: String,
    cause: Throwable? = null
) : InvalidRequestException(message = message, cause = cause)
