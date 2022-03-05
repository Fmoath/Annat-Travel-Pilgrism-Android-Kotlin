package fm.ps.annat.travel.pilgrism.adapter.recycler.contactus

import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.databinding.ItemContactUsClientBinding
import fm.ps.annat.travel.pilgrism.model.ContactUs

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/5/2022
 * @InTheHour : 11 : 25 : 49
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */

class ContactUsClientViewHolder(private var binding: ItemContactUsClientBinding) :
    RecyclerView.ViewHolder(binding.root) {

    //==============================================================================================
    // Model ...
    private lateinit var contactUs: ContactUs

    //==============================================================================================
    // Interface ...

    //==============================================================================================
    // On Create Item  ...
    fun createItem(contactUs: ContactUs) {
        this.contactUs = contactUs
        initializeItem()
    }

    //==============================================================================================
    // Initialize Item  ...
    private fun initializeItem() {
        initializeViews()
        listener()
    }

    private fun initializeViews() {
        binding.itemContactUsClientMessage.text = contactUs.getMessage()
    }

    //==============================================================================================
    // Listener In Views  ...
    private fun listener() {

    }
}