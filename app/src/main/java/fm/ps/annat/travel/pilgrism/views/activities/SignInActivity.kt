package fm.ps.annat.travel.pilgrism.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.ActivitySignInBinding
import fm.ps.annat.travel.pilgrism.keys.Activities
import fm.ps.annat.travel.pilgrism.repository.SignInRepository

class SignInActivity : BaseActivity() , View.OnClickListener{

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivitySignInBinding

    //==============================================================================================
    // Variable ...
    private lateinit var signInRepository : SignInRepository


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
        signInRepository = SignInRepository( binding.signInPassport , binding.signInPassword)

        initializeViews()

        listener()
    }
    private fun initializeViews(){
        binding.signInProgress.visibility = View.GONE
    }


    //==============================================================================================
    // Listeners ...
    private fun listener(){
        binding.signIn.setOnClickListener( this )
    }
    override fun onClick(view: View?) {
        when (view) {
            binding.signIn -> signUp()
        }
    }

    //==============================================================================================
    // Sign In User ...
    private fun signUp(){
        val sign = signInRepository.signIn()
        disabledViews(binding.signInPassport , binding.signInPassword , binding.signIn)
        useAnimationWithView(binding.signIn , R.anim.fade_out)
        useAnimationWithView(binding.signInProgress , R.anim.fade_in)
        if(sign){
            startNavigationActivity( "تم تسجيل الدخول بنجاح" , "لقد تم تسجيل دخولك بنجاح نتمنى ان تقوةم بمراجعة بريدك الإلكتروني من اجل تنشيط حسابك" , "كل الإحترام والتقدير لكم" , "متابعة" , Activities.MAIN_ACTIVITY )
        }else{
            enabledViews(binding.signInPassport , binding.signInPassword , binding.signIn )
            useAnimationWithView(binding.signIn , R.anim.fade_in)
            useAnimationWithView(binding.signInProgress , R.anim.fade_out)
            Toast.makeText( this , "فشل في تسجيل الدخول" , Toast.LENGTH_LONG).show()
        }
    }

}