package com.arjanvlek.oxygenupdater.exceptions

/**
 * @author [Adhiraj Singh Chauhan](https://github.com/adhirajsinghchauhan)
 * @author [Arjan Vlek](https://github.com/arjanvlek)
 */
class SubmitUpdateInstallationException(message: String?) : OxygenUpdaterException(message) {
    companion object {
        private const val serialVersionUID = -629237813420662801L
    }
}
