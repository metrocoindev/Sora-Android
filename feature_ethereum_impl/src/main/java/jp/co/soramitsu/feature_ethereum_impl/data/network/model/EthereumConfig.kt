package jp.co.soramitsu.feature_ethereum_impl.data.network.model

data class EthereumConfig(
    val scanUrl: String,
    val userName: String,
    val password: String,
    val url: String,
    val masterContract: String
)
