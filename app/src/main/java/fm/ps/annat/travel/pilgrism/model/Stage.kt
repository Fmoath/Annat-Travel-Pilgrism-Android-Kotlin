package fm.ps.annat.travel.pilgrism.model

/**
 * Created With Love For : Annat Tarvel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/6/2022
 * @InTheHour : 17 : 59 : 03
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class Stage(
    private var id: Int,
    private var title: String,
    private var startTime: String,
    private var endTime: String,
    private var status: Int
) {

    fun getId(): Int {
        return id
    }

    fun getTitle(): String {
        return title
    }

    fun getStartTime(): String {
        return startTime
    }

    fun getEndTime(): String {
        return endTime
    }

    fun getStatus(): Int {
        return status
    }

}