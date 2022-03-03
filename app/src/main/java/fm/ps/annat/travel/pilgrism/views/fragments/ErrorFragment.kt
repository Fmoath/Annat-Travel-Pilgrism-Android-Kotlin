package fm.ps.annat.travel.pilgrism.views.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.FragmentErrorBinding

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/3/2022
 * @InTheHour : 09 : 26 : 08
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ErrorFragment(private val image: Drawable, private val title: String, private val description: String) : BaseFragment() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding: FragmentErrorBinding

    //==============================================================================================
    // Variable ...

    //==============================================================================================
    // On Create Fragment  ...
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_error, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initializeFragment()
    }

    //==============================================================================================
    // Initialize Fragment ...
    private fun initializeFragment() {
        initializeView()
    }

    private fun initializeView() {
        binding.fragmentErrorImage.setImageDrawable(image)
        binding.fragmentErrorTitle.text = title
        binding.fragmentErrorDescription.text = description
    }
}