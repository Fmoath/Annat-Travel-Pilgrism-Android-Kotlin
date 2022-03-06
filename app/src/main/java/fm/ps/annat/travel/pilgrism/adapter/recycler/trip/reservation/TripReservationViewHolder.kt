package fm.ps.annat.travel.pilgrism.adapter.recycler.trip.reservation

import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.databinding.ItemTripReservationBinding
import fm.ps.annat.travel.pilgrism.model.Reservation

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/6/2022
 * @InTheHour : 16 : 38 : 29
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class TripReservationViewHolder(private var binding: ItemTripReservationBinding) :
    RecyclerView.ViewHolder(binding.root) {

    //==============================================================================================
    // Model ...
    private lateinit var reservation: Reservation

    //==============================================================================================
    // Interface ...

    //==============================================================================================
    // On Create Item  ...
    fun createItem(reservation: Reservation) {
        this.reservation = reservation
        initializeItem()
    }

    //==============================================================================================
    // Initialize Item  ...
    private fun initializeItem() {
        initializeViews()
        listener()
    }

    private fun initializeViews() {
        binding.itemTripReservationsType.text = reservation.getType()
        binding.itemTripReservationsPlace.text = reservation.getPlace()
        binding.itemTripReservationsPeriod.text = reservation.getPeriod()
        binding.itemTripReservationsCity.text = reservation.getCity()
    }

    //==============================================================================================
    // Listener In Views  ...
    private fun listener() {

    }
}