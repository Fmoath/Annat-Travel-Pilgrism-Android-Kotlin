package fm.ps.annat.travel.pilgrism.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivitySignInBinding

    //==============================================================================================
    // Variable ...


    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_sign_in)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){

    }

    private fun initializeViews(){

    }

    //==============================================================================================
    // On Listener In Activity ...
}