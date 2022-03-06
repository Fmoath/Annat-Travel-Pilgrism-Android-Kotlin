package fm.ps.annat.travel.pilgrism.adapter.recycler.trip.stage

import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.databinding.ItemStageDidNotStartBinding
import fm.ps.annat.travel.pilgrism.model.Stage

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/6/2022
 * @InTheHour : 18 : 05 : 44
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class TripStageDidNotStartViewHolder(private var binding: ItemStageDidNotStartBinding) :
    RecyclerView.ViewHolder(binding.root) {

    //==============================================================================================
    // Model ...
    private lateinit var stage: Stage

    //==============================================================================================
    // Interface ...

    //==============================================================================================
    // On Create Item  ...
    fun createItem(stage: Stage) {
        this.stage = stage
        initializeItem()
    }

    //==============================================================================================
    // Initialize Item  ...
    private fun initializeItem() {
        initializeViews()
        listener()
    }

    private fun initializeViews() {
        binding.stageDidNotStartTitle.text = stage.getTitle()
        binding.stageDidNotStartStartTime.text = stage.getStartTime()
        binding.stageDidNotStartEndTime.text = stage.getEndTime()
    }

    //==============================================================================================
    // Listener In Views  ...
    private fun listener() {

    }
}