package fm.ps.annat.travel.pilgrism.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.ActivityTripReservationsBinding

class TripReservationsActivity : AppCompatActivity() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityTripReservationsBinding

    //==============================================================================================
    // Variable ...


    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_trip_reservations)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){

    }

    //==============================================================================================
    // On Listener In Activity ...
}