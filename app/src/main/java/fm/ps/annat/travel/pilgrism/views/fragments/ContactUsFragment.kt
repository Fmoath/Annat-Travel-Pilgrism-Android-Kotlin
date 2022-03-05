package fm.ps.annat.travel.pilgrism.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.SupportMapFragment
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.FragmentContactUsBinding
import fm.ps.annat.travel.pilgrism.keys.Recyclers

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/5/2022
 * @InTheHour : 08 : 26 : 42
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ContactUsFragment : BaseFragment() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding: FragmentContactUsBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Fragment  ...
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_contact_us, container, false)
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
        replaceFragment(RecyclerFragment(Recyclers.RECYCLER_CONTACT_US) , "contact_us_recycler")
    }

    //==============================================================================================
    // Listener ...
    private fun listener() {

    }

    //==============================================================================================
    // More Function ...
    private fun replaceFragment(fragment: Fragment, tag: String) {
        replaceFragment(fragment , tag , R.id.fragment_contact_us_container , true)
    }
}