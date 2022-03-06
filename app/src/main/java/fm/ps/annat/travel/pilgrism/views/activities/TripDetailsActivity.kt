package fm.ps.annat.travel.pilgrism.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.ActivityTripDetailsBinding
import fm.ps.annat.travel.pilgrism.keys.Activities

class TripDetailsActivity : BaseActivity() , View.OnClickListener {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityTripDetailsBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        changeStatusBarIconsColor(true)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_trip_details)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        initializeView()
        listener()
    }

    private fun initializeView(){
        binding.tripDetailsSwitch.addStatesFromStrings(listOf( "بيانات المغادرة" , "بيانات الوصول" ))
        binding.tripDetailsSwitch.selectState(1 , true)
    }

    //==============================================================================================
    // On Listener In Activity ...
    private fun listener(){
        binding.tripDetailsTripReservations.setOnClickListener( this )
        binding.tripDetailsTripStage.setOnClickListener( this )
    }

    override fun onClick(view: View?) {
        when(view){
            binding.tripDetailsTripReservations -> startNewActivity( Activities.TRIP_RESERVATION_ACTIVITY , null , false)
            binding.tripDetailsTripStage -> startNewActivity( Activities.TRIP_STAGE_ACTIVITY , null , false)
        }
    }
}