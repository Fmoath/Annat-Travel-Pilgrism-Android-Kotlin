package fm.ps.annat.travel.pilgrism.views.fragments

import android.content.Intent
import androidx.fragment.app.Fragment
import fm.ps.annat.travel.pilgrism.util.ActivityUtil
import fm.ps.annat.travel.pilgrism.util.DeviceUtil

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/19/2022
 * @InTheHour : 18 : 48 : 12
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
open class BaseFragment :Fragment() {

    //==============================================================================================
    // Activities ...
    fun restart() {
        ActivityUtil.restart(requireActivity())
    }
    fun startNewActivity(newActivity: String, extras: Intent?, clearStack: Boolean) {
        ActivityUtil.startNewActivity( requireActivity() , newActivity , extras, clearStack)
    }
    fun startNewActivity(newActivity: String, delay: Long, extras: Intent?, clearStack: Boolean) {
        ActivityUtil.startNewActivity(requireActivity() , newActivity , delay , extras, clearStack)
    }
    fun startNavigationActivity(title: String, description: String, hint: String, textButton: String, newActivity: String) {
        ActivityUtil.startNavigationActivity(requireActivity() , title , description , hint, textButton , newActivity)
    }

    //==============================================================================================
    // Device ...
    /** Key Board **/
    fun isKeyboardVisible() : Boolean {
        return DeviceUtil.isKeyboardVisible(requireActivity())
    }
    fun hideKeyboard() {
        DeviceUtil.hideKeyboard( requireActivity())
    }

    /** Status Bar **/
    fun hideStatusBar() {
        DeviceUtil.hideStatusBar(requireActivity())
    }
    fun setStatusBarTransparent() {
        DeviceUtil.setStatusBarTransparent(requireActivity())
    }
    fun changeStatusBarColor(color: Int) {
        DeviceUtil.changeStatusBarColor(requireActivity() , color)
    }
    fun changeStatusBarIconsColor(shouldChangeStatusBarTintToDark: Boolean) {
        DeviceUtil.changeStatusBarIconsColor( requireActivity() , shouldChangeStatusBarTintToDark)
    }

    /** Navigation Bar **/
    fun hideNavigationBar() {
        DeviceUtil.hideNavigationBar(requireActivity())
    }


}