package fm.ps.annat.travel.pilgrism.adapter.recycler.trip.stage

import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.databinding.ItemStageCompletedBinding
import fm.ps.annat.travel.pilgrism.model.Stage

/**
 * Created With Love For : Annat Tarvel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/6/2022
 * @InTheHour : 17 : 57 : 47
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class TripStageCompletedViewHolder(private var binding: ItemStageCompletedBinding) :
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
        binding.stageCompletedNumber.text = stage.getId().toString()
        binding.stageCompletedTitle.text = stage.getTitle()
        binding.stageCompletedStartTime.text = "وقت البدء : " + stage.getStartTime()
        binding.stageCompletedEndTime.text ="وقت الإنتهاء : " + stage.getEndTime()
    }

    //==============================================================================================
    // Listener In Views  ...
    private fun listener() {

    }
}