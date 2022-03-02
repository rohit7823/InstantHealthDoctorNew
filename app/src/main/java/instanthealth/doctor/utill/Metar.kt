import instanthealth.doctor.application.InstantHealth
import android.content.Context
import android.content.pm.PackageManager

object Metar {
    private var instantHealth: InstantHealth? = null
    operator fun get(key: String): String {
        return try {
            val ai = (instantHealth as Context)
                .packageManager
                .getApplicationInfo(
                    (instantHealth as Context)
                        .packageName,
                    PackageManager.GET_META_DATA
                )
            val bundle = ai.metaData
            bundle.getString(key)?:""
        } catch (e: PackageManager.NameNotFoundException) {
            ""
        }
    }
    fun initialize(app: InstantHealth) {
        Metar.instantHealth = app
    }
}