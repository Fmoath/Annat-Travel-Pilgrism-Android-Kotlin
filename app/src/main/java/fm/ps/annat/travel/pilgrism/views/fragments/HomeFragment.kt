package fm.ps.annat.travel.pilgrism.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.davidmiguel.multistateswitch.State
import com.davidmiguel.multistateswitch.StateListener
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.FragmentHomeBinding
import fm.ps.annat.travel.pilgrism.keys.Locations

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/3/2022
 * @InTheHour : 11 : 17 : 33
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class HomeFragment : BaseFragment()  , StateListener {

    //==============================================================================================
    // Binding ...
    private lateinit var binding: FragmentHomeBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Fragment  ...
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
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
        binding.fragmentHomeSwitch.addStatesFromStrings(listOf( "بيانات الموقع" , "بيانات السفر" ))
        binding.fragmentHomeSwitch.selectState(1 , true)
    }

    //==============================================================================================
    // Listener ...
    private fun listener() {
        binding.fragmentHomeSwitch.addStateListener( this )
    }

    override fun onStateSelected(stateIndex: Int, state: State) {
        when (stateIndex){
            0 -> replaceFragment(LocationFragment(Locations.LOCATION_HOME) , "location fragment")
        }
    }

    //==============================================================================================
    // More Function ...
    private fun replaceFragment(fragment: Fragment, tag: String) {
        replaceFragment(fragment , tag , R.id.fragment_home_container , true)
    }
}