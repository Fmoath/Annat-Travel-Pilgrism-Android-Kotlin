package fm.ps.annat.travel.pilgrism.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.ActivityTripReservationsBinding
import fm.ps.annat.travel.pilgrism.keys.Recyclers
import fm.ps.annat.travel.pilgrism.views.fragments.RecyclerFragment

class TripReservationsActivity : BaseActivity() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ActivityTripReservationsBinding

    //==============================================================================================
    // Variable ...


    //==============================================================================================
    // On Create Activity ...
    override fun onCreate(savedInstanceState: Bundle?) {
        changeStatusBarIconsColor( true )
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this , R.layout.activity_trip_reservations)
        initializeActivity()
    }

    //==============================================================================================
    // Initialize Activity ...
    private fun initializeActivity(){
        initializeViews()
    }

    private fun initializeViews(){
        replaceFragment(RecyclerFragment(Recyclers.RECYCLER_TRIP_RESERVATION) , "trip_reservation")
    }

    //==============================================================================================
    // More Functions ...
    private fun replaceFragment(fragment: Fragment, tag: String) {
        replaceFragment(fragment , tag , R.id.trip_reservations_trip_container , true)
    }

}