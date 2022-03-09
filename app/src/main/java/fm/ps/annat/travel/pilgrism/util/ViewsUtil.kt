package fm.ps.annat.travel.pilgrism.util

import android.text.TextUtils
import android.view.View
import android.widget.EditText

/**
 * Created With Love For : Annat Tarvel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 03 : 56 : 12
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object ViewsUtil {

    //==============================================================================================
    // Enabled And Disabled View  ...
    fun disabledViews(vararg view: View){
        for (thisView in view) {
            thisView.isEnabled = false
        }
    }

    fun enabledViews(vararg view: View){
        for (thisView in view) {
            thisView.isEnabled = true
        }
    }
}