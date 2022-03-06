package fm.ps.annat.travel.pilgrism.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.ActivityTripStageBinding

class TripStageActivity : BaseActivity() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityTripStageBinding

    //==============================================================================================
    // Variable ...


    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_trip_stage)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){

    }

    //==============================================================================================
    // On Listener In Activity ...
}