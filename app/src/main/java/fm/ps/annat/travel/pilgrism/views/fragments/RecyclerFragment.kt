package fm.ps.annat.travel.pilgrism.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.adapter.recycler.contactus.ContactUsRecyclerAdapter
import fm.ps.annat.travel.pilgrism.adapter.recycler.notification.NotificationRecyclerAdapter
import fm.ps.annat.travel.pilgrism.adapter.recycler.trip.reservation.TripReservationRecyclerAdapter
import fm.ps.annat.travel.pilgrism.adapter.recycler.trip.stage.TripStageRecyclerAdapter
import fm.ps.annat.travel.pilgrism.databinding.FragmentRecyclerBinding
import fm.ps.annat.travel.pilgrism.keys.ContactUss
import fm.ps.annat.travel.pilgrism.keys.Recyclers
import fm.ps.annat.travel.pilgrism.keys.Stages
import fm.ps.annat.travel.pilgrism.model.ContactUs
import fm.ps.annat.travel.pilgrism.model.Notification
import fm.ps.annat.travel.pilgrism.model.Reservation
import fm.ps.annat.travel.pilgrism.model.Stage
import kotlin.properties.Delegates

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/3/2022
 * @InTheHour : 09 : 29 : 23
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class RecyclerFragment() : BaseFragment() , View.OnLayoutChangeListener {

    //==============================================================================================
    // Constructor ...
    constructor(type: Int) : this() {
        this.type = type
    }

    constructor(type: Int, id: String ) : this() {
        this.type = type
        this.id = id
    }

    //==============================================================================================
    // Binding ...
    private lateinit var binding: FragmentRecyclerBinding

    //==============================================================================================
    // View Model ...

    //==============================================================================================
    // interfaces ...

    //==============================================================================================
    // Arrays List ...
    private val contactUss : ArrayList<ContactUs> = ArrayList<ContactUs>()
    private val notifications : ArrayList<Notification> = ArrayList<Notification>()
    private val reservations : ArrayList<Reservation> = ArrayList<Reservation>()
    private val stages : ArrayList<Stage> = ArrayList<Stage>()

    //==============================================================================================
    // Adapter ...
    private lateinit var contactUsRecyclerAdapter: ContactUsRecyclerAdapter
    private lateinit var notificationRecyclerAdapter: NotificationRecyclerAdapter
    private lateinit var tripReservationRecyclerAdapter: TripReservationRecyclerAdapter
    private lateinit var tripStageRecyclerAdapter: TripStageRecyclerAdapter

    //==============================================================================================
    // Variable ...
    private lateinit var id: String
    private var type by Delegates.notNull<Int>()

    //==============================================================================================
    // On Create Fragment  ...
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recycler, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeFragment()
    }

    //==============================================================================================
    // Initialize Fragment ...
    private fun initializeFragment() {
        initializeView()
        listener()
    }

    private fun initializeView() {
        setRecycler()
    }

    //==============================================================================================
    // Listener ...
    private fun listener() {
        binding.fragmentRecycler.addOnLayoutChangeListener( this )
    }

    override fun onLayoutChange(p0: View?, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
        when (type) {
            Recyclers.RECYCLER_CONTACT_US -> binding.fragmentRecycler.scrollToPosition(contactUss.size-1)
            Recyclers.RECYCLER_NOTIFICATION -> binding.fragmentRecycler.scrollToPosition(0)
        }
    }

    //==============================================================================================
    // set Recycler ....
    private fun setRecycler() {
        when (type) {
            Recyclers.RECYCLER_CONTACT_US -> contactUsRecycler()
            Recyclers.RECYCLER_NOTIFICATION -> notificationRecycler()
            Recyclers.RECYCLER_TRIP_RESERVATION -> tripReservationRecycler()
            Recyclers.RECYCLER_TRIP_STAGE -> tripStageRecycler()
        }
    }

    //==============================================================================================
    // Contact Us Recycler ...
    private fun contactUsRecycler() {
        contactUss.clear()
        binding.fragmentRecycler.isNestedScrollingEnabled = false
        contactUss.add(ContactUs( 0 , "" , "اليوم الساعة 4:30 مساءاً" , ContactUss.CONTACT_US_DATE))
        contactUss.add(ContactUs( 0 , "السلام عليكم ورحمة الله وبركاته" , "" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "وعليكم السلام ورحمة الله وبركاته" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "لدي مشكلة في غرفتي في الفندق" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "الكهرباء متعطلة ولا تعمل وأنا في حاجتها" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "منذ متى بدأت هذه المشكلة" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "منذ ساعتين تقريباً" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "ولا يهمك أخي بإذن الله نتواصل مع إدارة الفندق وسنعمل على حلها في أقرب وقت ممكن .. نعتذر بالنيابة عنا وعن إدارة الفندق على هذا العطل وسنعمل على إصلاحه" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "أتمنى ان لا يطول هذذا العطل .. شكراً لكم" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "" , "اليوم الساعة 5:30 مساءاً" , ContactUss.CONTACT_US_DATE))
        contactUss.add(ContactUs( 0 , "السلام عليكم ورحمة الله وبركاته" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "الحمد لله قمنا بحل هذا العطل  ويمكنك الآن إستخدام الكهرباء  بدون أي مشاكل .. كل الإحترام لك .. شكراً لتفهمك" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "شكراً لكم بالفعل تم حلها .. جهد مبارك" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "العفو .. تقبل فائق إحترامنا وتقديرنا\nمع تحياتنا في مركز التواصل والدعم" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))

        contactUsRecyclerAdapter = ContactUsRecyclerAdapter(contactUss)
        initializeRecyclerLinearVerticalView(contactUsRecyclerAdapter , true)
    }

    //==============================================================================================
    // Contact Us Recycler ...
    private fun notificationRecycler() {
        notifications.clear()
        binding.fragmentRecycler.isNestedScrollingEnabled = false
        notifications.add(Notification( 0 , "ملاحظة" , "في حال واجهتكم مشكلة لا تتردوا في التواصل مع مركز الدعم والمساعدة من خلال المحادثة من خلال الضغط على أيقونة الدردشة بالأسفل" , "12-4-2022 , 3:40 PM"))
        notifications.add(Notification( 0 , "تنبيه" , "معتمرينا الكرام ,في حال ضياعك يمكنك متابعة مكانك من خلال الصفحة المخصصة لذلك والتي يمكنك الوصول لها من خلال أيقونة الموقع الموجودة في الأسفل" , "12-4-2022 , 3:40 PM"))
        notifications.add(Notification( 0 , "إنتهت مرحلة بفضل الله" , "معتمرنا الكريم ,نود إخبارك أنه بفضل الله إنتهت المرحلة الاولى من مراحل الرحلة وهي مرحلة النقل" , "12-4-2022 , 3:40 PM"))
        notifications.add(Notification( 0 , "إنطلاق مرحلة جديدة" , "المعتمر الكريم ,لقد بدأت مرحلة جديدة وهي مرحلة النقل من المطار إلى التسكين في الفندق" , "12-4-2022 , 3:40 PM"))
        notifications.add(Notification( 0 , "بدأت الرحلة" , "اليوم تبدأ بعون الله رحلتكم ف نرجو لكم التوفيق والسلامة في كل مناسككم" , "12-4-2022 , 3:40 PM"))
        notifications.add(Notification( 0 , "أهلاً بكم" , "معتمرينا الكرام أهلاً وسهلاً بكم على أرض المملكة العربية السعودية كما ونتشرف اليوم بخدمتكم" , "12-4-2022 , 3:40 PM"))

        notificationRecyclerAdapter = NotificationRecyclerAdapter(notifications)
        initializeRecyclerLinearVerticalView(notificationRecyclerAdapter , false)
    }

    //==============================================================================================
    // Trip Reservation Recycler ...
    private fun tripReservationRecycler() {
        reservations.clear()
        binding.fragmentRecycler.isNestedScrollingEnabled = false
        reservations.add(Reservation( 0 , "تبيت" , "فندق مكرمة" , "3 ليالي" , "مكة المكرمة"))
        reservations.add(Reservation( 0 , "تبيين" , "فندق الحلو" , "5 ليالي" , "المدينة المنورة"))
        reservations.add(Reservation( 0 , "نقل ومواصلات" , "الوطنية للمواصلات" , "3 ساعات" , "مكة المكرمة"))
        reservations.add(Reservation( 0 , "مزار" , "المسجد النبوي" , "4 ساعات" , "المدينة المنورة"))
        reservations.add(Reservation( 0 , "نقل ومواصلات" , "الرياض للمواصلات" , "ساعتين" , "الرياض"))
        reservations.add(Reservation( 0 , "تبييت" , "فندق النجمة" , "4 ليالي" , "الرياض"))
        tripReservationRecyclerAdapter = TripReservationRecyclerAdapter(reservations)
        initializeRecyclerLinearVerticalView(tripReservationRecyclerAdapter , false)
    }


    //==============================================================================================
    // Trip Stage Recycler ...
    private fun tripStageRecycler() {
        stages.clear()
        binding.fragmentRecycler.isNestedScrollingEnabled = false
        stages.add(Stage( 1 , "الإستقبال في المطار" , "12-4-2022 , 3:40 PM" , "12-4-2022 , 3:40 PM" , Stages.STAGE_COMPLETED))
        stages.add(Stage( 3 , "الوصول إلى فندق المدينة" , "12-4-2022 , 3:40 PM" , "12-4-2022 , 3:40 PM" , Stages.STAGE_COMPLETED))
        stages.add(Stage( 4 , "الوصول إلى مكة المكرمة" , "12-4-2022 , 3:40 PM" , "12-4-2022 , 3:40 PM" , Stages.STAGE_UNDERWAY))
        stages.add(Stage( 5 , "بدأ مناسك العمرة" , "12-4-2022 , 3:40 PM" , "12-4-2022 , 3:40 PM" , Stages.STAGE_DID_NOT_START))
        stages.add(Stage( 6 , "الوصول إلى فندق التبييت" , "12-4-2022 , 3:40 PM" , "12-4-2022 , 3:40 PM" , Stages.STAGE_DID_NOT_START))
        stages.add(Stage( 7 , "الذهاب للمزار السياحي" , "12-4-2022 , 3:40 PM" , "12-4-2022 , 3:40 PM" , Stages.STAGE_DID_NOT_START))
        tripStageRecyclerAdapter = TripStageRecyclerAdapter(stages)
        initializeRecyclerLinearVerticalView(tripStageRecyclerAdapter , false)
    }

    //==============================================================================================
    // Initialize Recycler Sort Type ...
    private fun initializeRecyclerLinearVerticalView(adapter: RecyclerView.Adapter<*>, viewToLastItem: Boolean) {
        val mLayoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.fragmentRecycler.layoutManager = mLayoutManager
        binding.fragmentRecycler.layoutManager!!.scrollToPosition(if (viewToLastItem) adapter.itemCount-1 else 0)
        binding.fragmentRecycler.itemAnimator = DefaultItemAnimator()

        binding.fragmentRecycler.adapter = adapter
    }

    private fun initializeRecyclerLinearHorizontalView(adapter: RecyclerView.Adapter<*>) {
        val linearLayoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        val mLayoutManager: RecyclerView.LayoutManager = linearLayoutManager
        binding.fragmentRecycler.layoutManager = mLayoutManager
        binding.fragmentRecycler.itemAnimator = DefaultItemAnimator()
        binding.fragmentRecycler.adapter = adapter
    }

    private fun initializeRecyclerGridView(adapter: RecyclerView.Adapter<*>, span: Int) {
        val mLayoutManager: RecyclerView.LayoutManager = GridLayoutManager(context, span)
        binding.fragmentRecycler.layoutManager = mLayoutManager
        binding.fragmentRecycler.itemAnimator = DefaultItemAnimator()
        binding.fragmentRecycler.adapter = adapter
    }
}