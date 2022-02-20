package fm.ps.annat.travel.pilgrism.views.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.FragmentOnBoardingBinding

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/19/2022
 * @InTheHour : 18 : 48 : 51
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class OnBoardingSliderFragment : BaseFragment() {

    //==============================================================================================
    // Binding ...
    private lateinit var itemOnBoardingBinding: FragmentOnBoardingBinding

    //==============================================================================================
    // Variable ...
    private lateinit var image : Drawable
    private lateinit var title : String
    private lateinit var description : String

    //==============================================================================================
    // On Create View  ...
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        itemOnBoardingBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_on_boarding , container, false)
        return itemOnBoardingBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initializeFragment()
    }

    //==============================================================================================
    // Initialize Fragment ...
    private fun initializeFragment() {
        image = getResourcesDrawable(requireArguments().getInt("image"))
        title = getResourcesString(requireArguments().getInt("title"))
        description = getResourcesString(requireArguments().getInt("description"))

        initializeView()
    }

    private fun initializeView() {
        setIntroData()
    }

    //==============================================================================================
    // Intro Data ...
    private fun setIntroData() {
        itemOnBoardingBinding.onBoardingImage.setImageDrawable(image)
        itemOnBoardingBinding.onBoardingTitle.text = title
        itemOnBoardingBinding.onBoardingDescription.text = description
    }
}