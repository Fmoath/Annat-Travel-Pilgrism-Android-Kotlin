package fm.ps.annat.travel.pilgrism.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.adapter.pager.SliderPagerAdapter
import fm.ps.annat.travel.pilgrism.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : BaseActivity() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityOnBoardingBinding

    //==============================================================================================
    // Variables ...
    private var isItInTheLastInterface :Boolean = false

    //==============================================================================================
    // On Create ...
    override fun onCreate(savedInstanceState: Bundle?) {
        changeStatusBarIconsColor(true)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_on_boarding)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        initializeViews()
        listener()
    }

    private fun initializeViews(){
        binding.onBoardingGetStarted.visibility = View.GONE
    }

    private fun listener() {

    }
}