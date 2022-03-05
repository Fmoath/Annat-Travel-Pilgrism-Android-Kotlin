package fm.ps.annat.travel.pilgrism.adapter.recycler.contactus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.ItemContactUsClientBinding
import fm.ps.annat.travel.pilgrism.databinding.ItemContactUsCompanyBinding
import fm.ps.annat.travel.pilgrism.databinding.ItemContactUsDateBinding
import fm.ps.annat.travel.pilgrism.keys.ContactUss
import fm.ps.annat.travel.pilgrism.model.ContactUs

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/5/2022
 * @InTheHour : 11 : 32 : 06
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ContactUsRecyclerAdapter(private var contactuss: ArrayList<ContactUs>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    //==============================================================================================
    // Binding ...
    private lateinit var bindingClient : ItemContactUsClientBinding
    private lateinit var bindingCompany : ItemContactUsCompanyBinding
    private lateinit var bindingDate : ItemContactUsDateBinding

    override fun getItemViewType(position: Int): Int {
        return contactuss[position].getType()
    }

    //==============================================================================================
    // On Create View Holder ...
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        bindingClient = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_contact_us_client , parent, false)
        bindingCompany = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_contact_us_company , parent, false)
        bindingDate = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_contact_us_date , parent, false)
        return when(viewType){
            ContactUss.CONTACT_US_CLIENT -> ContactUsClientViewHolder(bindingClient)
            ContactUss.CONTACT_US_COMPANY -> ContactUsCompanyViewHolder(bindingCompany)
            else -> ContactUsDateViewHolder(bindingDate)
        }
    }

    //==============================================================================================
    // On Bind View Holder ...
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is ContactUsClientViewHolder -> (holder as ContactUsClientViewHolder).createItem(contactuss[position])
            is ContactUsCompanyViewHolder -> (holder as ContactUsCompanyViewHolder).createItem(contactuss[position])
            is ContactUsDateViewHolder -> (holder as ContactUsDateViewHolder).createItem(contactuss[position])
        }
    }

    //==============================================================================================
    // get Item Count ...
    override fun getItemCount(): Int = contactuss.size

}