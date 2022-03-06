package fm.ps.annat.travel.pilgrism.adapter.recycler.trip.reservation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.adapter.recycler.notification.NotificationViewHolder
import fm.ps.annat.travel.pilgrism.databinding.ItemNotificationBinding
import fm.ps.annat.travel.pilgrism.databinding.ItemTripReservationBinding
import fm.ps.annat.travel.pilgrism.model.Notification
import fm.ps.annat.travel.pilgrism.model.Reservation

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/6/2022
 * @InTheHour : 16 : 43 : 47
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class TripReservationRecyclerAdapter (private var reservations: ArrayList<Reservation>) : RecyclerView.Adapter<TripReservationViewHolder>() {

    //==============================================================================================
    // Binding ...
    private lateinit var binding : ItemTripReservationBinding

    //==============================================================================================
    // On Create View Holder ...
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripReservationViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_trip_reservation , parent, false)
        return TripReservationViewHolder(binding)
    }

    //==============================================================================================
    // On Bind View Holder ...
    override fun onBindViewHolder(holder: TripReservationViewHolder, position: Int) {
        holder.createItem(reservations[position])
    }

    //==============================================================================================
    // get Item Count ...
    override fun getItemCount(): Int = reservations.size

}