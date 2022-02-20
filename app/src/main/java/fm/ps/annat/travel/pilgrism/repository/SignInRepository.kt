package fm.ps.annat.travel.pilgrism.repository

import android.widget.EditText
import fm.ps.annat.travel.pilgrism.validator.Validation

/**
 * Created With Love For : Annat Tarvel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 04 : 03 : 19
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class SignInRepository(private var passport : EditText, private var password : EditText) {

    fun signIn() : Boolean{
        return signInDevice()
    }

    //==============================================================================================
    // Device Level Sign In Process ...
    private fun signInDevice() : Boolean{
        return validateSignInInformation()
    }

    //==============================================================================================
    // API Level Sign In Process ...


    //==============================================================================================
    // Validation ...
    private fun validateSignInInformation(): Boolean {
        val validation = Validation()
        validation.addEmptyValidator( passport , password )
        if (validation.isValid){
            validation.passportValidation( passport )
            validation.passwordValidation( password )
        }
        return validation.isValid
    }
}