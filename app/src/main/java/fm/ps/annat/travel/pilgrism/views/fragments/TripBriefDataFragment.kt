package fm.ps.annat.travel.pilgrism.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.FragmentTripBriefDataBinding
import fm.ps.annat.travel.pilgrism.keys.Activities

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/5/2022
 * @InTheHour : 11 : 13 : 02
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class TripBriefDataFragment : BaseFragment() , View.OnClickListener{

    //==============================================================================================
    // Binding ...
    private lateinit var binding: FragmentTripBriefDataBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Fragment  ...
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_trip_brief_data, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeFragment()
    }

    //==============================================================================================
    // Initialize Fragment ...
    private fun initializeFragment() {
        initializeView()
        listener()
    }

    private fun initializeView() {

    }

    //==============================================================================================
    // Listener ...
    private fun listener() {
        binding.fragmentTripBriefDataTripDetails.setOnClickListener( this )
    }

    override fun onClick(view: View?) {
        if (view == binding.fragmentTripBriefDataTripDetails){
            startNewActivity( Activities.TRIP_DETAILS_ACTIVITY , null , false )
        }
    }
}