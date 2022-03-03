package fm.ps.annat.travel.pilgrism.views.activities

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.ActivitySplashScreenBinding
import fm.ps.annat.travel.pilgrism.keys.Activities

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : BaseActivity() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivitySplashScreenBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        hideStatusBar()
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_splash_screen)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        startNewActivity( Activities.MAIN_ACTIVITY , 1000 , null , true)
    }

}