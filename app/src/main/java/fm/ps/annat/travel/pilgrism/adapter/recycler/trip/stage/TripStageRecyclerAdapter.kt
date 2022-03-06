package fm.ps.annat.travel.pilgrism.adapter.recycler.trip.stage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.*
import fm.ps.annat.travel.pilgrism.keys.Stages
import fm.ps.annat.travel.pilgrism.model.Stage

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/6/2022
 * @InTheHour : 18 : 07 : 24
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */

class TripStageRecyclerAdapter (private var stages: ArrayList<Stage>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    //==============================================================================================
    // Binding ...
    private lateinit var bindingCompleted : ItemStageCompletedBinding
    private lateinit var bindingUnderway : ItemStageUnderwayBinding
    private lateinit var bindingDidNotStart : ItemStageDidNotStartBinding

    override fun getItemViewType(position: Int): Int {
        return stages[position].getStatus()
    }

    //==============================================================================================
    // On Create View Holder ...
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        bindingCompleted = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_stage_completed , parent, false)
        bindingUnderway = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_stage_underway, parent, false)
        bindingDidNotStart = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_stage_did_not_start , parent, false)
        return when(viewType){
            Stages.STAGE_COMPLETED -> TripStageCompletedViewHolder(bindingCompleted)
            Stages.STAGE_UNDERWAY -> TripStageUnderwayViewHolder(bindingUnderway)
            else -> TripStageDidNotStartViewHolder(bindingDidNotStart)
        }
    }

    //==============================================================================================
    // On Bind View Holder ...
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is TripStageCompletedViewHolder -> (holder as TripStageCompletedViewHolder).createItem(stages[position])
            is TripStageUnderwayViewHolder -> (holder as TripStageUnderwayViewHolder).createItem(stages[position])
            is TripStageDidNotStartViewHolder -> (holder as TripStageDidNotStartViewHolder).createItem(stages[position])
        }
    }

    //==============================================================================================
    // get Item Count ...
    override fun getItemCount(): Int = stages.size

}