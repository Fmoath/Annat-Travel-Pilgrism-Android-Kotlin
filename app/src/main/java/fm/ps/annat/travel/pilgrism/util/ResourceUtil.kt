package fm.ps.annat.travel.pilgrism.util

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.drawable.Drawable

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/19/2022
 * @InTheHour : 18 : 55 : 15
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object ResourceUtil {

    //==============================================================================================
    // String ...
    fun getResourcesString(activity: Activity, id: Int): String {
        return activity.resources.getString(id)
    }

    //==============================================================================================
    // Color ...
    fun getResourcesColor(activity: Activity, id: Int): Int {
        return activity.resources.getColor(id)
    }

    //==============================================================================================
    // Drawable ...
    @SuppressLint("UseCompatLoadingForDrawables")
    fun getResourcesDrawable(activity: Activity?, id: Int): Drawable {
        return activity?.resources?.getDrawable(id , activity.theme)!!
    }
}