package fm.ps.annat.travel.pilgrism.model

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/6/2022
 * @InTheHour : 16 : 40 : 41
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class Reservation (private var id : Int, private var type : String, private var place: String ,  private var period: String ,  private var city: String ) {

    fun getId() : Int{
        return id
    }

    fun getType() : String{
        return type
    }

    fun getPlace() : String{
        return place
    }

    fun getPeriod() : String{
        return period
    }

    fun getCity() : String{
        return city
    }
}