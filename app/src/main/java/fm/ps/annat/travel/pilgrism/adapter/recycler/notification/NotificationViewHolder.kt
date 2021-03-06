package fm.ps.annat.travel.pilgrism.adapter.recycler.notification

import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.databinding.ItemNotificationBinding
import fm.ps.annat.travel.pilgrism.model.Notification

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/5/2022
 * @InTheHour : 13 : 58 : 54
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class NotificationViewHolder(private var binding: ItemNotificationBinding) :
    RecyclerView.ViewHolder(binding.root) {

    //==============================================================================================
    // Model ...
    private lateinit var notification: Notification

    //==============================================================================================
    // Interface ...

    //==============================================================================================
    // On Create Item  ...
    fun createItem(notification: Notification) {
        this.notification = notification
        initializeItem()
    }

    //==============================================================================================
    // Initialize Item  ...
    private fun initializeItem() {
        initializeViews()
        listener()
    }

    private fun initializeViews() {
        binding.itemNotificationTitle.text = notification.getTitle()
        binding.itemNotificationDate.text = notification.getDate()
        binding.itemNotificationDescription.text = notification.getDescription()
    }

    //==============================================================================================
    // Listener In Views  ...
    private fun listener() {

    }
}