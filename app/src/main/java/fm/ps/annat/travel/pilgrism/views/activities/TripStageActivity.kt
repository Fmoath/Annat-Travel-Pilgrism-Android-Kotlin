package fm.ps.annat.travel.pilgrism.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.ActivityTripStageBinding
import fm.ps.annat.travel.pilgrism.keys.Recyclers
import fm.ps.annat.travel.pilgrism.views.fragments.RecyclerFragment

class TripStageActivity : BaseActivity() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityTripStageBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        changeStatusBarIconsColor( true )
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_trip_stage)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        initializeViews()
    }

    private fun initializeViews(){
        replaceFragment( RecyclerFragment(Recyclers.RECYCLER_TRIP_STAGE) , "trip_stage_fragment")
    }

    //==============================================================================================
    // More Functions ...
    private fun replaceFragment(fragment: Fragment, tag: String) {
        replaceFragment(fragment , tag , R.id.trip_stage_trip_container , true)
    }
}